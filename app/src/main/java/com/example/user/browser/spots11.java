package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class spots11 extends AppCompatActivity {
ConstraintLayout mylayout1;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots11);
        mylayout1=(ConstraintLayout)findViewById(R.id.layout13);
        animationDrawable=(AnimationDrawable)mylayout1.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }
    public void back5(View view)
    {
        startActivity(new Intent(spots11.this,arunachalpradesh.class));
        if(animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
}
