package com.example.quicklauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find buttons and insert them into variables for reference
        Button secondActivityBtn = findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            //OnClick listener which is activated when button is clicked.
            @Override
            public void onClick(View v) {
                //Intent created, intent in this case is to load the second activity.
                Intent startIntent = new Intent(getApplicationContext(), SecondAcivity.class);
                //Pass information to SecondActivity intent.
                startIntent.putExtra("com.example.quicklauncher.Something", "Hello world!");
                //Load the second activity via startActivity.
                startActivity(startIntent);
            }
        });
    }
}
