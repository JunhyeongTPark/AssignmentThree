package com.example.extstudent.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonActivity2 = null;
    private Button buttonActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonActivity2 = (Button) findViewById(R.id.buttonActivity2);

        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this
                        , com.example.extstudent.assignment3.Activity2.class);
                startActivity(intent);
                Log.d("Testing Button 2", "Button 2 Fired");
            }
        });

        this.buttonActivity3 = (Button) findViewById(R.id.buttonActivity3);

        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this
                        , com.example.extstudent.assignment3.Activity3.class);
                startActivity(intent);
                Log.d("Testing Button 3", "Button 3 Fired");
            }
        });

    }
}
