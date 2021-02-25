package com.e.bottonnavigation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e.bottonnavigation.adapter.MovementAdapter;
import com.e.bottonnavigation.R;
import com.e.bottonnavigation.model.MovementData;

public class MoveFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for ac fragment
        View view=inflater.inflate(R.layout.fragment_move, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        MovementData[] movementData=new MovementData[]{
                new MovementData("تمرینات سینه",R.drawable.i_muscle_sine),
                new MovementData("تمرینات جلو بازو",R.drawable.i_muscle_jolobazoo),
                new MovementData("تمرینات پشت بازو",R.drawable.i_muscle_poshtbazoo),
                new MovementData("تمرینات شکم",R.drawable.i_muscle_shekam),
                new MovementData("تمرینات شانه",R.drawable.i_muscle_shane),
                new MovementData("تمرینات مچ و ساعد",R.drawable.i_muscle_moch),
                new MovementData("تمرینات پشت و پهلو",R.drawable.i_muscle_posht),
                new MovementData("تمرینات زیر بغل",R.drawable.i_muscle_zirbaghal),
                new MovementData("تمرینات پشت پا",R.drawable.i_muscle_poshtpa),
                new MovementData("تمرینات جلو پا",R.drawable.i_muscle_jolopa),
                new MovementData("تمرینات ساق پا",R.drawable.i_muscle_saghpa),
        };
      MovementAdapter movementAdapter = new MovementAdapter(movementData,MoveFragment.this);
      recyclerView.setAdapter(movementAdapter);
        return view;

    }
}