package com.tatvasoftassignment.bottomnevigationcomponant.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tatvasoftassignment.bottomnevigationcomponant.R;
import com.tatvasoftassignment.bottomnevigationcomponant.databinding.FragmentSecondBinding;
import com.tatvasoftassignment.bottomnevigationcomponant.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {


    FragmentThirdBinding binding;
    public ThirdFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_third,container,false);

        return binding.getRoot();

    }
}