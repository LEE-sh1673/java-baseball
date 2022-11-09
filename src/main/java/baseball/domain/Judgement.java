package baseball.domain;

import java.util.List;

public class Judgement {

    public int correctCount(final List<Integer> computer, final List<Integer> player) {
        return (int)player.stream()
            .filter(computer::contains)
            .count();
    }
}
