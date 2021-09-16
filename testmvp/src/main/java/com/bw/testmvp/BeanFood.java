package com.bw.testmvp;

import java.util.List;

/**
 * @ClassName BeanFood
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 20:04
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */

public class BeanFood {
    public Integer ret;
    public List<DataBean> data;


    public static class DataBean {
        public String id;
        public String title;
        public String pic;
        public String collect_num;
        public String food_str;
        public Integer num;
    }
}
