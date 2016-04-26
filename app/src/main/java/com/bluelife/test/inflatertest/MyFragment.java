package com.bluelife.test.inflatertest;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.ButterKnife;

/**
 * Created by HiWin10 on 2016/4/26.
 */
public class MyFragment extends Fragment {
    private static final String TAG = "frag";
    private Context context=getActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment,container,false);
        ButterKnife.bind(this,view);
        Button btn= (Button) view.findViewById(R.id.button2);

        return view;
    }


    public void doSomething(View v){
        Log.d(TAG,"test");
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
