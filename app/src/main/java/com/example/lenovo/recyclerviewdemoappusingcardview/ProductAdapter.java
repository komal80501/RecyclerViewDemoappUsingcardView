package com.example.lenovo.recyclerviewdemoappusingcardview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.acl.LastOwnerException;
import java.util.List;

//requird
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater= LayoutInflater.from(mCtx);
        View view= layoutInflater.inflate(R.layout.recycler_row,null);
        ProductViewHolder holder= new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int position) {
Product product=productList.get(position);
productViewHolder.tvName.setText(product.getProdName());
productViewHolder.tvDesc.setText(product.getProdDesc());
productViewHolder.tvPrice.setText(product.getProdPrice());
productViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.imgID));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tvName,tvDesc,tvPrice;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imgId);
        tvName=itemView.findViewById(R.id.name);
        tvPrice=itemView.findViewById(R.id.price);
        tvDesc=itemView.findViewById(R.id.desc);
        }
    }
}
