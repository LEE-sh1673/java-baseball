package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {
    public static int createRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
