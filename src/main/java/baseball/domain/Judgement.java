package baseball.domain;

import java.util.List;

public class Judgement {

    public static boolean hasPlace(final List<Integer> numbers,
        final int number, final int index) {
        return numbers.indexOf(number) == index;
    }

    public int correctCount(final List<Integer> computer, final List<Integer> player) {
        return (int) player.stream()
            .filter(computer::contains)
            .count();
    }
}
