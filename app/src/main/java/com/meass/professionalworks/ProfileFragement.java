package com.meass.professionalworks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProfileFragement extends Fragment {

View view;
String key;

    public ProfileFragement() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_profile_fragement, container, false);
        Bundle bundle=new Bundle();
        key=bundle.getString("key");
        return view;
    }
}