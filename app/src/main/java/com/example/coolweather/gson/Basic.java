package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city") // 运用SerializedName(Gson)建立JSON字段和Java字段的映射关系，因为有的不太适合直接Java命名
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
