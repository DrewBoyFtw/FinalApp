package com.d.xmasapp;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    boolean istreeon = false;
    boolean isfireon = false;
    boolean ispresentshown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView pres1 = findViewById(R.id.present1);
        pres1.setVisibility(View.INVISIBLE);
        ImageView pres2 = findViewById(R.id.present2);
        pres2.setVisibility(View.INVISIBLE);
        ImageView pres3 = findViewById(R.id.present3);
        pres3.setVisibility(View.INVISIBLE);
        ImageView pres4 = findViewById(R.id.present4);
        pres4.setVisibility(View.INVISIBLE);

        ImageView light1 = findViewById(R.id.star);
        light1.setVisibility(View.INVISIBLE);
        ImageView light2 = findViewById(R.id.star1);
        light2.setVisibility(View.INVISIBLE);
        ImageView light3 = findViewById(R.id.star2);
        light3.setVisibility(View.INVISIBLE);
        ImageView light4 = findViewById(R.id.star3);
        light4.setVisibility(View.INVISIBLE);
        ImageView light5 = findViewById(R.id.star4);
        light5.setVisibility(View.INVISIBLE);
        ImageView light6 = findViewById(R.id.star5);
        light6.setVisibility(View.INVISIBLE);
        ImageView light7 = findViewById(R.id.star6);
        light7.setVisibility(View.INVISIBLE);

    }

    public void fire (View view){
        final MediaPlayer fireplace = MediaPlayer.create(this, R.raw.fireplace);


        if(isfireon == true) {
            fireplace.start();
            ImageView dimback = findViewById(R.id.dimback);
            dimback.setVisibility(View.INVISIBLE);
            ImageView dimfire = findViewById(R.id.dimfire);
            dimfire.setVisibility(View.INVISIBLE);
            isfireon = false;
        }
        else{
            ImageView dimback = findViewById(R.id.dimback);
            dimback.setVisibility(View.VISIBLE);
            ImageView dimfire = findViewById(R.id.dimfire);
            dimfire.setVisibility(View.VISIBLE);
            isfireon = true;
        }


    }



    public void showpresent(View view){
        final MediaPlayer hohoho = MediaPlayer.create(this, R.raw.hohoho);

        if(ispresentshown == true){
            ImageView pres1 = findViewById(R.id.present1);
            pres1.setVisibility(View.INVISIBLE);
            ImageView pres2 = findViewById(R.id.present2);
            pres2.setVisibility(View.INVISIBLE);
            ImageView pres3 = findViewById(R.id.present3);
            pres3.setVisibility(View.INVISIBLE);
            ImageView pres4 = findViewById(R.id.present4);
            pres4.setVisibility(View.INVISIBLE);
            ispresentshown = false;
        }

        else{
            hohoho.start();
            ImageView pres1 = findViewById(R.id.present1);
            pres1.setVisibility(View.VISIBLE);
            ImageView pres2 = findViewById(R.id.present2);
            pres2.setVisibility(View.VISIBLE);
            ImageView pres3 = findViewById(R.id.present3);
            pres3.setVisibility(View.VISIBLE);
            ImageView pres4 = findViewById(R.id.present4);
            pres4.setVisibility(View.VISIBLE);
            ispresentshown = true;
        }
    }

    public void blinktree(View view){
        final MediaPlayer bells = MediaPlayer.create(this, R.raw.bells);

        if(istreeon == true){
            ImageView light1 = findViewById(R.id.star);
            light1.setVisibility(View.INVISIBLE);
            ImageView light2 = findViewById(R.id.star1);
            light2.setVisibility(View.INVISIBLE);
            ImageView light3 = findViewById(R.id.star2);
            light3.setVisibility(View.INVISIBLE);
            ImageView light4 = findViewById(R.id.star3);
            light4.setVisibility(View.INVISIBLE);
            ImageView light5 = findViewById(R.id.star4);
            light5.setVisibility(View.INVISIBLE);
            ImageView light6 = findViewById(R.id.star5);
            light6.setVisibility(View.INVISIBLE);
            ImageView light7 = findViewById(R.id.star6);
            light7.setVisibility(View.INVISIBLE);
            istreeon = false;
        }

        else{
            bells.start();
            ImageView light1 = findViewById(R.id.star);
            light1.setVisibility(View.VISIBLE);
            ImageView light2 = findViewById(R.id.star1);
            light2.setVisibility(View.VISIBLE);
            ImageView light3 = findViewById(R.id.star2);
            light3.setVisibility(View.VISIBLE);
            ImageView light4 = findViewById(R.id.star3);
            light4.setVisibility(View.VISIBLE);
            ImageView light5 = findViewById(R.id.star4);
            light5.setVisibility(View.VISIBLE);
            ImageView light6 = findViewById(R.id.star5);
            light6.setVisibility(View.VISIBLE);
            ImageView light7 = findViewById(R.id.star6);
            light7.setVisibility(View.VISIBLE);
            istreeon = true;

        }
    }
}
