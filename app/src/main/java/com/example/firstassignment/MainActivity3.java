package com.example.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.firstassignment.model.Factory;
import com.example.firstassignment.model.Interface;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    Factory fac = new Factory();
    Interface obj=fac.getModel();
    ArrayList<String> arr;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arr2;
    ArrayAdapter<String> arrayAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        spinner1=findViewById(R.id.nutritionistSpinner);
        spinner2=findViewById(R.id.GymSpinner);
        arr = new ArrayList<>();
        for (int i=0;i<obj.getAll().size();i++){
            arr.add(obj.getAll().get(i).getName());
            arr.add("text");
        }
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arr);
        spinner1.setAdapter(arrayAdapter);
        arr2= new ArrayList<>();
        for (int i=0;i<obj.getGym().size();i++){
            arr.add(obj.getGym().get(i).getName());
        }
        arrayAdapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arr2);
        spinner1.setAdapter(arrayAdapter2);


    }

    public void next3(View view) {
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}