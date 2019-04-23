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

public class foo extends AppCompatActivity {
    int[] images = {R.drawable.k1,R.drawable.k2,R.drawable.k7,R.drawable.kofta,R.drawable.k6,R.drawable.lapsi,R.drawable.nihari};
    String[] names ={" Batichokha"," Cholebatore"," Kheer"," Kofta"," Kulfi"," Lapsi"," Nihari"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo);
        ListView listView =(ListView)findViewById(R.id.listview10);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    startActivity(new Intent(foo.this, batichokha.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo.this, cholebatore.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo.this, kheer2.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo.this, kofta.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo.this, kulfi.class));
                }
                if (position == 5) {
                    startActivity(new Intent(foo.this, lapsi.class));
                }
                if (position == 6) {
                    startActivity(new Intent(foo.this, nihari.class));
                }
            }
        });
    }


    class  CustomAdapter extends BaseAdapter{
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
            convertView =getLayoutInflater().inflate(R.layout.food9layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView25);
            TextView textView = (TextView)convertView.findViewById(R.id.textView13);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);

            return convertView;
        }
    }
}
