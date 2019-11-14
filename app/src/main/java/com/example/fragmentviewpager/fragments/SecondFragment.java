package com.example.fragmentviewpager.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentviewpager.R;


public class SecondFragment extends Fragment {

    private Button btnArea;
    private EditText etRadius;

    public SecondFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        etRadius = view.findViewById(R.id.etRadius);
        btnArea = view.findViewById(R.id.btnArea);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float radius  = Float.parseFloat(etRadius.getText().toString());

                float area = 3.14f*radius*radius;

                Toast.makeText(getActivity(),"Area of Circle is : "+area,Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
