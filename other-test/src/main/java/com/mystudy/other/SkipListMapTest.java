package com.mystudy.other;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author ：songdalin
 * @date ：2021-04-15 下午 01:32
 * @description：跳表
 * @modified By：
 * @version: 1.0
 */
public class SkipListMapTest {

    /**
     *
     * 跳表是有序的，但是比treeset消耗资源小
     *
     * 相当于在一层链表上加了多层链表，每一层记录一个区域里的最小值
     *
     * 用空间换时间
     *
     *
     *
     *
     * @param args
     */

    public static void main(String[] args){
        ConcurrentSkipListMap<Integer, String> skipListMap = new ConcurrentSkipListMap();
        skipListMap.put(1, "ss");
        skipListMap.put(5, "ddd");
        skipListMap.put(32, "ss");
        skipListMap.put(6, "ss");
        skipListMap.put(54, "ss");
        skipListMap.put(3, "ss");
        skipListMap.put(9, "ss");
        skipListMap.put(2, "ss");
        skipListMap.put(0, "ss");
        skipListMap.put(8, "ss");

        for (Map.Entry<Integer, String> en : skipListMap.entrySet()){
            System.out.println(en);
        }
    }
}
