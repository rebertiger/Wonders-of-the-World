package com.reber.wondersoftheworld;

<<<<<<< HEAD
import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.view.LayoutInflater;
import android.view.View;
=======
import android.view.LayoutInflater;
>>>>>>> origin/master
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.reber.wondersoftheworld.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<Landmark> landmarkList;

    public LandmarkAdapter (ArrayList<Landmark> landmarkList) {
        this.landmarkList = landmarkList;
    }

    public void landmarkList(ArrayList<Landmark> landmarkList){
        this.landmarkList = landmarkList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    @Override
<<<<<<< HEAD
    public void onBindViewHolder(LandmarkHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewTextView.setText(landmarkList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),Details.class);
                intent.putExtra("landmark",landmarkList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
=======
    public void onBindViewHolder(LandmarkHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(landmarkList.get(position).name);
>>>>>>> origin/master
    }

    @Override
    public int getItemCount() {
        return landmarkList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;

        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
