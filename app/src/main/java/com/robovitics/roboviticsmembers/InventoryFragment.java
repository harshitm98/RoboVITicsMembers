package com.robovitics.roboviticsmembers;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Harshit Maheshwari on 16-07-2017.
 */
public class InventoryFragment extends Fragment{

    public InventoryFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_group_members, container, false);

        return rootView;
    }

}