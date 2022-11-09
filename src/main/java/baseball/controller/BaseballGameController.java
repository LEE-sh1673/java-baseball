package baseball.controller;

import static baseball.domain.NumberGenerator.createNonDuplicateNumbers;

import baseball.domain.Referee;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballGameController {

    public void start() {
        Referee referee = new Referee();
        List<Integer> answer = createNonDuplicateNumbers();
        String playResult = "";

        while (!playResult.equals("0볼 3스트라이크")) {
            playResult = referee.compare(answer, askNumbers());
            System.out.println(playResult);
        }
        System.out.println("숫자를 모두 맞추셨습니다! 게임 승리!");
    }

    private static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해주세요: ");
        String input = Console.readLine();
        return Arrays.stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
