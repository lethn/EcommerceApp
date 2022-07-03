package com.example.ecommerceapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepository {

    private MutableLiveData<List<Item>> mutableItemList;
    private List<LatLng> LatLngList;

    public LiveData<List<Item>> getItems() {
        if (mutableItemList == null) {
            mutableItemList = new MutableLiveData<>();
            loadItems();
        }
        return mutableItemList;
    }

    private void loadItems() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(UUID.randomUUID().toString(), "Seafood Fried Rice", 35000, true, "https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image1.png?alt=media&token=b17aa562-9e89-429d-ad15-e156e6abb844"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Saba Fish Rice", 35000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image2.png?alt=media&token=a32f6536-df13-4400-9fe2-22721e6f11c5"));
        itemList.add(new Item(UUID.randomUUID().toString(), "YangZhou Fried Rice", 30000, false,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image3.png?alt=media&token=ab372077-08ea-44b1-9443-9a8178978b52"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Chocolate Croissant", 16000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image4.png?alt=media&token=3bb16705-e111-43fd-8a83-bc99719ec4f6"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Burger Chicken", 24000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image5.png?alt=media&token=d02b4a57-0a34-4349-a24f-23d44a7acfc7"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Steamed Rice Rolls", 26000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image6.png?alt=media&token=1035ce91-5e25-4c45-aaec-719abaa9f516"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Cheese Castella Cake", 14000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image7.png?alt=media&token=f5ccf25f-2862-432a-ae4b-c73ed7ab9e9f"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Thick Rice Noodle", 31000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image8.png?alt=media&token=24927321-5cd6-4392-babd-defabaf75248"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Sandwich Mixed", 30000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image9.png?alt=media&token=94d9f32f-1136-4c43-b87d-d20149ecf9a2"));
        itemList.add(new Item(UUID.randomUUID().toString(), "Black/Iced Coffee", 20000, true,"https://firebasestorage.googleapis.com/v0/b/cs426-apcs2020-353902.appspot.com/o/Image10.png?alt=media&token=49dd041f-bcc7-4608-91ca-0e91182e0a22"));
        mutableItemList.setValue(itemList);
    }

    /*private void loadDetailOfItems() {
        detailOfItemsList.add("Seafood fried rice always attracts people with soft hunted rice seeds mixed with the rich fresh seafood flavor. It is a combination of the crunchy taste of squid, the sweetness of shrimp, the exotic crab stick, the taste of fried rice and the sweetness of peas, corn, and carrots.");
        detailOfItemsList.add("Saba fish special marinated with teriyaki sauce, served with white rice. Boiled vegetables add nutrients, making the meal more great.");
        detailOfItemsList.add("Change the recipe for fried rice. With ingredients including familiar ingredients such as chicken eggs, sausages, carrots, … the combination creates an attractive, harmonious and delicious taste.");
        detailOfItemsList.add("Crispy thin crust mixed with delicious cocoa, inside the fatty chocolate roll, topped with chocolate sauce to bring a wonderful, irresistible taste.");
        detailOfItemsList.add("Healthy burger with chicken patties and lettuce, serve with chili sauce, ketchup to bring a new delicious dish for break fast and expand customer for new price zone.");
        detailOfItemsList.add("The soft and flexible stearmed rice roll shell. The pork and shrimp are marinated with spices just eaten inside the cake, when eaten with a bit of typical chili fish sauce, it will add a rich and delicious flavor.");
        detailOfItemsList.add("The cake has a soft and smooth structure and is attractive by the fatty aroma of cheese, the combination of sweet and salty flavors is very strange.");
        detailOfItemsList.add("Use the new ingredients is the Thick rice noodle have the shape cylinder. Shrimp cut small, marinated fish sauce, sugar, pepper, onion purple, make so sweet, stir-fry with eggs make fatty.");
        detailOfItemsList.add("The combination of the fatty taste of the sunny side egg, the salty taste of the smoked garlic sausage, the fresh taste of lettuce and tomatoes, brings the dish with full color, nutrition and flavor.");
        detailOfItemsList.add("Adding size L for convenient iced black coffee, Coffee is roasted, ground, carefully filtered with 100% pure Robusta and Arabica mixed beans, fragrantly roasted to bring the right cup of coffee, creating a perfect cup of coffee. characteristic flavor.\n" + "Adding size L for convenient iced milk coffee, pure coffee combined with greasy condensed milk creates a rich flavor, a harmony between sweetness and delicious bitterness.");
    }*/

    public List<LatLng> getLatLng(){
        if(LatLngList == null){
            LatLngList = new ArrayList<>();
            loadLatLng();
        }
        return LatLngList;
    }

    private void loadLatLng(){
        LatLngList.add(new LatLng(10.762392292279387, 106.6828408583214));
        LatLngList.add(new LatLng(10.761506921237377, 106.68133882120677));
        LatLngList.add(new LatLng(10.757332994160748, 106.68318418109047));
        LatLngList.add(new LatLng(10.755351412596788, 106.68193963605262));
        LatLngList.add(new LatLng(10.760284261714023, 106.67335656682604));
        LatLngList.add(new LatLng(10.75269522965522, 106.67211202178818));
        LatLngList.add(new LatLng(10.762392292279387, 106.66833547132849));
        LatLngList.add(new LatLng(10.75691138215239, 106.66846421736689));
        LatLngList.add(new LatLng(10.75944104536066, 106.66571763521439));
        LatLngList.add(new LatLng(10.755773026785839, 106.66580346590665));
        LatLngList.add(new LatLng(10.754676828668543, 106.6646876669072));
        LatLngList.add(new LatLng(10.754887636308172, 106.66155484663949));
        LatLngList.add(new LatLng(10.750165509874616, 106.6612973545627));
        LatLngList.add(new LatLng(10.753538464868843, 106.66031030160163));
        LatLngList.add(new LatLng(10.753664949947593, 106.65511754471956));
    }
}

