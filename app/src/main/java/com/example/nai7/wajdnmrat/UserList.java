package com.example.nai7.wajdnmrat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UserList extends AppCompatActivity {
    ListView List;
    CustomAdapter adapter;
    UserList CustomListView=null;
    ArrayList<ListModel> CustomListViewValuesArr= new ArrayList<ListModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
    }
}
