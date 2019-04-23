package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class jammukashmir extends AppCompatActivity {
ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jammukashmir);
        mylayout = (ConstraintLayout)findViewById(R.id.layout6);
        animationDrawable=(AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }


    public void about5(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Jammu_and_Kashmir")));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
    public void hotel1(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.trivago.in/jammu-and-kashmir-84735/hotel")));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
    public  void spots2(View view)
    {
        startActivity(new Intent(jammukashmir.this,spots3.class));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
    public void food2(View view)
    {
        startActivity(new Intent(jammukashmir.this,food3.class));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
}
