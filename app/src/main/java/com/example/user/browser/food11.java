package com.example.user.browser;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class food11 extends AppCompatActivity {
int[] images={R.drawable.apong,R.drawable.bambooshoot,R.drawable.lukter,R.drawable.momo,R.drawable.pehak,R.drawable.pikapila,R.drawable.rice};
    String[] names = { " Apong"," Bamboo Shoot"," Lukter"," Momo"," Pehak"," Pika Pila"," Rice"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food11);
        ListView listView =(ListView)findViewById(R.id.listview6);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0)
                {startActivity(new Intent(food11.this,apong.class));}
                if(position ==1)
                {startActivity(new Intent(food11.this,bambooshoot.class));}
                if(position ==2)
                {
                    startActivity(new Intent(food11.this,lukter.class));
                }
                if(position==3)
                {
                    startActivity(new Intent(food11.this,momo.class));

                }
                if(position ==4)
                {
                    startActivity(new Intent(food11.this,pehak.class));
                }
                if (position ==5)
                {
                    startActivity(new Intent(food11.this,pikapila.class));
                }
                if(position ==6)
                {
                    startActivity(new Intent(food11.this,rice.class));
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
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        convertView =getLayoutInflater().inflate(R.layout.food7layout,null);
            ImageView imageView =(ImageView)convertView.findViewById(R.id.imageView24);
            TextView textView =(TextView) convertView.findViewById(R.id.textView12);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);

            return convertView;
        }
    }
}
