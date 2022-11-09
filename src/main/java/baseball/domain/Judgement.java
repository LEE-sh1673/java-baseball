package baseball.domain;

import java.util.List;

public class Judgement {

    public boolean hasPlace(final List<Integer> numbers,
        final int number, final int index) {
        return numbers.get(index) == number;
    }

    public int correctCount(final List<Integer> computer, final List<Integer> player) {
        return (int) player.stream()
            .filter(computer::contains)
            .count();
    }
}
