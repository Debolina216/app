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

public class foo7 extends AppCompatActivity {
    int[] images = {R.drawable.li23,R.drawable.li24,R.drawable.mwkhwi,R.drawable.kothalor,R.drawable.oambal};
    String[] names ={" Chakhwi"," Mosdeng"," Mwkhwi"," Kothalor-chakoi"," Oambal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo7);
        ListView listView =(ListView)findViewById(R.id.listview23);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(foo7.this, chakhwi.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo7.this, mosdeng.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo7.this, mwkhwi.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo7.this, kothalor.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo7.this, oambal.class));
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
            convertView =getLayoutInflater().inflate(R.layout.food13layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView28);
            TextView textView=(TextView)convertView.findViewById(R.id.textView16);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);



            return convertView;
        }
    }
}
