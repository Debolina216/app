package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sikkim extends AppCompatActivity {
ConstraintLayout mylayout40;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikkim);
        mylayout40=(ConstraintLayout)findViewById(R.id.layout26);
        animationDrawable=(AnimationDrawable)mylayout40.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

    }
    public void PLA10(View view){
        Intent newintent1= new Intent(sikkim.this,pla10.class);
        startActivity(newintent1);
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }
    }
    public void HOT10(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trivago.in/?aDateRange%5Barr%5D=2018-01-17&aDateRange%5Bdep%5D=2018-01-18&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iPathId=84750&aGeoCode%5Blat%5D=27.532972&aGeoCode%5Blng%5D=88.512215&iGeoDistanceItem=0&aCategoryRange=0%2C1%2C2%2C3%2C4%2C5&aOverallLiking=1%2C2%2C3%2C4%2C5&sOrderBy=relevance%20desc&bTopDealsOnly=false&iRoomType=7&cpt=8475003&iIncludeAll=0&iViewType=0&bIsSeoPage=false&bIsSitemap=false&")));
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }
    public void FOO10(View view){
        Intent newintent3=new Intent(sikkim.this,foo10.class);
        startActivity(newintent3);
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }
    public void ABO10(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Sikkim")));
        if (animationDrawable.isRunning())
        {
            animationDrawable.stop();
        }

    }

}
