package com.introtoandroid.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button button;
    //Intent i;
    private ConstraintLayout constraintLayout;

    private int REQUEST_CODE = 1;
    //public int RESPONSE_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.layoutID);

        //i = new Intent(getApplicationContext(), Main2Activity.class);

        button = findViewById(R.id.buttonView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, 1);
            }
        });


    }
    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){
            Bundle extras = data.getExtras();
            if(extras !=null){
                int imgId = extras.getInt("imgId");

                constraintLayout.setBackground(getDrawable(imgId));

            }
        }
    }
}
