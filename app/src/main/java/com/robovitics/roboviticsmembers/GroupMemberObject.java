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
    private String mPost;
    private String mYear;

    public GroupMemberObject(String vName, String vPost, String vYear){
        mName = vName;
        mPost = vPost;
        mYear = vYear;
    }

    public String getmName(){
        return mName;
    }

    public String getPost(){
        return mPost;
    }
    
    public String getYear(){
        return mYear;
    }

}
