package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

    @DisplayName("1~9의 임의의 숫자 생성 테스트")
    @Test
    void createRandomNumber_ShouldReturnRandomNumber() {
        int number = NumberGenerator.createRandomNumber();
        assertThat(number).isBetween(1, 9);
    }

}