package com.rukina.fortunevasthu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rukina.fortunevasthu.R;

/**
 * Created by Nandha on 23-10-2016.
 */

public class ContactUsFragment extends Fragment{

    public ContactUsFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);
        return rootView;
    }
}
