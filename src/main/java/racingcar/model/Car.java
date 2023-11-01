package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int currentPosition;
    private static final int CAN_MOVE_NUMBER = 4;

    public Car(String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    protected int createRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
