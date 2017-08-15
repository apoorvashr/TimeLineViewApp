package com.example.apoo.timelineviewapp.view.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.apoo.timelineviewapp.R;
import com.example.apoo.timelineviewapp.view.fragmentactivity.FragActivity;


public class BlankFragment extends Fragment implements IFragment1,View.OnClickListener {

    TextInputEditText editTextUserName,edtEditTextPass;
    Button buttonLogin;
    final String USERNAME = "abc";
    final String PASSWORD = "pass";
    int idClicked;
    FragActivity activity;
    Boolean isClicked;

    @SuppressLint("ValidFragment")
    public BlankFragment(Boolean isClicked,FragActivity activity) {
        this.isClicked = isClicked;
        this.activity = new FragActivity(this.getActivity(),isClicked);
    }

    public BlankFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       final View view = inflater.inflate(R.layout.fragment_blank,container,false);

       editTextUserName = (TextInputEditText) view.findViewById(R.id.login_user_name_form_edit_text);
       edtEditTextPass = (TextInputEditText) view.findViewById(R.id.login_password_form_edit_text);
       buttonLogin = (Button)view.findViewById(R.id.login_sign_in_btn);
       buttonLogin.setOnClickListener(this);
        return view;
    }

    //TODO: interface overrided method
    @Override
    public void saveBtnClick(int item,Boolean isClicked) {
        if (!(isClicked.equals(""))) {
            Log.d("BTN_CLICKED_EVENT_CAP", "saveBtnClick: " + isClicked);
        }

    }

    @Override
    public void onClick(View view) {

        idClicked =view.getId();

        if (idClicked==R.id.login_sign_in_btn) {
            Boolean isClicked = true;
            saveBtnClick(1,isClicked);
        }
    }
}