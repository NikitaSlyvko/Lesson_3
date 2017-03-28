package com.example.nikita.lesson_3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Image extends Activity {
    private Button buttonBack;
    private Button buttonChange;
    private Button buttonPrevious;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        buttonBack = (Button) findViewById(R.id.button_back);
        buttonChange = (Button) findViewById(R.id.button_change);
        buttonPrevious = (Button) findViewById(R.id.button_previous);
        imageView = (ImageView) findViewById(R.id.image_view);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Intent intent = new Intent(context, MyActivity.class);
                startActivity(intent);
            }
        });

        changeImage(buttonChange);
        previousImage(buttonPrevious);
    }

    public void changeImage(View v) {
         imageView.setImageResource(R.drawable.android2);
    }

    public void previousImage(View v) {
        imageView.setImageResource(R.drawable.android);
    }
}