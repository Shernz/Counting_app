package com.example.count;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = (TextView) findViewById(R.id.curCount);
        text.setText(String.valueOf(value));
        Button b1 = (Button)findViewById(R.id.button);
        Button reset = (Button)findViewById(R.id.reset);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value++;
                text.setText(String.valueOf(value));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 0;
                text.setText(String.valueOf(value));
            }
        });
    }
}
