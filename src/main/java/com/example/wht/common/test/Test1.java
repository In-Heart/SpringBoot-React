package com.example.wht.common.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/7/16-15:00
 * @description
 */
public class Test1 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = twoSum(a,6);
        for (int i = b.length-1; i >= 0; i--){
            System.out.println(a[b[i]]);
        }
    }

    public static int[] twoSum(int[] mun, int target){
        Map<Integer, Integer> table = new HashMap<>();
        for (int i=0; i<mun.length;++i){
            Integer value = table.get(target-mun[i]);
            if(value != null){
                return new int[]{i, value};
            }
            table.put(mun[i], i);
        }
        return null;
    }
}
