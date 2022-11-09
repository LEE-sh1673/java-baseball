package baseball.controller;

import static baseball.domain.NumberGenerator.createNonDuplicateNumbers;

import baseball.domain.Referee;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballGameController {

    public void start() {
        Referee referee = new Referee();
        List<Integer> answer = createNonDuplicateNumbers();
        String playResult = "";

        while (!playResult.equals("0볼 3스트라이크")) {
            playResult = referee.compare(answer, InputView.askNumbers());
            OutputView.displayPlayResult(playResult);
        }
        OutputView.displayGameEndMessage();
    }
}
