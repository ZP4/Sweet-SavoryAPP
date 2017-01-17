package com.sweetsavoryapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by derek on 1/5/2017.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodAdapterRv> {

    public Context getContext() {
        return context;
    }

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

        //if(!ffa.get(position).getHeader()) {
/*
if(ffa.get(position).getTitle().equals("Appitizer")||ffa.get(position).getTitle().equals("Entrees")||ffa.get(position).getTitle().equals("Desserts")||ffa.get(position).getTitle().equals("Side Dish")){


    holder.Title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
}*/
        holder.Title.setText(ffa.get(position).getTitle() + " " + ffa.get(position).getId());
        holder.Descript.setText(ffa.get(position).getDescript());
        holder.Price.setText(ffa.get(position).getPrice());
        holder.Serving.setText(ffa.get(position).getQuantaty());
    /*}else if(ffa.get(position).getHeader()){//||ffa.get(position).getTitle()=="Appitizer"||ffa.get(position).getTitle()=="Entrees"){
        holder.Title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
        holder.Title.setGravity(View.TEXT_ALIGNMENT_CENTER);
        holder.Title.setPadding(170, 0,0,0);
        holder.Title.setText(ffa.get(position).getTitle());
        holder.Descript.setText(ffa.get(position).getDescript());
        holder.Price.setText(ffa.get(position).getPrice());
        holder.Serving.setText(ffa.get(position).getQuantaty());
    }
    */}

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
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

      public   CardView cv;
        public TextView Title, Price, Descript, Serving;
        public FoodAdapterRv(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card);
            Title = (TextView)itemView.findViewById(R.id.Title);
            Price = (TextView)itemView.findViewById(R.id.Price);
            Descript = (TextView)itemView.findViewById(R.id.Description);
            Serving = (TextView)itemView.findViewById(R.id.Servings);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                                    }
            });
        }
    }
    public static void launch(){



    }
}
