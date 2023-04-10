package com.example.socialmediaapp.Fragement;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.NotificationAdapter;
import com.example.socialmediaapp.Model.NotificationModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class Notification2Fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<NotificationModel>list;
    NotificationAdapter adapter;
    public Notification2Fragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view= inflater.inflate(R.layout.fragment_notification2, container, false);
      recyclerView=view.findViewById(R.id.notificationRV);
      list=new ArrayList<>();
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));
      list.add(new NotificationModel(R.drawable.profile,"<b>zahra</b> mention you is a comment","just now"));

      adapter=new NotificationAdapter(list,getContext());
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
      return  view;
    }
}