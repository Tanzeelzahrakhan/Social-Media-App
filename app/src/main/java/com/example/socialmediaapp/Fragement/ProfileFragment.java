package com.example.socialmediaapp.Fragement;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.FriendAdapter;
import com.example.socialmediaapp.Model.FriendModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {
RecyclerView recyclerView;
ArrayList<FriendModel>list;

    FriendAdapter adapter;

    public ProfileFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view =inflater.inflate(R.layout.fragment_profile, container, false);
      recyclerView=view.findViewById(R.id.friendRV);
      list=new ArrayList<>();
      list.add(new FriendModel(R.drawable.profile));
      list.add(new FriendModel(R.drawable.g));
      list.add(new FriendModel(R.drawable.a));
      list.add(new FriendModel(R.drawable.k));
      list.add(new FriendModel(R.drawable.d));
      list.add(new FriendModel(R.drawable.e));
      list.add(new FriendModel(R.drawable.n));
    adapter=new FriendAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
      return view;
    }
}