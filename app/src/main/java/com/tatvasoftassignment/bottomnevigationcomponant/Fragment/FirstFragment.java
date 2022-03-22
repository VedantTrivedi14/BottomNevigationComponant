package com.tatvasoftassignment.bottomnevigationcomponant.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tatvasoftassignment.bottomnevigationcomponant.R;
import com.tatvasoftassignment.bottomnevigationcomponant.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {


    FragmentFirstBinding binding;
    public FirstFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first,container,false);

        return binding.getRoot();
    }
}