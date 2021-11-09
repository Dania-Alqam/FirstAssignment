package com.example.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.firstassignment.model.Factory;
import com.example.firstassignment.model.Info;
import com.example.firstassignment.model.Interface;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button next;
    private EditText editName;
    private EditText editEmail;
    private EditText editPassword;
    private Spinner spinner;
    Factory fac = new Factory();
    Interface obj=fac.getModel();
    ArrayList<String> arr;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.nextButton);
        editName=findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);
        spinner=findViewById(R.id.genderSpinner);
        arr = new ArrayList<>();
        for (int i=0;i<obj.getGender().size();i++){
            arr.add(obj.getGender().get(i));
        }
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arr);
        spinner.setAdapter(arrayAdapter);


    }


    public void next(View view) {
        Thread thread = new Thread(new myThreadclass(10));
        thread.start();
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        Info info=new Info(editName.getText().toString(),editEmail.getText().toString(),editPassword.getText().toString(),spinner.getSelectedItem().toString());
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String data1 = gson.toJson(info);

        editor.putString("data", data1);
        editor.commit();
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    class myThreadclass implements Runnable {
        int seconds;

        public myThreadclass(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {

            for (int i = 0; i < seconds; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}