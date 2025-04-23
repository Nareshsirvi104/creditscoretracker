package com.example.n;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText scoreInput;
    Button saveBtn;
    TextView scoreDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreInput = (EditText) findViewById(R.id.scoreInput);
        saveBtn = (Button) findViewById(R.id.saveBtn);
        scoreDisplay = (TextView) findViewById(R.id.scoreDisplay);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = scoreInput.getText().toString();
                if (!input.isEmpty()) {
                    scoreDisplay.setText("Your Credit Score: " + input);
                } else {
                    scoreDisplay.setText("Please enter a valid score.");
                }
            }
        });
    }}

