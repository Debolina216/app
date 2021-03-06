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

public class foo13 extends AppCompatActivity {
    int[] images = {R.drawable.chhenapoda,R.drawable.gajja,R.drawable.kendrapara,R.drawable.keonjhar,R.drawable.khaja,R.drawable.korakhai};
    String[] names ={" Chhenapoda"," Gajja"," Rasabali"," Phula Badi"," Khaja"," Korakhai"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo1);
        ListView listView=(ListView)findViewById(R.id.listview49);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(foo13.this,chennapoda.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo13.this, gajja.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo13.this, kendrapara.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo13.this, keonjhar.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo13.this, khaja.class));
                }
                if (position == 5) {
                    startActivity(new Intent(foo13.this, korakhai.class));
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
            convertView = getLayoutInflater().inflate(R.layout.food20layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView34);
            TextView textView=(TextView)convertView.findViewById(R.id.textView32);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);


            return convertView;
        }
    }
}
