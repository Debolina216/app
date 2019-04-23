package com.example.user.browser;

        import android.content.Intent;
        import android.graphics.drawable.AnimationDrawable;
        import android.media.Image;
        import android.support.constraint.ConstraintLayout;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

public class spots1 extends AppCompatActivity {

    ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots1);


        mylayout=(ConstraintLayout)findViewById(R.id.layout4);
        animationDrawable=(AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(5500);
        animationDrawable.setExitFadeDuration(5500);
        animationDrawable.start();
    }




}
