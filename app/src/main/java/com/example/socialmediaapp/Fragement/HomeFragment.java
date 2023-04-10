package com.example.socialmediaapp.Fragement;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.DashboardAdapter;
import com.example.socialmediaapp.Adapter.StoryAdapter;
import com.example.socialmediaapp.Model.DashboardModel;
import com.example.socialmediaapp.Model.StoryModel;
import com.example.socialmediaapp.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    RecyclerView storyRv,dashboardRv;
    ArrayList<StoryModel>list;
   ArrayList<DashboardModel>dashboardList;
    StoryAdapter adapter;
    DashboardAdapter dashboardAdapter;
    public HomeFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_home, container, false);
       //story Recyclerview
       storyRv=view.findViewById(R.id.storyRV);
       list=new ArrayList<>();
       list.add(new StoryModel(R.drawable.k,R.drawable.video,R.drawable.a,"Muqdas"));
       list.add(new StoryModel(R.drawable.d,R.drawable.recording,R.drawable.g,"tanzeel"));
       list.add(new StoryModel(R.drawable.e,R.drawable.video,R.drawable.a,"Alia"));
       list.add(new StoryModel(R.drawable.n,R.drawable.recording,R.drawable.k,"Mehrab"));
       list.add(new StoryModel(R.drawable.n,R.drawable.recording,R.drawable.k,"Mehrab"));
      adapter=new StoryAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        storyRv.setLayoutManager(linearLayoutManager);
        storyRv.setNestedScrollingEnabled(false);
        storyRv.setAdapter(adapter);

        //dashBoard Recyclerview
        dashboardRv=view.findViewById(R.id.dashboardRV);
        dashboardList=new ArrayList<>();
        dashboardList.add(new DashboardModel(R.drawable.profile,R.drawable.k,R.drawable.bookmark,"zahra khan",
                "Travler","333","22","10"));
        dashboardList.add(new DashboardModel(R.drawable.a,R.drawable.g,R.drawable.bookmark,"zahra khan",
                "Travler","333","22","10"));
        dashboardList.add(new DashboardModel(R.drawable.profile,R.drawable.d,R.drawable.bookmark,"zahra khan",
                "Travler","333","22","10"));
        dashboardList.add(new DashboardModel(R.drawable.profile,R.drawable.storyimg,R.drawable.bookmark,"zahra khan",
                "Travler","333","22","10"));
        dashboardAdapter=new DashboardAdapter(dashboardList,getContext());
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        dashboardRv.setLayoutManager(layoutManager);
        dashboardRv.setNestedScrollingEnabled(false);
        dashboardRv.setAdapter(dashboardAdapter);


       return  view;
    }
}