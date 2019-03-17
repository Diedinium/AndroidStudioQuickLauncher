package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
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

        // Attempt to launch an activity outside of app.
        Button googleBtn = findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            //Runs on click
            @Override
            public void onClick(View v) {
                //Create a string that contains google address
                String google = "http://www.google.co.uk";
                //Parse as a URL
                Uri webaddress = Uri.parse(google);
                //Create an intent called gotoGoogle which uses Action view, and takes webaddress as param
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                //Checks to make sure that there is an app on the device that can run the intent
                //Checks by running a checkActivity to the package manager, returns true if app is available
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    //Starts the activity, taking gotoGoogle intent.
                    startActivity(gotoGoogle);
                }
            }
        });
    }
}
