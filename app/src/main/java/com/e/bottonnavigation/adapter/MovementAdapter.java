package com.e.bottonnavigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.e.bottonnavigation.R;
import com.e.bottonnavigation.fragment.MoveFragment;
import com.e.bottonnavigation.model.MovementData;

public class MovementAdapter extends RecyclerView.Adapter<MovementAdapter.ViewHolder> {

    MovementData[] movementData;
    MoveFragment context;

    public MovementAdapter(MovementData[] movementData,MoveFragment moveFragment) {

        this.movementData=movementData;
        this.context=moveFragment;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.move_item_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MovementData movementDataList=movementData[position];

        holder.textMovie.setText(movementDataList.getMoveName());
        Glide.with(context).load(movementDataList.getMoveImg()).into( holder.moveView);

    }

    @Override
    public int getItemCount() {
        return movementData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView moveView;
        TextView textMovie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            moveView=itemView.findViewById(R.id.imageView);
            textMovie=itemView.findViewById(R.id.textName);
        }
    }
}
