package com.robovitics.roboviticsmembers;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Harshit Maheshwari on 16-07-2017.
 */
public class GroupMembersFragment extends android.support.v4.app.Fragment {

    public static final String DUMMY_DATA = "{    \"members\" : [    {" +
            "\"name\" = \"Harshit Maheshwari\"," +
            "\"reg\" = \"16BCI0039\"," +
            "\"email\" = \"harshitmah98@gmail.com\"" +
            "\"year\" = 2    }    {" +
            "\"name\" = \"Aditya\"," +
            "\"reg\" = \"16BEC0559\"," +
            "\"email\" = \"adityasinha2498@gmail.com\"," +
            "\"phone\" = \"7530000107\"" +
            "\"year\" = 2    }    {" +
            "\"name\" = \"Vibhu Dagar\"," +
            "\"reg\" = \"16BCE2141\"," +
            "\"email\" = \"avibhu.dagar97@gmail.com\"," +
            "\"phone\" = \"7530003882\"," +
            "\"year\" = 2 } {" +
            "\"name\" = \"Mohit Pruthi\", " +
            "\"reg\" = \"16BEC0341\"," +
            "\"email\" = \"mohit.pruthi2016@vitstudent.ac.in\"," +
            "\"phone\" = \"9487561574\"," +
            "\"year\" = 2 } ] }";

    private ListView listView;

    private MemberDbHelper mDbHelper;

    private SQLiteDatabase database;

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
        mDbHelper = new MemberDbHelper(getContext());
        database = mDbHelper.getReadableDatabase();
        return rootView;
    }

    public void insertMembers(){
        ContentValues values = new ContentValues();
        values = null;

        try{
            JSONObject root = new JSONObject(DUMMY_DATA);
            JSONArray members = root.getJSONArray("members");

            for(int i=0;i<members.length();i++){
                values = null;
                JSONObject properties = members.getJSONObject(i);
                String name = properties.getString("name");
                String reg = properties.getString("reg");
                String email = properties.getString("email");
                String phone = properties.getString("phone");
                int year = properties.getInt("year");
                String year_str;
                switch(year){
                    case 1:
                        year_str = "First Year";
                        break;
                    case 2:
                        year_str = "Second Year";
                        break;
                    case 3:
                        year_str = "Third Year";
                        break;
                    case 4:
                        year_str = "Fourth Year";
                        break;
                    default:
                        year_str = "";
                        break;
                }
                values.put(Database_contract.Members_entry.MEMBERS_NAME,name);
                values.put(Database_contract.Members_entry.MEMBERS_REG,reg);
                values.put(Database_contract.Members_entry.MEMBERS_EMAIL,email);
                values.put(Database_contract.Members_entry.MEMBERS_PHONE,phone);
                values.put(Database_contract.Members_entry.MEMBERS_YEAR,year_str);

                database.insert(Database_contract.Members_entry.MEMBERS_TABLENAME,null,values);
            }

        }
        catch (JSONException e){
            Log.e("GroupMembersFragment", "Error parsing the dummy JSON data");
        }



    }

}
