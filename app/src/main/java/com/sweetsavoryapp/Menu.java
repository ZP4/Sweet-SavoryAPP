package com.sweetsavoryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sweetsavoryapp.R.id.rv;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<FoodFormat> persons;


        persons = new ArrayList<>();
        Food foodList = new Food();
      //  HashMap<String, HashMap<String, HashMap<String,String>>> American = foodList.American;
       // HashMap<String,HashMap<String, String>> App =  American.get("Appitizer");
        //HashMap<String, String> app2 = App.get("Fred Mac N Cheese Balls");
        //System.out.println(app2.values());
        //Collection aaa= American.values();
        //ArrayList<String> hello = new ArrayList<String>(aaa);
        for (Map.Entry<String, HashMap<String, HashMap<String, String>>> all : foodList.American.entrySet()) {
            for (Map.Entry< String, HashMap<String, String>>b:all.getValue().entrySet() ) {
                persons.add(new FoodFormat(b.getValue().get("Title"), b.getValue().get("Description"),b.getValue().get("Price"), "5", "6"));
                //for (Map.Entry<String, String> c : b.getValue().entrySet()) {
                    //System.out.println(c.toString());
                    //persons.add(new FoodFormat(c.getValue(), "Hello", "123", "5", "6"));
                //}
            }



    }
        System.out.println(persons.get(1).getId().toString());
        FoodAdapter ff = new FoodAdapter(persons, getApplicationContext());
        rv.setAdapter(ff);


    }
}
