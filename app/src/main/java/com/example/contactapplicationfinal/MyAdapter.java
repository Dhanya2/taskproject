package com.example.contactapplicationfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    private ArrayList<RowModel> rowmodelList;

    public MyAdapter(ArrayList<RowModel> rowmodel) {
        this.rowmodelList = rowmodel;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View item=inflater.inflate(R.layout.item_list,null,false);
        MyViewHolder viewHolder=new MyViewHolder(item);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        RowModel currentItem=rowmodelList.get(position);
        holder.name.setText(currentItem.getName());
        /*holder.imageView.setImageResource(rowmodel[position].getImgId());*/
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"item clicked out",Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*@Override
    public int getItemViewType(int position) {
        switch (rowmodelList.get(position).getViewType()){
            case 0:
                return RowModel.LayoutOne;
            case 1:
                return RowModel.LayoutTwo;
            default:
                return -1;
        }
    }*/

    @Override
    public int getItemCount() {
        return rowmodelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;

        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            /*imageView=itemView.findViewById(R.id.imageView);*/
            name=itemView.findViewById(R.id.textView);

            cardView=itemView.findViewById(R.id.cardView);

        }
    }
}
