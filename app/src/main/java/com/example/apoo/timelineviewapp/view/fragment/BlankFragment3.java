package com.example.apoo.timelineviewapp.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apoo.timelineviewapp.R;


public class BlankFragment3 extends Fragment {


   /* public static BlankFragment3 newInstance (int page, Boolean isLast) {
    Bundle args = new Bundle();
    args.putInt("page",page);
      args.putBoolean("isLast",true);
      final BlankFragment3 fragment = new BlankFragment3();
        fragment.setArguments(args);

        return fragment;
    }*/


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       final View view = inflater.inflate(R.layout.fragment_blank3,container,false);

        return view;
    }


}