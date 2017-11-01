package com.example.inclass2a;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;

public class DistanceConverter extends AppCompatActivity {
    EditText editText;
    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_converter);

        editText = findViewById(R.id.enter_distance_label);
        resultTextView = findViewById(R.id.result_label);

        findViewById(R.id.the_inches_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    Log.d("demo","Inches button clicked " + editText.getText().toString());
                    double value = Double.parseDouble(editText.getText().toString());
                    value = value * 39.3701;
                    resultTextView.setText("Result: " + value);
                } catch (NumberFormatException ex){
                    Toast.makeText(DistanceConverter.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });


        findViewById(R.id.the_feet_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d("demo","Feet button clicked");
                    double value = Double.parseDouble(editText.getText().toString());
                    value = value *3.28;
                    resultTextView.setText("Result: " + value);
                }catch(NumberFormatException ex){
                    Toast.makeText(DistanceConverter.this,"Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.the_to_miles_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d("demo","Miles button clicked");
                    double value = Double.parseDouble(editText.getText().toString());
                    value = value * 0.0006;
                    resultTextView.setText("Result: " + value);
                }catch (NumberFormatException ex){
                    Toast.makeText(DistanceConverter.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.the_clear_all_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d("demo","Clear all button clicked");
                    resultTextView.setText(null);
                }catch (NumberFormatException ex){
                    Toast.makeText(DistanceConverter.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
