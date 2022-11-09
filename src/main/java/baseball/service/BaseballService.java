package baseball.service;

import static baseball.domain.NumberGenerator.createNonDuplicateNumbers;

import baseball.domain.PlayResult;
import baseball.domain.Referee;
import java.util.List;

public class BaseballService {

    private final Referee referee;

    private List<Integer> answer;

    public BaseballService() {
        this.referee = new Referee();
        this.answer = createNonDuplicateNumbers();
    }

    public PlayResult playGame(final List<Integer> player) {
        return referee.compare(answer, player);
    }
}
