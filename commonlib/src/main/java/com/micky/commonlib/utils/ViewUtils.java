package com.micky.commonlib.utils;


public class ViewUtils {
    /**防止连续点击*/
    private static long lastClickTime;
    public static boolean isFastClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if ( timeD > 0 && timeD < 500) {
            return true;
        }
        lastClickTime = time;
        return false;
    }
}
