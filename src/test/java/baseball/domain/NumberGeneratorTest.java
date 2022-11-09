package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

    @DisplayName("1~9의 임의의 숫자 생성 테스트")
    @Test
    void createRandomNumber_ShouldReturnRandomNumber() {
        int number = NumberGenerator.createRandomNumber();
        assertThat(number).isBetween(1, 9);
    }

    @DisplayName("중복되지 않는 임의의 3자리 숫자 생성 테스트")
    @RepeatedTest(10)
    void createNonDuplicateNumbers_ShouldReturnNonDuplicateNumbers() {
        List<Integer> numbers
            = NumberGenerator.createNonDuplicateNumbers();

        Set<Integer> nonDuplicateNumbers = new HashSet<>(numbers);
        assertThat(nonDuplicateNumbers.size()).isEqualTo(numbers.size());
    }
}