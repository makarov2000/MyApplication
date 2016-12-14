package com.example.student2.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by student2 on 12.12.16.
 */

public class CrimeFragment extends Fragment {
    
    Crime crime;
    EditText mEdit;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.crime_fragment, container, false);
        mEdit = (EditText) v.findViewById(R.id.et);
        return v;
    }
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //mCrime = new Crime();
        mCrimes = CrimeLab.get(getActivity()).getmCrimes();
        for (Crime c: mCrimes){
            Log.v("CRIME",c + "");
        }
    }
    EditText mTitleField;

}
