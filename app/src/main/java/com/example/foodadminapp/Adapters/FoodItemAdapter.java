package com.example.foodadminapp.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodadminapp.R;

import java.util.ArrayList;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.foodItemsViewHolder>{

    Context mContext;
    private ArrayList<String> mFoodNames = new ArrayList<String>();
    private ArrayList<Integer> mFoodImages = new ArrayList<Integer>();
    private ArrayList<String> mFoodQty = new ArrayList<String>();
    private ArrayList<String> mFoodPrice = new ArrayList<String>();
    private ArrayList<String> mFoodTotalPrice = new ArrayList<String>();
    //    private ArrayList<ImageView> mImageViewMinus = new ArrayList<ImageView>();
//    private ArrayList<ImageView> mImageViewPlus = new ArrayList<ImageView>();
//    private ArrayList<Integer> mTxtQty = new ArrayList<Integer>();
//    private ArrayList<Button> mBtnAddToCart = new ArrayList<Button>();
    private Integer count = 0;

    private static final String TAG = "FoodItemAdapter adapter";

    public FoodItemAdapter(Context mContext, ArrayList<String> mFoodNames, ArrayList<Integer> mFoodImages, ArrayList<String> mFoodQty, ArrayList<String> mFoodPrice, ArrayList<String> mFoodTotalPrice) {
        this.mContext = mContext;
        this.mFoodNames = mFoodNames;
        this.mFoodImages = mFoodImages;
        this.mFoodQty = mFoodQty;
        this.mFoodPrice = mFoodPrice;
        this.mFoodTotalPrice = mFoodTotalPrice;
    }

    @NonNull
    @Override
    public foodItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_item_cardview, parent, false);
        foodItemsViewHolder holder = new foodItemsViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final foodItemsViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder called");

        Glide.with(mContext)
                .asBitmap()
                .load(mFoodImages.get(position))
                .into(viewHolder.fImage);

        viewHolder.fName.setText(mFoodNames.get(position));
        viewHolder.fQty.setText(mFoodQty.get(position));
        viewHolder.fPrice.setText(mFoodPrice.get(position));
        viewHolder.fTotalPrice.setText(mFoodTotalPrice.get(position));

//        viewHolder.fMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(mContext, "Minus Button Clicked. ", Toast.LENGTH_SHORT).show();
//            }
//        });
//        viewHolder.fPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(mContext, "Plus Button Clicked. ", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        viewHolder.fTotalQty.setText(0);
        viewHolder.fAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Add to Cart Button Clicked. ", Toast.LENGTH_SHORT).show();
            }
        });

//        viewHolder.fCardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: clicked on --> " + mFoodNames.get(position));
//
//                FoodItemsActivity.rView.setVisibility(View.GONE);
//                FoodItemsActivity.mFrame.setVisibility(View.VISIBLE);
//
//                //adding text in FRAGMENT start
//
//                //adding text in FRAGMENT end
//
//                loadFragment();
//
//                Toast.makeText(mContext, mFoodNames.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mFoodNames.size();
    }

    public class foodItemsViewHolder extends RecyclerView.ViewHolder{

        CardView fCardView;
        ImageView fImage;
        TextView fName;
        TextView fQty;
        TextView fPrice;
        TextView fTotalPrice;
        ImageView fMinus;
        ImageView fPlus;
      //  TextView fTotalQty;
        Button fAddToCart;

        public foodItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            fCardView = itemView.findViewById(R.id.cvRecyclerView);
            fImage = itemView.findViewById(R.id.ivFoodItem);
            fName = itemView.findViewById(R.id.txtFoodName);
            fQty = itemView.findViewById(R.id.txtFoodQty);
            fPrice = itemView.findViewById(R.id.txtFoodPrice);
            fTotalPrice = itemView.findViewById(R.id.txtFoodTotalPrice);
         //   fMinus = itemView.findViewById(R.id.ivMinus);
         //   fPlus = itemView.findViewById(R.id.ivPlus);
          //  fTotalQty = itemView.findViewById(R.id.txtTotalQty);
            fAddToCart = itemView.findViewById(R.id.btnAddToCart);
        }
    }
//
//    private void loadFragment(){
////        Fragment fragment = ((AppCompatActivity)mContext).getSupportFragmentManager().findFragmentById( R.id.fragment_container );
//
//        FragmentCardVeiwDetail fragment = FragmentCardVeiwDetail.newInstance();
//
//        FragmentManager manager = ((AppCompatActivity)mContext).getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
////        String tag = fragment.getClass().getSimpleName();
//        transaction.add(R.id.fragment_container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }


}

