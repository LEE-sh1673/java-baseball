package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Referee {

    private final Judgement judgement;

    public Referee() {
        this.judgement = new Judgement();
    }

    public PlayResult compare(final List<Integer> computer, final List<Integer> player) {
        int correctCount = judgement.correctCount(computer, player);
        int numberOfStrikes = getNumberOfStrikes(computer, player);
        int numberOfBalls = correctCount - numberOfStrikes;
        return new PlayResult(numberOfStrikes, numberOfBalls);
    }

    private int getNumberOfStrikes(final List<Integer> computer, final List<Integer> player) {
        return (int)IntStream.range(0, computer.size())
            .filter(i -> judgement.hasPlace(player, computer.get(i), i))
            .count();
    }
}
