package com.apress.gerber.drumbot;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class DrumActivity extends Activity {

    // Sound variables
    // View variables used define ImageButton instances
    View button1;
    View button2;
    View button3;
    View button4;
    View button5;
    View button6;
    View button7;
    View button8;
    View button9;
    View button10;
    View button11;
    View button12;

    // soundPool variable defines a SoundPool
    SoundPool soundPool;

    // int variables define sound integer instances
    int drum1 = 0;
    int snare1 = 0;
    int hat1 = 0;
    int dub1 = 0;
    int dub2 = 0;
    int dub3 = 0;
    int dub4 = 0;
    int dub5 = 0;
    int dub6 = 0;
    int lick1 = 0;
    int lick2 = 0;
    int loop1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum);

        // soundPool public constructors (int maxStreams, int streamType, int srcQuality)
        soundPool = new SoundPool(99, AudioManager.STREAM_MUSIC,0);

        // Individual sound method definitions
        drum1 = soundPool.load(this, R.raw.drum_1, 1);
        snare1 = soundPool.load(this, R.raw.snare_1, 1);
        hat1 = soundPool.load(this, R.raw.hat_1, 1);
        dub1 = soundPool.load(this, R.raw.dub_1, 1);
        dub2 = soundPool.load(this, R.raw.dub_2, 1);
        dub3 = soundPool.load(this, R.raw.dub_3, 1);
        dub4 = soundPool.load(this, R.raw.dub_4, 1);
        dub5 = soundPool.load(this, R.raw.dub_5, 1);
        dub6 = soundPool.load(this, R.raw.dub_6, 1);
        lick1 = soundPool.load(this, R.raw.lick_1, 1);
        lick2 = soundPool.load(this, R.raw.lick_2, 1);
        loop1 = soundPool.load(this, R.raw.loop_1, 1);

        // Button OnTouchListener declarations
        button1 = findViewById(R.id.button1);
        button1.setOnTouchListener(ButtonClickListener);

        button2 = findViewById(R.id.button2);
        button2.setOnTouchListener(ButtonClickListener);

        button3 = findViewById(R.id.button3);
        button3.setOnTouchListener(ButtonClickListener);

        button4 = findViewById(R.id.button4);
        button4.setOnTouchListener(ButtonClickListener);

        button5 = findViewById(R.id.button5);
        button5.setOnTouchListener(ButtonClickListener);

        button6 = findViewById(R.id.button6);
        button6.setOnTouchListener(ButtonClickListener);

        button7 = findViewById(R.id.button7);
        button7.setOnTouchListener(ButtonClickListener);

        button8 = findViewById(R.id.button8);
        button8.setOnTouchListener(ButtonClickListener);

        button9 = findViewById(R.id.button9);
        button9.setOnTouchListener(ButtonClickListener);

        button10 = findViewById(R.id.button10);
        button10.setOnTouchListener(ButtonClickListener);

        button11 = findViewById(R.id.button11);
        button11.setOnTouchListener(ButtonClickListener);

        button12 = findViewById(R.id.button12);
        button12.setOnTouchListener(ButtonClickListener);
    }

    // Definition for callback upon touch event to this view
    private View.OnTouchListener ButtonClickListener = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            switch (v.getId())  // switch used to select one of several int-based alternatives
            {
                // case methods used to assign soundPool clips to buttons
                case R.id.button1:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        // if int is anything but 0, play sound
                        if (drum1 != 0) {
                        // int soundID, leftVol, rightVol, int priority, int loop, float rate
                            soundPool.play(drum1, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case MotionEvent.ACTION_DOWN:
                    v.setPressed(true);
                    button1.setBackgroundResource(R.drawable.button1_light);
                    break;
                case R.id.button2:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (snare1 != 0) {
                            soundPool.play(snare1, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button3:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (hat1 != 0) {
                            soundPool.play(hat1, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button4:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (dub1 != 0) {
                            soundPool.play(dub1, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button5:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (dub2 != 0) {
                            soundPool.play(dub2, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button6:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (dub3 != 0) {
                            soundPool.play(dub3, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button7:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (dub4 != 0) {
                            soundPool.play(dub4, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button8:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (dub5 != 0) {
                            soundPool.play(dub5, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button9:
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (dub6 != 0) {
                        soundPool.play(dub6, 1, 1, 0, 0, 1);
                    }
                }
                    break;
                case R.id.button10:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (lick1 != 0) {
                            soundPool.play(lick1, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button11:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (lick2 != 0) {
                            soundPool.play(lick2, 1, 1, 0, 0, 1);
                        }
                    }
                    break;
                case R.id.button12:
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (loop1 != 0) {
                            soundPool.play(loop1, 1, 1, 0, -1, 1);
                        }
                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (loop1 != 1) {
                            // autoPause to pause current soundPool
                            soundPool.autoPause();
                        }
                    }
                    break;
            }
            // return false used to prevent default behaviour
            return false;
        }
    };
}



