package com.example.glanceable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DevelopmentRecyclerAdapter extends RecyclerView.Adapter<DevelopmentRecyclerAdapter.DevelopmentViewHolder> {
    private Context mContext;
    private ArrayList<DevelopmentCustomData> developmentCustomData;
    private OnDeviceClickListener mOnDeviceClickListener;

    public DevelopmentRecyclerAdapter(Context mContext, ArrayList<DevelopmentCustomData> developmentCustomData, OnDeviceClickListener onDeviceClickListener) {
        this.mContext = mContext;
        this.developmentCustomData = developmentCustomData;
        this.mOnDeviceClickListener = onDeviceClickListener;
    }

    @NonNull
    @Override
    public DevelopmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.development_custom_recycler, parent, false);
        return new DevelopmentViewHolder(view, mOnDeviceClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull DevelopmentViewHolder holder, int position) {
        holder.developmentImage.setImageResource(developmentCustomData.get(position).getDevelopmentImage());
        holder.developmentHead.setText(developmentCustomData.get(position).getDevelopmentHead());
    }

    @Override
    public int getItemCount() {
        return developmentCustomData.size();
    }

    public class DevelopmentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView developmentImage;
        private TextView developmentHead;
        OnDeviceClickListener onDeviceClickListener;

        public DevelopmentViewHolder(@NonNull View itemView, OnDeviceClickListener onDeviceClickListener) {
            super(itemView);

            this.onDeviceClickListener = onDeviceClickListener;

            developmentImage = itemView.findViewById(R.id.developmentImage);
            developmentHead = itemView.findViewById(R.id.developmentHead);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onDeviceClickListener.onDeviceClick(getAdapterPosition());
        }
    }

    public interface OnDeviceClickListener{
        void onDeviceClick(int position);
    }
}
