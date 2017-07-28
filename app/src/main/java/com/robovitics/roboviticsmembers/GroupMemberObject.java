package com.robovitics.roboviticsmembers;

/**
 * Created by Harshit Maheshwari on 17-07-2017.
 */
public class GroupMemberObject {
    /**
     * Name of the member
     * PostStatus or core-committee or more like that
     * Year(Fourth,Third or Second)
     */
    private String mName;
    private int mImg = 0;
    private String mYear;

    public GroupMemberObject(String vName, String vYear, int vImg){
        mName = vName;
        mImg = vImg;
        mYear = vYear;
    }

    public String getmName(){
        return mName;
    }

    public int getImg(){
        return mImg;
    }

    public String getYear(){
        return mYear;
    }

}
