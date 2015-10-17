package com.example.administrator.lifecyclefragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.lifecycleactivity.R;

/**
 * Created by Administrator on 2015/10/17.
 */
public class LifecycleFragment extends Fragment{

    View rootView;
    @Nullable

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("tag", "onAttach()");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("tag", "onCreate()");

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_lifecyclefragment, container, false);
        Log.i("tag", "onCreateView()");
        return rootView;



    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("tag", "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("tag", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("tag", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("tag", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("tag", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("tag", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("tag", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.i("tag","onDetach()");
    }


}
