package com.example.socialmediaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Model.DashboardModel;
import com.example.socialmediaapp.R;
import com.example.socialmediaapp.databinding.DashboardRvSampleBinding;


import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.viewHolder>{
    ArrayList<DashboardModel>list;
    Context context;

    public DashboardAdapter(ArrayList<DashboardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.dashboard_rv_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DashboardModel model=list.get(position);
        holder.binding.profileImage.setImageResource(model.getPostImage());
        holder.binding.postImg.setImageResource(model.getPostImage());
        holder.binding.save.setImageResource(model.getSave());
        holder.binding.userName.setText(model.getName());
        holder.binding.about.setText(model.getAbout());
        holder.binding.like.setText(model.getLike());
        holder.binding.comment.setText(model.getComment());
        holder.binding.share.setText(model.getShare());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  viewHolder extends RecyclerView.ViewHolder{
    DashboardRvSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=DashboardRvSampleBinding.bind(itemView);
        }
    }
}
