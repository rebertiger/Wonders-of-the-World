package com.reber.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.reber.wondersoftheworld.databinding.ActivityDetailsBinding;
import com.reber.wondersoftheworld.databinding.ActivityMainBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Landmark selectedLandmark = (Landmark) getIntent().getSerializableExtra("landmark");
        binding.imageName.setText(selectedLandmark.name);
        binding.imageCountry.setText(selectedLandmark.country);
        binding.imageHistory.setText(selectedLandmark.history);
        binding.imageView.setImageResource(selectedLandmark.image);
    }
}