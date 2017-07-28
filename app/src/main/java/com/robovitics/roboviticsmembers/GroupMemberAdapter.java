package com.robovitics.roboviticsmembers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harshit Maheshwari on 17-07-2017.
 */
public class GroupMemberAdapter extends ArrayAdapter<GroupMemberObject>{


    public GroupMemberAdapter(Context context, ArrayList<GroupMemberObject> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        if(listItem == null){
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.fragment_group_members,parent,false);
        }

        GroupMemberObject object = getItem(position);

        ImageView imageView = (ImageView)listItem.findViewById(R.id.groupmember_img);
        imageView.setImageResource(object.getImg());

        TextView textView1 = (TextView)listItem.findViewById(R.id.groupmember_name);
        textView1.setText(object.getmName());

        TextView textView2 = (TextView)listItem.findViewById(R.id.groupmember_year);
        textView2.setText(object.getYear());


        return listItem;
    }
}
