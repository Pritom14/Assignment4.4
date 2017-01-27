package com.example.shaloin.fourthassignmentd;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shaloin on 21/1/17.
 */

public class MyAdapter extends ArrayAdapter<DataHandler> {
    private Context context;
    int layoutResourceId;
    DataHandler data[]=null;
    public MyAdapter(Context context,int layoutResourceId,DataHandler data[]){
        super(context,layoutResourceId,data);
        this.context=context;
        this.layoutResourceId=layoutResourceId;
        this.data=data;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolder holder=null;
        if(row==null){
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            row=inflater.inflate(layoutResourceId,parent,false);

            holder=new ViewHolder();
            holder.imageView=(ImageView)row.findViewById(R.id.imageID);
            holder.textView=(TextView)row.findViewById(R.id.textID);
            row.setTag(holder);
        }else{
            holder=(ViewHolder)row.getTag();
        }
        DataHandler dataHandler=data[position];
        holder.textView.setText(dataHandler.display);
        holder.imageView.setImageResource(dataHandler.icon);
        return row;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
