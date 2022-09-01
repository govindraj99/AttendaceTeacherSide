package com.example.attandenceteacherside.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.attandenceteacherside.R;


public class MarkAttendanceFragment extends Fragment {
    private View view;

    public MarkAttendanceFragment() {
        // Required empty public constructor
    }

   
    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_mark_attendance, container, false);
        initwidigets();
        return view;
    }

    private void initwidigets() {
    }
}