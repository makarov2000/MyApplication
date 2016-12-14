package com.example.student2.myapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by student2 on 14.12.16.
 */

public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private  CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            Crime crime = new Crime("crime #"+i);
            crime.setIsSolved(i % 2 == 0);
            mCrimes.add(crime);
        }

    }
    public static CrimeLab get (Context c){
        if(sCrimeLab==null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getmCrimes() {
        return mCrimes;
    }
    public Crime getCrime(UUID id){
        for (Crime c : mCrimes){
            if (c.getId().equals(id));
            return c;
        }
        return  null;
    }
}
