package com.example.ecommerceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ecommerceapp.databinding.FragmentItemDetailBinding;

public class ItemDetailFragment extends Fragment {

    FragmentItemDetailBinding fragmentItemDetailBinding;
    ShopViewModel shopViewModel;

    public ItemDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentItemDetailBinding = FragmentItemDetailBinding.inflate(inflater, container, false);
        return fragmentItemDetailBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        fragmentItemDetailBinding.setShopViewModel(shopViewModel);
    }
}
