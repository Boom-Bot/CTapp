package com.example.emptytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;


public class PopupActivity extends AppCompatActivity {
    GridView imgGallery;
    int bgs[] = {R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15, R.drawable.img16};
    boolean clicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        imgGallery = (GridView) findViewById (R.id.imgGallery);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), bgs);
        imgGallery.setAdapter(customAdapter);
        imgGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Drawable trans = new ColorDrawable(0);
                final Drawable red = new ColorDrawable(0xFFFF0000);
                if (clicked != true) {
                    view.setForeground(red);
                    Toast.makeText(getApplicationContext(), "Selected Position: " + position, Toast.LENGTH_SHORT).show();
                    clicked = true;
                } else {
                    view.setForeground(trans);
                    Toast.makeText(getApplicationContext(), "Canceled.", Toast.LENGTH_SHORT).show();
                    clicked = false;
                }
            }
        });
    }

}
