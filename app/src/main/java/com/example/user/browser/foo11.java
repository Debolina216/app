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

public class foo11 extends AppCompatActivity {
    int[] images = {R.drawable.halwa,R.drawable.dilkhushal,R.drawable.kachori,R.drawable.kadi,R.drawable.kalmivada,R.drawable.laalmaas};
    String[] names ={" Halwa"," Dilkhushal"," Kachori"," Kadi"," Kalmivada"," Laalmaas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo11);
        ListView listView=(ListView)findViewById(R.id.listview47);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(foo11.this,halwa.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo11.this, dilkhushal.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo11.this, kachori.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo11.this, kadi.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo11.this, kalmivada.class));
                }
                if (position == 5) {
                    startActivity(new Intent(foo11.this, laalmaas1.class));
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
           convertView=getLayoutInflater().inflate(R.layout.food18layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView32);
            TextView textView=(TextView)convertView.findViewById(R.id.textView19);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);



            return convertView;
        }
    }
}
