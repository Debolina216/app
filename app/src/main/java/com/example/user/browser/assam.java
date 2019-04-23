package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class assam extends AppCompatActivity {
ConstraintLayout mylayout1;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam);
        mylayout1=(ConstraintLayout)findViewById(R.id.layout17);
        animationDrawable=(AnimationDrawable)mylayout1.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }

    public void spots10(View view){
        Intent newintent1= new Intent(assam.this,spots12.class);
        startActivity(newintent1);
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }

    public void hotel10(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/assam-84724/hotel")));
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }
    public void food10(View view){
        Intent newintent3=new Intent(assam.this,food12.class);
        startActivity(newintent3);
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
    public void about10(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Assam")));
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }
}
