package com.robovitics.roboviticsmembers;

import android.provider.BaseColumns;

/**
 * Created by Harshit Maheshwari on 28-07-2017.
 */
public class Database_contract implements BaseColumns {

    public static class Members_entry{

        /**
         * Table constants that will be used for creating and
         * putting the values in the table.
         */
        public final static String MEMBERS_TABLENAME = "members";
        public final static String MEMBERS_ID = "_ID";
        public final static String MEMBERS_NAME = "name";
        public final static String MEMBERS_EMAIL = "email";
        public final static String MEMBERS_REG = "registration";
        public final static String MEMBERS_PHONE = "phone_number";
        public final static String MEMBERS_YEAR = "year";


    }

}
