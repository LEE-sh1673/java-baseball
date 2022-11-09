package baseball.controller;

import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    BaseballService baseballService;

    String playResult;

    public BaseballGameController() {
        baseballService = new BaseballService();
        playResult = "";
    }

    public void start() {
        processGame();
        OutputView.displayGameEndMessage();
    }

    private void processGame() {
        while (!playResult.equals("0볼 3스트라이크")) {
            playResult = baseballService.playGame(InputView.askNumbers());
            OutputView.displayPlayResult(playResult);
        }
    }
}
