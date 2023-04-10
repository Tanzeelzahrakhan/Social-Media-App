package com.example.socialmediaapp.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Model.NotificationModel;
import com.example.socialmediaapp.R;
import com.example.socialmediaapp.databinding.Notification2sampleBinding;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.viewHolder>{
ArrayList<NotificationModel>list;
Context context;

    public NotificationAdapter(ArrayList<NotificationModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.notification2sample,parent,false);
        return new viewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        NotificationModel model=list.get(position);
        holder.binding.profileImage.setImageResource(model.getProfile());
        holder.binding.notification.setText(Html.fromHtml(model.getNotification()));
        holder.binding.time.setText(model.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
    Notification2sampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=Notification2sampleBinding.bind(itemView);
        }
    }
}
