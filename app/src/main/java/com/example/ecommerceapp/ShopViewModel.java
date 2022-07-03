package com.example.ecommerceapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepository shopRepository = new ShopRepository();
    CartRepository cartRepository = new CartRepository();

    MutableLiveData<Item> mutableItem = new MutableLiveData<>();

    public LiveData<List<CartItem>> getCart() {
        return cartRepository.getCart();
    }

    public boolean addItemToCart(Item item) {
        return cartRepository.addItemToCart(item);
    }

    public void removeItemFromCart(CartItem cartItem) {
        cartRepository.removeItemFromCart(cartItem);
    }

    public void changeQuantity(CartItem cartItem, int quantity) {
        cartRepository.changeQuantity(cartItem, quantity);
    }

    public LiveData<Double> getTotalPrice() {
        return cartRepository.getTotalPrice();
    }

    public void resetCart() {
        cartRepository.initCart();
    }

    public LiveData<List<Item>> getItems() {
        return shopRepository.getItems();
    }

    public void setItem(Item item) {
        mutableItem.setValue(item);
    }

    public LiveData<Item> getItem() {
        return mutableItem;
    }

    public List<LatLng> getLatLngList(){
        return shopRepository.getLatLng();
    }

}
