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

public class food3 extends AppCompatActivity {
int[] images = {R.drawable.aludum,R.drawable.kaladikulcha,R.drawable.kashmiripolao,R.drawable.khattameat1,R.drawable.nadruyakhni,R.drawable.patisa,R.drawable.seekkabab,R.drawable.rajma};
    String[] names= {" Alu Dum"," Kaladi Kulcha"," Kashmiri Polao"," Khatta Meat"," Nadru Yakhni"," Patisa"," Seek Kabab"," Rajma Chawal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);
        ListView newlistview =(ListView)findViewById(R.id.listview2);
     CustomAdapter customAdapter = new CustomAdapter();
        newlistview.setAdapter(customAdapter);
        newlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    startActivity(new Intent(food3.this,aludum.class));
                }
                if(position == 1)
                {
                    startActivity(new Intent(food3.this,kaladikulcha.class));
                }
                if(position ==2)
                {
                    startActivity(new Intent(food3.this,kashmiripolao.class));
                }
                if(position == 3)
                {
                    startActivity(new Intent(food3.this,khattameat.class));
                }
                if(position == 4)
                {
                    startActivity(new Intent(food3.this,nadruyakhni.class));
                }
                if(position == 5)
                {
                    startActivity(new Intent(food3.this,patisa.class));
                }
                if(position == 6)
                {
                    startActivity(new Intent(food3.this,seekkabab.class));
                }
                if(position == 7)
                {
                    startActivity(new Intent(food3.this,rajmachawal.class));
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
           convertView = getLayoutInflater().inflate(R.layout.food3layout,null);
            ImageView imageView= (ImageView)convertView.findViewById(R.id.imageView13);
            TextView textView=(TextView)convertView.findViewById(R.id.textView30);
            imageView.setImageResource(images[position]);
            textView.setText(names[position]);
            return convertView;
        }
    }
}
