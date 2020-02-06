package com.introtoandroid.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {

    private ImageView supermoon;
    private ImageView waterfall;

    private int imgId;

    //private int RESPONSE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        supermoon = findViewById(R.id.imageView);
        waterfall = findViewById(R.id.imageView2);

        final Intent intent = new Intent();

        supermoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.supermoon;
                intent.putExtra("imgId", imgId);

                setResult(RESULT_OK, intent);
                finish();
            }
        });
        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.waterfall;
                intent.putExtra("imgId", imgId);

                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }


}
