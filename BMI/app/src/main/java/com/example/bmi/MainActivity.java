package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.lblOutput);
        //output.setTextColor(Color.RED);
        output.setTextSize(36);
        Button buttonBMI = (Button) findViewById(R.id.buttonBMI);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonBMI.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextHeight = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextWeight = (EditText) findViewById(R.id.editTextNumber2);
        if (v.getId() == R.id.buttonBMI) {
            double height = Double.parseDouble(editTextHeight.getText().toString());
            double weight = Double.parseDouble(editTextWeight.getText().toString());

            double bmi = weight / Math.pow(height/100.0, 2);
            if (bmi >= 24)
                output.setTextColor(Color.RED);
            else if (bmi < 18.5)
                output.setTextColor(Color.BLUE);
            else
                output.setTextColor(Color.GREEN);

            output.setText(String.format("%.2f", bmi));
        }
        else {
            editTextHeight.setText("");
            editTextWeight.setText("");
            output.setText("");
        }
    }
}