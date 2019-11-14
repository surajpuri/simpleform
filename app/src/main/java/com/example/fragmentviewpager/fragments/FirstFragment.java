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

public class FirstFragment extends Fragment {

    private Button btnCalculate;
    private EditText etFirst, etSecond;

    public FirstFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(etFirst.getText().toString());
                int second = Integer.parseInt(etSecond.getText().toString());

                int result = first + second;

                Toast.makeText(getActivity(),"Sum is: "+result,Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
