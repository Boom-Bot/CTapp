package com.example.emptytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int bgs[];

    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext, int[] bgs){
        this.context = applicationContext;
        this.bgs = bgs;
        inflater = (LayoutInflater.from(applicationContext));
    }
        @Override
        public int getCount() {
            return bgs.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int index, View view, ViewGroup viewGroup) {
            ImageView i = new ImageView(context);
            i.setImageResource(bgs[index]);
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            //To change grid cells into squares dynamically
            GridView g = (GridView)viewGroup;
            int size = g.getColumnWidth();
            i.setLayoutParams (new GridView.LayoutParams(size,size));
            return i;





        }

    }

