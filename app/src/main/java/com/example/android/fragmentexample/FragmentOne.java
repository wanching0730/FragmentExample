package com.example.android.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Fragment;

import java.util.List;

/**
 * Created by USER on 5/6/2017.
 */

public class FragmentOne extends Fragment {

    ListView listView;
    ArrayAdapter <String> adapter;
    String [] versions;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        listView = (ListView) view.findViewById(R.id.list_view);
        versions = getResources().getStringArray(R.array.android_versions);
        adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_view,R.id.row_view, versions);
        listView.setAdapter(adapter);


        return view;


    }
}
