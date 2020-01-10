package com.example.foodadminapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodadminapp.Adapters.FoodItemAdapter;
import com.example.foodadminapp.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    public static RecyclerView rView;
    // public static RecyclerView rView;
    private FoodItemAdapter mAdapter;
    Button mCrossBtn;
    public static FrameLayout mFrame;

    //array-list for adding data in it start
    private ArrayList<Integer> mImages = new ArrayList<>();
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mQty = new ArrayList<>();
    private ArrayList<String> mPrice = new ArrayList<>();
    private ArrayList<String> mTotalPrice = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });




        rView = root.findViewById(R.id.recyclerViewOrderItem);
        initData();
        mAdapter = new FoodItemAdapter(getContext(), mImageNames, mImages, mQty, mPrice, mTotalPrice);
        rView.setAdapter(mAdapter);
        rView.setLayoutManager(new LinearLayoutManager(getContext()));




        return root;
    }


    public void initData(){
        //   Log.d(TAG, "initBitmaps: preparing data ");

        mImages.add(R.drawable.food_bg_1);
        mImageNames.add("Chicken Biryani");
        mQty.add("(1 Plate)");
        mPrice.add("Price per Plate: 120");
        mTotalPrice.add("Total: 0.0 Rupees");

        mImages.add(R.drawable.nav_header_image);
        mImageNames.add("Beef Pulao");
        mQty.add("(1 Plate)");
        mPrice.add("Price per Plate: 120");
        mTotalPrice.add("Total: 0.0 Rupees");

        mImages.add(R.drawable.app_logo);
        mImageNames.add("Rabri Kheer");
        mQty.add("(1 Kg)");
        mPrice.add("Price per Plate: 560");
        mTotalPrice.add("Total: 0.0 Rupees");

        mImages.add(R.drawable.nav_header_image);
        mImageNames.add("Zarda");
        mQty.add("(1 Kg)");
        mPrice.add("Price per Plate: 80");
        mTotalPrice.add("Total: 0.0 Rupees");

        mImages.add(R.drawable.food_bg_1);
        mImageNames.add("Daal Chawal");
        mQty.add("(1 Plate)");
        mPrice.add("Price per Plate: 100");
        mTotalPrice.add("Total: 0.0 Rupees");

        mImages.add(R.drawable.nav_header_image);
        mImageNames.add("Nihari");
        mQty.add("(1 Plate)");
        mPrice.add("Price per Plate: 180");
        mTotalPrice.add("Total: 0.0 Rupees");

        // initRecyclerView();
    }






}