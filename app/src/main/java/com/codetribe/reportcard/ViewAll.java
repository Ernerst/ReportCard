package com.codetribe.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewAll extends AppCompatActivity {

    ListView lvmain;
    ArrayAdapter<Student>adapter;
     List<Student> data;

    RCDatabase rcDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        lvmain=(ListView)findViewById(R.id.lvmain);


        rcDatabase= new RCDatabase(this);


        data=rcDatabase.getAllStudents();




        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);

        lvmain.setAdapter(adapter);


    }
}
