package com.example.socialmediaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Model.StoryModel;
import com.example.socialmediaapp.R;
import com.example.socialmediaapp.databinding.StoryRvDesignBinding;

import java.util.ArrayList;

public class StoryAdapter  extends RecyclerView.Adapter<StoryAdapter.viewHolder>{
    ArrayList<StoryModel>list;
    Context context;

    public StoryAdapter(ArrayList<StoryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.story_rv_design,parent,false);
        return new viewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        StoryModel model=list.get(position);
        holder.binding.story.setImageResource(model.getStory());
        holder.binding.profileImage.setImageResource(model.getProfile());
        holder.binding.storyType.setImageResource(model.getStoryTpe());
        holder.binding.name.setText(model.getName());

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
     StoryRvDesignBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=StoryRvDesignBinding.bind(itemView);
        }
    }
}
