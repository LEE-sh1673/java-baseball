package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Referee {

    public String compare(final List<Integer> computer, final List<Integer> player) {
        Judgement judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);

        if (correctCount == 0) {
            return "낫싱";
        }
        int numberOfStrikes = getNumberOfStrikes(computer, player, judgement);
        int numberOfBalls = correctCount - numberOfStrikes;
        return String.format("%d볼 %d스트라이크", numberOfBalls, numberOfStrikes);
    }

    private static int getNumberOfStrikes(final List<Integer> computer,
        final List<Integer> player, final Judgement judgement) {

        return (int)IntStream.range(0, computer.size())
            .filter(i -> judgement.hasPlace(player, computer.get(i), i))
            .count();
    }
}
