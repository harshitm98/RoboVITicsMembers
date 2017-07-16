package com.robovitics.roboviticsmembers;

/**
 * Created by Harshit Maheshwari on 16-07-2017. This is just like the "Word" class that
 * returns the value to setText, setImage on the UI.
 */
public class DataModel {
    public int icon;
    public String name;

    /**
     * Constructor
     */
    public DataModel(int icon,String name){
        this.icon = icon;
        this.name = name;
    }
}
