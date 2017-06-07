package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 香葱 on 2017/6/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public  Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
