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

public class foo12 extends AppCompatActivity {
    int[] images = {R.drawable.chickenbutter,R.drawable.dalmakhni,R.drawable.fishtikka,R.drawable.murghmalai,R.drawable.tandori,R.drawable.saag};
    String[] names ={" Chickenbutter"," Dalmakhni"," Fishtikka"," Murghmalai"," Tandori"," Saag"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo12);
        ListView  listView=(ListView)findViewById(R.id.listview48);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(foo12.this,chickenbutter.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo12.this, dalmakhni.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo12.this, fishtikka.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo12.this, murghmalai.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo12.this, tandori.class));
                }
                if (position == 5) {
                    startActivity(new Intent(foo12.this, saag.class));
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
            convertView=getLayoutInflater().inflate(R.layout.food19layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView33);
            TextView textView=(TextView)convertView.findViewById(R.id.textView31);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);



            return convertView;
        }
    }

}
