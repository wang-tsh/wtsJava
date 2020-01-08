package com.wts.www;


import lombok.extern.slf4j.Slf4j;

/**
 * @author wangtingshun
 * @Date 2019-12-27 - 11:00
 */
@Slf4j
public  class HelloWorld
{

    public static void main(String[] args) {
        log.info("Hello every body");
        int count = 5;
        float price =1.5F;
        float totle=count*price;
        log.debug("totle is " +totle);


    }
}
