package com.example.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button calculateBMI;
    EditText weight,height;
    TextView Res;
    String calc;
    String BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        weight=findViewById(R.id.editWeight);
        height=findViewById(R.id.editHeight);
        Res=findViewById(R.id.result);
        calculateBMI=findViewById(R.id.CalculateButton);


    }

    public void calculateBMI(View view) {
        Float h= Float.valueOf(height.getText().toString());
        Float w= Float.valueOf(weight.getText().toString())/100;

    //    float weightValue = Float.parseFloat(w);
      //  float heightValue = Float.parseFloat(h) / 100;

        float bmi = w / (h * h);
        if(bmi < 16){
            BMI = "severe weight loss";
        }else if(bmi < 18.5){
            BMI= "Under Weight";
        }else if(bmi >= 18.5 && bmi <= 24.9){
            BMI = "Normal";
        }else if (bmi >= 25 && bmi <= 29.9){
            BMI = "Overweight";
        }else{
            BMI = "obese";
        }
        calc = "Result  " + bmi + "  " + BMI;
        Res.setText(calc);

    }

    public void next2(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}