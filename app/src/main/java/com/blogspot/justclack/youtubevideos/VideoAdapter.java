package com.blogspot.justclack.youtubevideos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

/**
 * Created by mujahidkhan on 1/5/18.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {
    List<VideoModelClass> youtubevideolist;
    public VideoAdapter() {
    }

    public VideoAdapter(List<VideoModelClass> youtubevideolist) {
        this.youtubevideolist = youtubevideolist;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.webView.loadData(youtubevideolist.get(position).getVideoUrl(),"text/html","UTF-8");

    }

    @Override
    public int getItemCount() {
        return youtubevideolist.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView webView;
        public VideoViewHolder(View itemView) {
            super(itemView);
            webView = itemView.findViewById(R.id.video);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient());
        }
    }
}
