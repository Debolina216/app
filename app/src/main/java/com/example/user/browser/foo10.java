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

public class foo10 extends AppCompatActivity {
    int[] images = {R.drawable.k40,R.drawable.k41,R.drawable.k42,R.drawable.k43,R.drawable.k44};
    String[] names ={" Momo"," Thukpa"," Kinema"," Pakku"," Phulaurah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo10);
        ListView listView=(ListView)findViewById(R.id.listview31);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(foo10.this,momo2.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo10.this,thukpa .class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo10.this,kinema.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo10.this, pakku.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo10.this, phulaurah.class));
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
            convertView=getLayoutInflater().inflate(R.layout.food17layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView31);
            TextView textView=(TextView)convertView.findViewById(R.id.textView18);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);


            return convertView;
        }
    }
}
