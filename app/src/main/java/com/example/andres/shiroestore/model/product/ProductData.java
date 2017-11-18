package com.example.andres.shiroestore.model.product;

import com.example.andres.shiroestore.FinalString;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by ANDRES on 18/11/2017.
 */

public class ProductData {
    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public static ArrayList<Product> mProducts = new ArrayList<>();

    public static void addProduct(Product product){
        product.setId(databaseReference.push().getKey());
        databaseReference.child(FinalString.productsDB).child(product.getId()).setValue(product);
    }

    public static void deleteProduct(Product product) {
        databaseReference.child(FinalString.productsDB).child(product.getId()).removeValue();
    }

    public static void editProdduct(Product product) {
        databaseReference.child(FinalString.productsDB).child(product.getId()).setValue(product);
    }

    public static ArrayList<Product> getProduct(){
        return mProducts;
    }
}
