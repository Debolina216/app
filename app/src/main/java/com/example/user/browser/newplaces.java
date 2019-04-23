package com.example.user.browser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class newplaces extends AppCompatActivity {
     ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newplaces);

        Spinner spinner =(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(newplaces.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.places));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(position == 1)
               {startActivity(new Intent(newplaces.this,andhrapradesh.class));
                   if(animationDrawable.isRunning())
                   {
                       animationDrawable.stop();

                   }

               }
               if(position ==2)
               {
                   startActivity(new Intent(newplaces.this,arunachalpradesh.class));
                   if(animationDrawable.isRunning())
                   {
                       animationDrawable.stop();
                   }
               }
                if(position ==3)
                {
                    startActivity(new Intent(newplaces.this,assam.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();
                    }
                }



                if(position == 4)
                {
                    startActivity(new Intent(newplaces.this,haryana.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }


                if(position == 5)
                {
                    startActivity(new Intent(newplaces.this,himachalpradesh.class));

                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }
                if(position == 6)
                {
                    startActivity(new Intent(newplaces.this,jammukashmir.class));

                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }
                if(position==7)
                {
                    startActivity(new Intent(newplaces.this,odisha.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();
                    }
                }

                if(position==8)
                {
                    startActivity(new Intent(newplaces.this,punjab.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();
                    }
                }

                if(position==9)
                {
                    startActivity(new Intent(newplaces.this,rajasthan.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }

                if(position==10)
                {
                    startActivity(new Intent(newplaces.this,sikkim.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();
                        Toast.makeText(newplaces.this,"stopped",Toast.LENGTH_LONG).show();
                    }
                }

                if(position==11)
                {
                    startActivity(new Intent(newplaces.this,tamilnadu.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }



                if(position==12)
                {
                    startActivity(new Intent(newplaces.this,telangana.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }

                if(position==13)
                {
                    startActivity(new Intent(newplaces.this,tripura.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }



                if(position==14)
                {
                    startActivity(new Intent(newplaces.this,uttarakhand.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }



                if(position ==15)
                {
                    startActivity(new Intent(newplaces.this,uttarpradesh.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();

                    }
                }

                if(position ==16)
                {
                    startActivity(new Intent(newplaces.this,westbengal.class));
                    if(animationDrawable.isRunning())
                    {
                        animationDrawable.stop();
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        mylayout = (ConstraintLayout) findViewById(R.id.layout2);
        animationDrawable = (AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

    }

    }






