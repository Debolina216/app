package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.graphics.drawable.Animatable2Compat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class haryana extends AppCompatActivity {
ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana);
        mylayout = (ConstraintLayout)findViewById(R.id.layout8);
        animationDrawable = (AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }
    public  void  spots7(View view)
    {
        Intent newintent = new Intent(haryana.this,spots4.class);
        startActivity(newintent);
         if(animationDrawable.isRunning())
         {animationDrawable.stop();

         }


    }
    public  void  hotel7(View view)
    {
        Intent newintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/haryana-84733/hotel"));
        startActivity(newintent1);

        if(animationDrawable.isRunning())
        {animationDrawable.stop();

        }

    }
    public  void food7(View view)
    {
        Intent newintent2= new Intent(haryana.this,food4.class);
        startActivity(newintent2);

        if(animationDrawable.isRunning())
        {animationDrawable.stop();

        }

    }
    public void about7(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Haryana")));

        if(animationDrawable.isRunning())
        {animationDrawable.stop();

        }
    }
}
