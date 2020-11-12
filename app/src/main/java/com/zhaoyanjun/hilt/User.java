package com.zhaoyanjun.hilt;

import javax.inject.Inject;

/**
 * @author yanjun.zhao
 * @time 2020/11/11 9:02 PM
 * @desc
 */
public class User {

    int id;
    String name;

    @Inject
    User(){
       id = 100 ;
       name = "zhaoyanjun" ;
    }

}
