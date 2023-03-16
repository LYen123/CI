/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2023 All Rights Reserved.
 */

import org.junit.Test;

/**
 * @author lulu.huanglulu@alibaba-inc.com
 * @date 2023/03/10
 */

public class parkingLotTest {

    @Test
    public void given_1_when_add_1_car_then_success() {

        //given
        ParkingLot parkingLot = new ParkingLot(1);
        //when
        Car car = new Car();
        //then

        parkingLot.park(car);

    }

    @Test
    public void given_1_when_pick_1_car_then_success() {

        //given
        ParkingLot parkingLot = new ParkingLot(1);
        //when
        Car car = new Car();
        //then
        parkingLot.pick(car);

    }

    @Test(expected = Exception.class)
    public void given_1_when_add_2_car_then_failed() {

        //given
        ParkingLot parkingLot = new ParkingLot(1);
        //when
        Car car = new Car();
        Car car_2 = new Car();
        //then

        parkingLot.park(car);
        parkingLot.park(car_2);

    }

}