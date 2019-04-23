package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arunachalpradesh extends AppCompatActivity {
ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arunachalpradesh);
        mylayout = (ConstraintLayout)findViewById(R.id.layout14);
        animationDrawable = (AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }

    public  void  spots10(View view)
    {
        Intent newintent = new Intent(arunachalpradesh.this,spots11.class);
        startActivity(newintent);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }



    }
    public  void  hotel10(View view)
    {
        Intent newintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/arunachal-pradesh-84723/hotel"));
        startActivity(newintent1);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
    public  void food10(View view)
    {
        Intent newintent2= new Intent(arunachalpradesh.this,food11.class);
        startActivity(newintent2);

        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
    public void about10(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Arunachal_Pradesh")));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
}
