package com.lakareasemobile.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.lakareasemobile.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListner listner;

    public ProductViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_image);
        txtProductName = itemView.findViewById(R.id.product_name);
        txtProductDescription = itemView.findViewById(R.id.product_description);
        txtProductPrice = itemView.findViewById(R.id.product_price);

        itemView.setOnClickListener(this);
    }


    public interface ItemClickListner {
        void onClick(View view, int position, boolean isLongClick);
    }


    public void setItemClickListner(ItemClickListner listner) {
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        if (listner != null) {
            listner.onClick(view, getAdapterPosition(), false);
        }
    }
}
