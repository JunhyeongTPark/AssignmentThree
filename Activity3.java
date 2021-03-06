package com.example.extstudent.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private Button buttonHome = null;
    private Button buttonActivity2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        this.buttonHome = (Button)findViewById(R.id.buttonHome);

        this.buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this
                        , com.example.extstudent.assignment3.MainActivity.class);
                startActivity(intent);
                Log.d("Testing Button Home", "Button Home Fired");
            }
        });

        this.buttonActivity2 = (Button) findViewById(R.id.buttonActivity2);

        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this
                        , com.example.extstudent.assignment3.Activity2.class);
                startActivity(intent);
                Log.d("Testing Button 3", "Button 3 Fired");
            }
        });
    }
}
