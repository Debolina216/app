package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class uttarakhand extends AppCompatActivity {
ConstraintLayout mylayout20;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttarakhand);

        mylayout20=(ConstraintLayout)findViewById(R.id.layout19);
        animationDrawable=(AnimationDrawable)mylayout20.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

    }

    public  void  spots13(View view)
    {
        Intent newintent = new Intent(uttarakhand.this,pla6.class);
        startActivity(newintent);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }



    }
    public  void  hotel13(View view)
    {
        Intent newintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/almora-127111/hotel/uttarakhand-1484361"));
        startActivity(newintent1);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
    public  void food13(View view)
    {
        Intent newintent2= new Intent(uttarakhand.this,foo6.class);
        startActivity(newintent2);

        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
    public void about13(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Uttarakhand")));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
}
