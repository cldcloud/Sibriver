package ru.alex.sibrivertest.ormlitedatabase.helper;


import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;

public class HelperFactory {

    private static DatabaseHelper databaseHelper;

    public static DatabaseHelper getDatabaseHelper(){
        return databaseHelper;
    }

    public static void setDatabaseHelper(Context context){
        databaseHelper = OpenHelperManager.getHelper(context, DatabaseHelper.class);
    }

    public static void releaseHelper(){
        OpenHelperManager.releaseHelper();
        databaseHelper = null;
    }

}
