package com.example.user.browser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class moon extends AppCompatActivity {
    int[] images = {R.drawable.khichri,R.drawable.malaikari,R.drawable.lin,R.drawable.paturi,R.drawable.pithe,R.drawable.hilsa,R.drawable.rosogola};
    String[] names ={" Khichdi"," Chingri Malaikari"," Sondesh"," Paturi"," Pithe"," Hilsa"," Rosogolla"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon);
        ListView newlistview= (ListView)findViewById(R.id.listview5);
        CustomAdapter customAdapter =new CustomAdapter();
        newlistview.setAdapter(customAdapter);
        newlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(moon.this, khichiri.class));
                }
                if (position == 1) {
                    startActivity(new Intent(moon.this, malaikari.class));
                }
                if (position == 2) {
                    startActivity(new Intent(moon.this, lin.class));
                }
                if (position == 3) {
                    startActivity(new Intent(moon.this, paturi.class));
                }
                if (position == 4) {
                    startActivity(new Intent(moon.this, pithe.class));
                }
                if (position == 5) {
                    startActivity(new Intent(moon.this, hilsa.class));
                }
                if (position == 6) {
                    startActivity(new Intent(moon.this, rosogola.class));
                }

            }
        });

    }



   class CustomAdapter extends  BaseAdapter{
       @Override
       public int getCount() {
           return images.length;
       }

       @Override
       public Object getItem(int position) {
           return null;
       }

       @Override
       public long getItemId(int position) {
           return 0;
       }

       @Override
       public View getView(int position, View convertView, ViewGroup parent) {
          convertView=getLayoutInflater().inflate(R.layout.food6layout,null);
           ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView23);
           TextView textView=(TextView)convertView.findViewById(R.id.textView10);
           imageView.setImageResource(images[position]);
           textView.setText(names[position]);


           return convertView;
       }
   }
}
