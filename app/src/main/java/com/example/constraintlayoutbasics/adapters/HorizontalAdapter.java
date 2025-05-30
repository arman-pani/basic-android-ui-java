package com.example.constraintlayoutbasics.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constraintlayoutbasics.R;
import com.example.constraintlayoutbasics.models.HopeItemModel;

import java.util.List;

public  class HorizontalAdapter  extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    final private List<HopeItemModel> itemModelList;

    public HorizontalAdapter(List<HopeItemModel> itemModelList){
        this.itemModelList = itemModelList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;

        public ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.hopeCardImageView);
            titleTextView = view.findViewById(R.id.hopeCardTextView);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter.ViewHolder holder, int position) {
        HopeItemModel item = itemModelList.get(position);

        holder.imageView.setImageResource(item.getImageResId());
        holder.titleTextView.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }
}
