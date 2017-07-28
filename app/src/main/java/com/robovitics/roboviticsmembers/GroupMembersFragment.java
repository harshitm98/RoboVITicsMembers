package com.robovitics.roboviticsmembers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Harshit Maheshwari on 16-07-2017.
 */
public class GroupMembersFragment extends android.support.v4.app.Fragment {

    private ListView listView;

    public GroupMembersFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_item, container, false);

        listView = (ListView)rootView.findViewById(R.id.list);
        final ArrayList<GroupMemberObject> words = new ArrayList<GroupMemberObject>();

        words.add(new GroupMemberObject("Harshit Maheshwari", "Second Year",R.mipmap.ic_launcher));
        words.add(new GroupMemberObject("Harshit Maheshwari", "Second Year",R.mipmap.ic_launcher));
        words.add(new GroupMemberObject("Harshit Maheshwari", "Second Year",R.mipmap.ic_launcher));
        words.add(new GroupMemberObject("Harshit Maheshwari", "Second Year",R.mipmap.ic_launcher));
        GroupMemberAdapter adapter = new GroupMemberAdapter(getContext(),words);

        listView.setAdapter(adapter);

        return rootView;
    }

}
