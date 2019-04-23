package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class himachalpradesh extends AppCompatActivity {
ConstraintLayout mylayout1;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachalpradesh);
        mylayout1 = (ConstraintLayout) findViewById(R.id.layout3);
        animationDrawable=(AnimationDrawable)mylayout1.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }
    public  void  spots(View view)
    {
        Intent newintent = new Intent(himachalpradesh.this,spots1.class);
        startActivity(newintent);

        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }
    public  void  hotel(View view)
    {
        Intent newintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/himachal-pradesh-84734/hotel"));
        startActivity(newintent1);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();

        }


    }
    public  void food(View view)
    {
        Intent newintent2= new Intent(himachalpradesh.this,food1.class);
        startActivity(newintent2);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }
    public void about4(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Himachal_Pradesh")));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();

        }
    }
}
