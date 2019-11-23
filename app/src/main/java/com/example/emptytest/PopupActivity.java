package com.example.emptytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.lang.reflect.Array;
import java.util.List;


public class PopupActivity extends AppCompatActivity {
    GridView imgGallery;
    int bgs[] = {R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15, R.drawable.img16};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        imgGallery = (GridView) findViewById (R.id.imgGallery);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), bgs);
        imgGallery.setAdapter(customAdapter);
    }


}
