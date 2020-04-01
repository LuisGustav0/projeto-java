package com.arpia.tecnologia.meraki.consts;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class UtilJson {

    public static <T> List<T> strJsonToList(String json, Class<T> type) {
        return new Gson().fromJson(json,  new TypeToken<List<T>>() {}.getType());
    }
}
