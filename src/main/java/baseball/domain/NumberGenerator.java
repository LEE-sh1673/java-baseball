package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    private static final int MIN_NUMBER = 1;

    private static final int MAX_NUMBER = 9;

    private static final int MAX_NUMBERS_SIZE = 3;

    public static List<Integer> createNonDuplicateNumbers() {
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < MAX_NUMBERS_SIZE) {
            addNonDuplicateNumberTo(numbers);
        }
        return numbers;
    }

    private static void addNonDuplicateNumberTo(final List<Integer> numbers) {
        int number = createRandomNumber();

        if (!numbers.contains(number)) {
            numbers.add(number);
        }
    }

    public static int createRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}
