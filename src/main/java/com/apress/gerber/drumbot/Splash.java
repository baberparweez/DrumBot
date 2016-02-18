package com.apress.gerber.drumbot;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.security.PublicKey;

/**
 * Created by LevelB on 06/01/16.
 */
// Splash screen activity
public class Splash extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Thread to run splash screen
        Thread myThread = new Thread(){
            @Override
            public void run(){
                    try {
                        sleep(3000); // Hold the splash screen for 3 seconds
                        Intent startMainScreen = new Intent (getApplicationContext(), DrumActivity.class);
                        startActivity(startMainScreen); // Start main activity
                        finish(); // Finish splash screen
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                }

            }
        };
        myThread.start(); // Start thread
    }
}
