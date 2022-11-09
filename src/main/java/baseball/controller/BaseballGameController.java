package baseball.controller;

import static baseball.domain.NumberGenerator.createNonDuplicateNumbers;

import baseball.domain.Referee;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballGameController {

    private final Referee referee;

    private String playResult;

    public BaseballGameController() {
        referee = new Referee();
        playResult = "";
    }

    public void start() {
        processGame();
        OutputView.displayGameEndMessage();
    }

    private void processGame() {
        List<Integer> answer = createNonDuplicateNumbers();

        while (!playResult.equals("0볼 3스트라이크")) {
            playResult = referee.compare(answer, InputView.askNumbers());
            OutputView.displayPlayResult(playResult);
        }
    }
}
