/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2023 All Rights Reserved.
 */

import java.util.Map;
import java.util.Random;

import com.taobao.diamond.shaded.com.google.common.collect.Maps;

/**
 * @author lulu.huanglulu@alibaba-inc.com
 * @date 2023/03/10
 */
public class ParkService {

    private Map<String, Integer> info = Maps.newHashMap();

    public String park(String carNum) {

        Random random = new Random();
        Integer infoNum = random.nextInt(10);
        info.put(carNum, infoNum);
        return infoNum.toString();
    }

    public String parkOut(String infoNum) {

        return String.valueOf(info.containsKey(infoNum));
    }

}