package com.example.constraintlayoutbasics.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constraintlayoutbasics.R;
import com.example.constraintlayoutbasics.adapters.HorizontalAdapter;
import com.example.constraintlayoutbasics.models.HopeItemModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    public HomeFragment(){}
    RecyclerView horizontalRecyclerView;
    HorizontalAdapter adapter;
    List<HopeItemModel> hopeItemModelList;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        horizontalRecyclerView = view.findViewById(R.id.recyclerViewHope);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        horizontalRecyclerView.setLayoutManager(layoutManager);

        hopeItemModelList = new ArrayList<>();

        hopeItemModelList.add(new HopeItemModel(R.drawable.image1, "Healthy Foods"));
        hopeItemModelList.add(new HopeItemModel(R.drawable.image1, "Healthy Tips"));

        adapter = new HorizontalAdapter(hopeItemModelList);
        horizontalRecyclerView.setAdapter(adapter);

        return view;


    }
}
