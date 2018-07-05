package com.example.library;

import android.text.TextUtils;
import android.util.Log;

public class LogUtils {
    private static final String TAG = "LogUtils";
    public static void info(String s){
        info(TAG, s);
    }


    public static void info(String tag, String s){
        if(TextUtils.isEmpty(tag) || TextUtils.isEmpty(s)) return;
        Log.i(tag, s);
    }
}
