package com.example.user.browser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class food1 extends AppCompatActivity {
int[] images = {R.drawable.aktori,R.drawable.babru,R.drawable.bhey,R.drawable.chhagosht,R.drawable.dham,R.drawable.khatta,R.drawable.kullutrot,R.drawable.madra,R.drawable.mittha,R.drawable.siddu,R.drawable.tibetandishes,R.drawable.tudkiyabhath};
    String[] names ={" Aktori"," Babru"," Bhey"," Chha Gosht"," Dham"," Khatta"," Kullu Trot Fish"," Madra"," Mittha"," Siddu"," Tibetan Dishes"," Tudkiya Bhath"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1);


        ListView newlistview = (ListView) findViewById(R.id.listview1);
        CustomAdapter customAdapter = new CustomAdapter();
        newlistview.setAdapter(customAdapter);
       newlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==0)
               {
                   startActivity(new Intent(food1.this,aktori.class));
               }
               if(position == 1)
               {
                   startActivity(new Intent(food1.this,babru.class));
               }
               if(position == 2)
               {
                   startActivity(new Intent(food1.this,bhey.class));
               }
               if(position == 3)
               {
                   startActivity(new Intent(food1.this,chhagosht.class));
               }
               if(position == 4)
               {
                   startActivity(new Intent(food1.this,dham.class));
               }
               if(position == 5)
               {
                   startActivity(new Intent(food1.this,khatta.class));
               }
               if(position==6)
               {
                   startActivity(new Intent(food1.this,kullufish.class));
               }
               if(position == 7)
               {
                   startActivity(new Intent(food1.this,madra.class));
               }
               if(position == 8)
               {
                   startActivity(new Intent(food1.this,mittha.class));
               }
               if(position == 9)
               {
                   startActivity(new Intent(food1.this,siddu.class));
               }
               if(position ==10)
               {
                   startActivity(new Intent(food1.this,tibetan.class));
               }
               if(position == 11)
               {
                   startActivity(new Intent(food1.this,tudkiya.class));
               }
           }
       });

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.foodlayout,null);
            ImageView imageView =(ImageView)convertView.findViewById(R.id.image3);
            TextView textView = (TextView)convertView.findViewById(R.id.textview2);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);




            return convertView;
        }
    }

}


