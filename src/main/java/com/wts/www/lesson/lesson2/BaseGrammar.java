package com.wts.www.lesson.lesson2;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;

/**
 * @author wangtingshun
 * @Date 2020-01-08 - 16:11
 */
@Slf4j
public class BaseGrammar {
    public static void main(String[] args){
        //样例TO类型提升
        int count = 5;
        float price =1.5F;
        float total=count*price;
        log.debug("Total is " +total);
        //样例TO包装类
        Integer integer1 =1;
        //Integer integerBox =new Integer(1);  提示无意义的装箱,IDE提供的内容
        //手动装箱与拆箱
        Integer integerBox =new Integer(1);
        int unBox =integerBox.intValue();
        log.debug("integerBox is " +integerBox );
        log.debug("unBox is " +unBox );
        //自动拆箱与装箱
        Integer autoBox =1; //等于 Integer autoBox =Integer.valueOf(1)
        int autoUnBox = autoBox; //等于 Integer autoUnBox =Integer.intValue()
        log.debug("autoBox is " +autoBox );
        log.debug("autoUnBox is " +autoUnBox );
        int i=-10,j;
        j=i>>1;
        Integer jger =j;
        log.debug("bitcount is"+Integer.toBinaryString(j));
        byte min =-128;
        log.debug("byte min is"+Integer.toBinaryString(min));
        log.debug("j is "+j);
        int[] array =(int [])Array.newInstance(int.class,6);
        log.debug("array 0 is "+ array[0]);
    }
}
