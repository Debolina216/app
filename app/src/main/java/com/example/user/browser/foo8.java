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

public class foo8 extends AppCompatActivity {
    int[] images = {R.drawable.biriyani,R.drawable.chegodilu,R.drawable.garijalu,R.drawable.polelu,R.drawable.sarvapindi,R.drawable.chakinalu};
    String[] names ={" Biriyani"," Chegodilu"," Garijalu"," Polelu"," Sarvapindi"," Chakinalu"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo8);
        ListView listView =(ListView)findViewById(R.id.listview28);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(foo8.this, biriyani.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo8.this, chegodilu.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo8.this, garijalu.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo8.this, polelu.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo8.this, sarvapindi.class));
                }
                if (position == 5) {
                    startActivity(new Intent(foo8.this, chakinalu.class));
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
            convertView =getLayoutInflater().inflate(R.layout.food15layout,null);
            ImageView imageView =(ImageView)convertView.findViewById(R.id.imageView29);
            TextView textView = (TextView)convertView.findViewById(R.id.textView14);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);



            return convertView;
        }
    }
}
