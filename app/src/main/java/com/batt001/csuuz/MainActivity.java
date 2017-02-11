package com.batt001.csuuz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context applicationContext;

    ImageButton home_button;
    ImageButton city_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applicationContext = getApplicationContext();
        setUpButtons();

    }

    private void setUpButtons()
    {
        home_button = (ImageButton) findViewById(R.id.home_button);
        city_button = (ImageButton) findViewById(R.id.city_button);

        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace with launching the other activity
                Toast.makeText(applicationContext, "Pressed home", Toast.LENGTH_LONG).show();

                Intent intentToLaunchHomeActivity = new Intent(applicationContext, HomeActivity.class);
                startActivity(intentToLaunchHomeActivity);
            }
        });

        city_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(applicationContext, "Pressed city", Toast.LENGTH_LONG).show();
            }
        });
    }
}
