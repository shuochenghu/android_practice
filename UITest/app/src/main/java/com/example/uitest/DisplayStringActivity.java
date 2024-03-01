package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_display_string);

        Intent intent = getIntent();
        String outputString = intent.getStringExtra("userInputString");
        TextView txvShow = (TextView) findViewById(R.id.showString);
        txvShow.setText(outputString);
    }
}
