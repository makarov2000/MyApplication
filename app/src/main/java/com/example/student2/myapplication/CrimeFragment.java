package com.example.student2.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by student2 on 12.12.16.
 */

public class CrimeFragment extends Fragment {
    
    Crime crime;
    EditText mEdit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        crime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.crime_fragment, container, false);
        mEdit = (EditText) v.findViewById(R.id.et);
        return v;
    }

}
