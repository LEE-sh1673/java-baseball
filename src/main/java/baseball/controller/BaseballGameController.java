package baseball.controller;

import baseball.domain.PlayResult;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    BaseballService baseballService;

    PlayResult playResult;

    public BaseballGameController() {
        baseballService = new BaseballService();
        playResult = new PlayResult();
    }

    public void start() {
        processGame();
        OutputView.displayGameEndMessage();
    }

    private void processGame() {
        while (!playResult.isGameEnd()) {
            playResult = baseballService.playGame(InputView.askNumbers());
            OutputView.displayPlayResult(playResult.getResult());
        }
    }
}
