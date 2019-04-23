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

public class food9 extends AppCompatActivity {
int[] images3={R.drawable.biriyanih,R.drawable.chepapulusu,R.drawable.curdrice,R.drawable.gongurapickle,R.drawable.meduvada,R.drawable.pesarattu,R.drawable.pulihora,R.drawable.uppindi};
    String[] names3={" Hyderabadi Biriyani"," Chepa Pulusu"," Curd Rice"," Gongura Pickle"," Medu Vada"," Pesarattu"," Pulihora"," Uppindi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food9);
        ListView newlistview =(ListView)findViewById(R.id.listview5);
        CustomAdapter customAdapter = new CustomAdapter();
        newlistview.setAdapter(customAdapter);
        newlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    startActivity(new Intent(food9.this,biriyanih.class));
                }
                if(position == 1)
                {
                    startActivity(new Intent(food9.this,curdrice.class));
                }
                if(position ==2)
                {startActivity(new Intent(food9.this,chepapulusu.class));}
                if(position==3)
                {
                    startActivity(new Intent(food9.this,gongurapickle.class));
                }
                if(position ==4)
                {
                    startActivity(new Intent(food9.this,meduvada.class));
                }
                if(position ==5)
                {
                    startActivity(new Intent(food9.this,pesarattu.class));
                }
                if(position ==6)
                {
                    startActivity(new Intent(food9.this,pulihora.class));
                }
                if(position ==7)
                {
                    startActivity(new Intent(food9.this,uppindi.class));
                }




            }

        });

    }
class CustomAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return images3.length;
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
        convertView =getLayoutInflater().inflate(R.layout.food5layout,null);
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView22);
        TextView textView =(TextView)convertView.findViewById(R.id.textView11);
        imageView.setImageResource(images3[position]);
        textView.setText(names3[position]);



        return convertView;
    }
}






}
