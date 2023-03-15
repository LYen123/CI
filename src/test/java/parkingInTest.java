/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2023 All Rights Reserved.
 */

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author lulu.huanglulu@alibaba-inc.com
 * @date 2023/03/10
 */

public class parkingInTest  {

    @Test
    public void parkTest() {
        ParkService parkService = new ParkService();

        assertTrue(StringUtils.isNotEmpty(parkService.park("123")));
    }
    @Test
    public void pickUpTest() {
        ParkService parkService = new ParkService();

        assertTrue(StringUtils.isNotEmpty(parkService.park("456")));

    }

    public void should_parkWhenEnoughTest() {

    }

    public void pickUpWhenNeverParkedTest() {

    }

}