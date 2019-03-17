package com.example.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acivity);

        if (getIntent().hasExtra("com.example.quicklauncher.Something")) {
            TextView tv = findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.quicklauncher.Something");
            tv.setText(text);
        }
    }
}
