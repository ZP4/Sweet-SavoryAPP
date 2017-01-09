package com.sweetsavoryapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by derek on 1/5/2017.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodAdapterRv> {


    @Override
    public FoodAdapterRv onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        FoodAdapterRv FDA = new FoodAdapterRv(v);
        return FDA;
    }
    Food main = new Food();
    HashMap American = main.American;


    List<FoodFormat> ffa ;
    Context context;
    FoodAdapter(List <FoodFormat> ffa,Context context){
        this.ffa=ffa;
        this.context=context;
    }

    @Override
    public void onBindViewHolder(FoodAdapterRv holder, int position) {

    }

    @Override
    public int getItemCount() {
     return ffa.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class FoodAdapterRv extends RecyclerView.ViewHolder {

        CardView cv;
        TextView Title, Price, Descript;
        public FoodAdapterRv(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card);
            Title = (TextView)itemView.findViewById(R.id.Title);
            Price = (TextView)itemView.findViewById(R.id.Price);
            Descript = (TextView)itemView.findViewById(R.id.Description);

        }
    }


}
