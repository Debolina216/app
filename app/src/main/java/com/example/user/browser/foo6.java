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

public class foo6 extends AppCompatActivity {
    int[] images = {R.drawable.k21,R.drawable.k22,R.drawable.k19,R.drawable.k17,R.drawable.k18,R.drawable.k20};
    String[] names ={" Dubuk"," Gulgula"," Kafuli"," Kandalee"," Phaanu"," Raita"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foo6);
        ListView listView =(ListView)findViewById(R.id.listview20);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    startActivity(new Intent(foo6.this, dubuk.class));
                }
                if (position == 1) {
                    startActivity(new Intent(foo6.this, gulgula.class));
                }
                if (position == 2) {
                    startActivity(new Intent(foo6.this, kafuli.class));
                }
                if (position == 3) {
                    startActivity(new Intent(foo6.this, kandalee.class));
                }
                if (position == 4) {
                    startActivity(new Intent(foo6.this, phanu.class));
                }
                if (position == 5) {
                    startActivity(new Intent(foo6.this, raita.class));
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
            convertView=getLayoutInflater().inflate(R.layout.food10layout,null);

            ImageView imageView =(ImageView)convertView.findViewById(R.id.imageView27);
            TextView textView = (TextView)convertView.findViewById(R.id.textView27);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);




            return convertView;
        }
    }
}
