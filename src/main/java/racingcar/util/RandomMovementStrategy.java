package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovementStrategy implements MovementStrategy {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int FORWARD_THRESHOLD = 4;

    @Override
    public boolean shouldMove() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= FORWARD_THRESHOLD;
    }
}