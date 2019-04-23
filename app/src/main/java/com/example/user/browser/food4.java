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

public class food4 extends AppCompatActivity {
int[] images2 ={R.drawable.alsipinni,R.drawable.bajraaluruti,R.drawable.dhaniacholia,R.drawable.gajarmethisabzi,R.drawable.kachdisabzi,R.drawable.kachilassi,R.drawable.kadhi,R.drawable.kheer,R.drawable.mithachawal,R.drawable.mixeddal};
    String[] names2={"Alsi Pinni","Bajra Aloo Roti","Haara Dhania Cholia","Gajar Methi Sabzi","Kachdi Sabzi","Kachchi Lassi","Kadhi","Kheer","Mitha Chawal","Mixed Daal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food4);
        ListView newlistview =(ListView)findViewById(R.id.listview3);
        CustomAdapter customAdapter = new CustomAdapter();
        newlistview.setAdapter(customAdapter);
        newlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0)
                {
                    startActivity(new Intent(food4.this,alsipinni.class));

                }
                if(position ==1)
                {
                    startActivity(new Intent(food4.this,bajraaluruti.class));
                }

                if(position ==2)
                {
                    startActivity(new Intent(food4.this,dhaniacholia.class));
                }

                if(position ==3)
                {
                    startActivity(new Intent(food4.this,gajarmethisabzi.class));
                }

                if(position ==4)
                {
                    startActivity(new Intent(food4.this,kachdisabzi.class));
                }

                if(position ==5)
                {
                    startActivity(new Intent(food4.this,kachilassi.class));
                }
                if(position ==6)
                {
                    startActivity(new Intent(food4.this,kadhi.class));
                }
                if(position ==7)
                {
                    startActivity(new Intent(food4.this,kheer.class));
                }
                if(position ==8)
                {
                    startActivity(new Intent(food4.this,mithachawal.class));
                }
                if(position ==9)
                {
                    startActivity(new Intent(food4.this,mixeddal.class));
                }
            }
        });


    }
    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return images2.length;
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
            convertView = getLayoutInflater().inflate(R.layout.food4layout,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView18);
            TextView textView=(TextView)convertView.findViewById(R.id.textView9);
            imageView.setImageResource(images2[position]);
            textView.setText(names2[position]);



            return convertView;
        }
    }
}
