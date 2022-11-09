package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RefereeTest {

    static Referee referee = new Referee();
    static List<Integer> player = List.of(1, 2, 3);

    @DisplayName("컴퓨터의 수와 플레이어의 수를 비교하는 기능 테스트")
    @ParameterizedTest
    @CsvSource({"1,2,3,0볼 3스트라이크", "4,5,6,낫싱",
        "1,4,3,0볼 2스트라이크", "1,3,2,2볼 1스트라이크", "3,4,1,2볼 0스트라이크"})
    void compare_shouldReturnGameResult(Integer num1, Integer num2, Integer num3, String expected) {
        String actual = referee.compare(player, List.of(num1, num2, num3));
        assertThat(actual).isEqualTo(expected);
    }
}
