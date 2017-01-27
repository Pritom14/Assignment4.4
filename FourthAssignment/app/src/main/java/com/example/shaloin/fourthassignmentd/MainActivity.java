package com.example.shaloin.fourthassignmentd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataHandler display_data[]=new DataHandler[]{
                new DataHandler(R.drawable.ginger,"GingerBread"),
                new DataHandler(R.drawable.honey,"HoneyComb"),
                new DataHandler(R.drawable.ice,"IceCream Sandwich"),
                new DataHandler(R.drawable.jelly,"JellyBean"),
                new DataHandler(R.drawable.kit,"KitKat"),
                new DataHandler(R.drawable.lolli,"Lollipop"),
        };

        MyAdapter myAdapter=new MyAdapter(this,R.layout.row_layout,display_data);
        gridView=(GridView)findViewById(R.id.grid);
        gridView.setAdapter(myAdapter);

    }
}
