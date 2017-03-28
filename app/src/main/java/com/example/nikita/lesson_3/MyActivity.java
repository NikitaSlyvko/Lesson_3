package com.example.nikita.lesson_3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {
    private TextView viewClick;
    private Button buttonFirst;
    private Button buttonSecond;
    private Button buttonThird;
    private Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        viewClick = (TextView) findViewById(R.id.view_click_button);
        buttonFirst = (Button) findViewById(R.id.button_1);
        buttonSecond = (Button) findViewById(R.id.button_2);
        buttonThird = (Button) findViewById(R.id.button_3);
        buttonResult = (Button) findViewById(R.id.button_solution);

        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewClick.setText("Was clicked the FIRST button");
            }
        });

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewClick.setText("Was clicked the SECOND button");
            }
        });

        buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewClick.setText("Was clicked the THIRD button");
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Intent intent = new Intent(context, Image.class);
                startActivity(intent);
            }
        });
    }
}