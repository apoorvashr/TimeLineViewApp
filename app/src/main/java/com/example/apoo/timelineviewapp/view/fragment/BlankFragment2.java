package com.example.apoo.timelineviewapp.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apoo.timelineviewapp.R;


   public class BlankFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       final View view = inflater.inflate(R.layout.fragment_blank2,container,false);

        return view;
    }


}

/*
*
*
* ((PlaceOrderActivity) getActivity()).setCurrentItem(1, true);
*
* */