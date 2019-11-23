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
    int bgs[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        imgGallery = (GridView) findViewById (R.id.imgGallery);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), bgs);
        imgGallery.setAdapter(customAdapter);
    }


}
