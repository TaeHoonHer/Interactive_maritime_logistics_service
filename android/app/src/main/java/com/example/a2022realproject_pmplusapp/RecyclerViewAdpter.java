package com.example.a2022realproject_pmplusapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdpter extends RecyclerView.Adapter<RecyclerViewAdpter.ViewHolder> {

    private ArrayList<NoticeData> mList;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView_date;
        TextView textView_content;
        TextView textView_writer ;
        TextView textView_title;


        public ViewHolder(View itemView) {
            super(itemView);

             textView_title = (TextView) itemView.findViewById(R.id.notice_adapter_title);
             textView_writer = (TextView) itemView.findViewById(R.id.notice_adapter_writer);
             textView_date = (TextView)itemView.findViewById(R.id.notice_adapter_date);
             textView_content = (TextView)itemView.findViewById(R.id.notice_adapter_content);

        }
    }

    public RecyclerViewAdpter(ArrayList<NoticeData> list) {
        this.mList = list;
    }


    @NonNull
    @Override
    public RecyclerViewAdpter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notice, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdpter.ViewHolder holder, int position) {

        holder.textView_title.setText(String.valueOf(mList.get(position).getTitle()));
        holder.textView_writer .setText(String.valueOf(mList.get(position).getWriter()));
        holder.textView_date.setText(String.valueOf(mList.get(position).getDate()));
        holder.textView_content.setText(String.valueOf(mList.get(position).getContent()));
    }

    @Override
    public int getItemCount() {
        Log.d("size", String.valueOf(mList.size()));
        return mList.size();
    }
}
