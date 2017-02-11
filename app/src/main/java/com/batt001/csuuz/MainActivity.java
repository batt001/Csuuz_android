package com.batt001.csuuz;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context applicationContext;

    ImageButton homeButton;
    ImageButton cityButton;

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applicationContext = getApplicationContext();

        setUpFloatingActionButton();
        setUpButtons();

    }

    private void setUpButtons()
    {
        homeButton = (ImageButton) findViewById(R.id.home_button);
        cityButton = (ImageButton) findViewById(R.id.city_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace with launching the other activity
                Toast.makeText(applicationContext, "Pressed home", Toast.LENGTH_LONG).show();

                Intent intentToLaunchHomeActivity = new Intent(applicationContext, HomeActivity.class);
                startActivity(intentToLaunchHomeActivity);
            }
        });

        cityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(applicationContext, "Pressed city", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setUpFloatingActionButton(){
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floating_action_button);
        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Click action
                // Launch new activity here
                // Intent intent = new Intent(applicationContext, NewMessageActivity.class);
                // startActivity(intent);
                Toast.makeText(applicationContext,"FAB pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
