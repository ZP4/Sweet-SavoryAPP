package com.sweetsavoryapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Sweet N Savory");
        String[] name={"Brooklyn","Hispanic","The Middle East","Asia","Carribean","Europe","Africa","The Americas"};
        ArrayAdapter<String> Adapt=new ArrayAdapter<String>(this,R.layout.main_activity_list_view,name);

        ListView title=(ListView)findViewById(R.id.listView);
        title.setAdapter(Adapt);
    }
}
