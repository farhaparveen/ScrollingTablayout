package com.example.scrollingtablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {


    public Fragment1() {
    }


    public static Fragment1 newInstance(int pageNumber)
    {

        Fragment1 fragment1=new Fragment1();
        Bundle bundle=new Bundle();
        bundle.putInt("ARG_PAGE",pageNumber);
        fragment1.setArguments(bundle);
        return fragment1;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle=getArguments();
        int pageNumber=bundle.getInt("ARG_PAGE");

      TextView textView=new TextView(getActivity());
      textView.setText("hello i m the text inside this fragment"+pageNumber);
      textView.setGravity(Gravity.CENTER);
        return  textView;
    }

}
