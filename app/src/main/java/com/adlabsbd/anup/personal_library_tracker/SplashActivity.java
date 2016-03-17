package com.adlabsbd.anup.personal_library_tracker;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*
         * Showing splash screen with a timer. This will be useful when you
         * want to show case your app logo / company
         */

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // This method will be executed once the timer is over
                // Start your app main activity

                Intent i = new Intent(SplashActivity.this,MainActivity.class );
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}
