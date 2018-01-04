package com.blogspot.justclack.youtubevideos;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String url = "g6DlGUvTcsw";
    Vector<VideoModelClass> youtubevideos = new Vector<VideoModelClass>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        youtubevideos.add(new VideoModelClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/"+url+"\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>"));
        recyclerView.setAdapter(new VideoAdapter(youtubevideos));
    }
}
