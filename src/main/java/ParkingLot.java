/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2023 All Rights Reserved.
 */

/**
 * @author lulu.huanglulu@alibaba-inc.com
 * @date 2023/03/16
 */
public class ParkingLot {

    private int capacity;

    public ParkingLot(int i) {
        capacity = i;
    }

    public void park(Car car) {
        if (capacity==0){
            throw new RuntimeException();
        }
        capacity--;
    }

    public void pick(Car car) {
    }
}