package com.robovitics.roboviticsmembers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.robovitics.roboviticsmembers.Database_contract.Members_entry;

/**
 * Created by Harshit Maheshwari on 28-07-2017.
 */
public class MemberDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "members.db";

    public static int DATABASE_VERSION = 1;

    public MemberDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final String create_member_table = "CREATE TABLE " + Members_entry.MEMBERS_NAME + " ("
            + Members_entry.MEMBERS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + Members_entry.MEMBERS_REG + " TEXT NOT NULL, "
            + Members_entry.MEMBERS_NAME + " TEXT NOT NULL, "
            + Members_entry.MEMBERS_EMAIL + "TEXT NOT NULL, "
            + Members_entry.MEMBERS_PHONE + "INTEGER NOT NULL DEFAULT 0, "
            + Members_entry.MEMBERS_YEAR + " TEXT NOT NULL)";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_member_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
