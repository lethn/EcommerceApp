package com.example.ecommerceapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.databinding.ShopRowBinding;

public class ShopListAdapter extends ListAdapter<Item, ShopListAdapter.ShopViewHolder> {

    ShopInterface shopInterface;
    public ShopListAdapter(ShopInterface shopInterface) {
        super(Item.itemCallback);
        this.shopInterface = shopInterface;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ShopRowBinding shopRowBinding = ShopRowBinding.inflate(layoutInflater, parent, false);
        shopRowBinding.setShopInterface(shopInterface);
        return new ShopViewHolder(shopRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        Item item = getItem(position);
        holder.shopRowBinding.setItem(item);
        holder.shopRowBinding.executePendingBindings();
    }

    class ShopViewHolder extends RecyclerView.ViewHolder {

        ShopRowBinding shopRowBinding;

        public ShopViewHolder(ShopRowBinding binding) {
            super(binding.getRoot());
            this.shopRowBinding = binding;
        }
    }

    public interface ShopInterface {
        void addItem(Item item);
        void onItemClick(Item item);
    }
}
