package com.example.attandenceteacherside.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.attandenceteacherside.R;


public class MyAttendanceFragment extends Fragment {
    View view;
private LinearLayout attendance_summary;
    private TextView forgotto_clockin;

    public MyAttendanceFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_attendance, container, false);
        iniwidgets();
        NavController navController = NavHostFragment.findNavController(this);
        forgotto_clockin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action1 = HomeFragmentDirections.actionHomeFragmentToMarkAttendanceFragment();
                navController.navigate(action1);
            }
        });
        attendance_summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action2 = HomeFragmentDirections.actionHomeFragmentToAttendanceSummaryFragment();
                navController.navigate(action2);
            }
        });
        return view;
    }

    private void iniwidgets() {
        forgotto_clockin = view.findViewById(R.id.forget_toclockin_tv);
        attendance_summary = view.findViewById(R.id.attendance_summary_layout);
    }
}