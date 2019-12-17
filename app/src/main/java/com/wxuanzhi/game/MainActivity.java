package com.wxuanzhi.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bLeft = findViewById(R.id.button_left);
        bLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        findViews();


    }

    private void findViews() {
        findViewById(R.id.button_left).setOnClickListener(this);
        findViewById(R.id.button_right).setOnClickListener(this);
        findViewById(R.id.button_up).setOnClickListener(this);
        findViewById(R.id.button_down).setOnClickListener(this);
    }

    public void left(View view) {

    }

    public void right(View view) {

    }

    public void up(View view) {

    }

    public void down(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_up:
                Log.d("MainActivity", "onClick:UP");
                break;
            case R.id.button_down:
                Log.d("MainActivity", "onClick:UP");
                break;
            case R.id.button_left:
                Log.d("MainActivity", "onClick:UP");
                break;
            case R.id.button_right:
                Log.d("MainActivity", "onClick:UP");
                break;
        }
    }
}
