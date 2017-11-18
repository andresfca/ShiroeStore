package com.example.andres.shiroestore.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andres.shiroestore.FinalString;
import com.example.andres.shiroestore.R;
import com.example.andres.shiroestore.activity.AdminMainViewActivity;
import com.example.andres.shiroestore.activity.ProductDetailActivity;
import com.example.andres.shiroestore.model.product.Product;

import java.util.ArrayList;

/**
 * Created by ANDRES on 18/11/2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private AdminMainViewActivity mActivity;
    private ArrayList<Product> mProducts;

    public ProductAdapter(AdminMainViewActivity adminMainViewActivity, ArrayList<Product> products) {
        this.mActivity = adminMainViewActivity;
        this.mProducts = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.bindView(mProducts.get(position), mActivity);
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView photo;
        private TextView price ;
        private TextView name ;
        private TextView cant ;
        private TextView desciption ;
        private AdminMainViewActivity mActivity;
        private Product mProduct;

        public ProductViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.itemImge);
            price = (TextView) itemView.findViewById(R.id.itemPrice);
            cant = (TextView) itemView.findViewById(R.id.itemCant);
            desciption = (TextView) itemView.findViewById(R.id.itemDescription);
            name = (TextView) itemView.findViewById(R.id.itemName);
            itemView.setOnClickListener(this);
        }

        public void bindView(Product product, AdminMainViewActivity activity) {

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mActivity, ProductDetailActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(FinalString.PRODUCT_ID, mProduct.getId());
            bundle.putString(FinalString.PRODUCT_NAME, mProduct.getName());
            bundle.putInt(FinalString.PRODUCT_CATEGORY, mProduct.getCategory());
            bundle.putInt(FinalString.PRODUCT_PRICE, mProduct.getPrice());
            bundle.putInt(FinalString.PRODUCT_CANT, mProduct.getCant());
            bundle.putString(FinalString.PRODUCT_PHOTO, mProduct.getPhoto());
            bundle.putString(FinalString.PRODUCT_DETAIL, mProduct.getDetail());

            intent.putExtra(FinalString.DATA, bundle);
            mActivity.startActivity(intent);
        }
    }
}
