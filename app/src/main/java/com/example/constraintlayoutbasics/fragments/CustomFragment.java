package com.example.constraintlayoutbasics.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.constraintlayoutbasics.R;

public class CustomFragment extends Fragment {
    public CustomFragment() {
        super(R.layout.custom_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
