package baseball.controller;

import static baseball.domain.NumberGenerator.createNonDuplicateNumbers;

import baseball.domain.Referee;
import baseball.view.InputView;
import java.util.List;

public class BaseballGameController {

    public void start() {
        Referee referee = new Referee();
        List<Integer> answer = createNonDuplicateNumbers();
        String playResult = "";

        while (!playResult.equals("0볼 3스트라이크")) {
            playResult = referee.compare(answer, InputView.askNumbers());
            System.out.println(playResult);
        }
        System.out.println("숫자를 모두 맞추셨습니다! 게임 승리!");
    }
}
