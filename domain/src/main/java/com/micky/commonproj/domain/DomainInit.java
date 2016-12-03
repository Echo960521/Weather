package com.micky.commonproj.domain;

import android.content.Context;

import com.micky.commonproj.domain.db.DBCore;


public class DomainInit {

    public static void init(Context context) {
        initDatabase(context);
    }

    /**
     * 初始化数据库
     * @param context
     */
    public static void initDatabase(Context context) {
        DBCore.init(context);
        DBCore.enableQueryBuilderLog();
    }
}
