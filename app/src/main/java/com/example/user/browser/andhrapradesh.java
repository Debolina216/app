package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class andhrapradesh extends AppCompatActivity {
ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andhrapradesh);
        mylayout = (ConstraintLayout)findViewById(R.id.layout10);
        animationDrawable = (AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }

    public  void  spots8(View view)
    {
        Intent newintent = new Intent(andhrapradesh.this,spots9.class);
        startActivity(newintent);
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }



    }
    public  void  hotel8(View view)
    {
        Intent newintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/andhra-pradesh-84722/hotel"));
        startActivity(newintent1);
       if(animationDrawable.isRunning())
       {
           animationDrawable.stop();
       }


    }
    public  void food8(View view)
    {
        Intent newintent2= new Intent(andhrapradesh.this,food9.class);
        startActivity(newintent2);

        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
    public void about8(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Andhra_Pradesh")));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }


    }
}
