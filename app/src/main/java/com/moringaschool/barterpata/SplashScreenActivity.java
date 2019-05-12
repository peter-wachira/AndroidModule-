package com.moringaschool.barterpata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends AppCompatActivity {
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {

                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);


                        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
                        mAppNameTextView.setTypeface(ostrichFont);
                        finish();

                    }
                },
                1500);




    }
}
