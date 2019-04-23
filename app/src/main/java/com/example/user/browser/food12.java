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

public class food12 extends AppCompatActivity {
int[] images={R.drawable.khar,R.drawable.duck,R.drawable.masortenga,R.drawable.paromanxho,R.drawable.bangajorkukura,R.drawable.pithaassam,R.drawable.silkworm};
    String[] names={" Khaar"," Duck Curry"," Masor Tenga"," Paro Manxho"," Baanhgajor Lagot Kurkura"," Pitha"," Silkworm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food12);
        ListView listView=(ListView)findViewById(R.id.listview11);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    startActivity(new Intent(food12.this,khar.class));
                }
                if(position==1)
                {
                    startActivity(new Intent(food12.this,duckcurry.class));
                }
                if(position==2)
                {
                    startActivity(new Intent(food12.this,masortonga.class));
                }
                if(position==3)
                {
                    startActivity(new Intent(food12.this,paromanxho.class));
                }
                if(position==4)
                {
                    startActivity(new Intent(food12.this,bangajor.class));
                }
                if(position==5)
                {
                    startActivity(new Intent(food12.this,pitha.class));
                }
                if(position ==6)
                {
                    startActivity(new Intent(food12.this,silkworm.class));
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

            convertView =getLayoutInflater().inflate(R.layout.food12layout,null);
            ImageView imageView =(ImageView)convertView.findViewById(R.id.imageView26);
            TextView textView = (TextView)convertView.findViewById(R.id.textView15);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);



            return convertView;
        }
    }
}
