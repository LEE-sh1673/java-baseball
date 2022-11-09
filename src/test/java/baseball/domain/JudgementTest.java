package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class JudgementTest {

    static Judgement judgement = new Judgement();

    static List<Integer> computer = List.of(1, 2, 3);

    @DisplayName("몇 개의 숫자가 같은지 구하는 기능 테스트")
    @ParameterizedTest
    @MethodSource("generateData")
    void correctCount_ShouldGetSameValueCount(List<Integer> player, Integer expected) {
        assertThat(
            judgement.correctCount(computer, player)
        ).isEqualTo(expected);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
            Arguments.of(Arrays.asList(1, 2, 3), 3),
            Arguments.of(Arrays.asList(4, 2, 3), 2),
            Arguments.of(Arrays.asList(4, 1, 7), 1)
        );
    }

    @DisplayName("특정 자리에 특정 숫자가 있는지 구하는 기능 테스트")
    @ParameterizedTest
    @CsvSource({"2,1,true", "1,1,false", "3,2,true"})
    void hasPlace_ShouldReturnTrueNumberInPlace(Integer number, Integer index,
        boolean expected) {

        assertThat(
            Judgement.hasPlace(computer, number, index)
        ).isEqualTo(expected);
    }

}
