package com.tutorials180.listadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView objectListView;
    private String [] myData={"Lahore","Gilgit","karachi","Multan"
    ,"Islamabad"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
        creatingAdapter();

    }

    private void creatingAdapter()
    {
        ArrayAdapter<String> objectArrayAdapter=new ArrayAdapter(
                this,android.R.layout.simple_list_item_1,myData
        );

        objectListView.setAdapter(objectArrayAdapter);
        objectListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int listPosition, long l) {

                /////////
                Intent objectIntent=new Intent(MainActivity.this, SecondPage.class);
                startActivity(objectIntent);


            }
        });
    }

    private void initializeVariables()
    {
        objectListView=findViewById(R.id.listView);
    }



}
