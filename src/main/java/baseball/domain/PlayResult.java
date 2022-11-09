package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayResult {

    private final int numberOfStrikes;

    private final int numberOfBalls;

    private boolean isNothing;

    public PlayResult() {
        this(0, 0);
    }

    public PlayResult(final int numberOfStrikes, final int numberOfBalls) {
        this.numberOfStrikes = numberOfStrikes;
        this.numberOfBalls = numberOfBalls;
        this.isNothing = numberOfStrikes == 0 && numberOfBalls == 0;
    }

    public boolean isNothing() {
        return isNothing;
    }

    public boolean isGameEnd() {
        return numberOfStrikes == 3;
    }

    public String getResult() {
        if (isNothing()) {
            return "낫싱";
        }
        List<String> results = new ArrayList<>();

        if (numberOfBalls != 0) {
            results.add(String.format("%d볼", numberOfBalls));
        }
        if (numberOfStrikes != 0) {
            results.add(String.format("%d스트라이크", numberOfStrikes));
        }
        return String.join(" ", results);
    }
}
