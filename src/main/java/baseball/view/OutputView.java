package baseball.view;

public class OutputView {

    private static final String GAME_END_MESSAGE = "숫자를 모두 맞추셨습니다! 게임 승리!";

    public static void displayPlayResult(final String result) {
        System.out.println(result);
    }

    public static void displayGameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }
}
