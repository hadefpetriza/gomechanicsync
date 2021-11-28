package com.example.gomechanic_sync;

import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gomechanic_sync.R;

import java.util.ArrayList;

public class MechanicAdapter extends RecyclerView.Adapter<MechanicAdapter.MechanicViewHolder>{

    public class MechanicViewHolder extends RecyclerView.ViewHolder{

        TextView textNama, textNomor;
        ImageView imageImage;

        public MechanicViewHolder(@NonNull View itemView) {
            super(itemView);
            textNama = itemView.findViewById(R.id.nama3);
            textNomor = itemView.findViewById(R.id.no3);
            imageImage = itemView.findViewById(R.id.imageView5);
        }
    }

    ArrayList<Mechanic> listMechanic = new ArrayList<>();

    public void setListMechanic(ArrayList<Mechanic> listMechanic) {
        this.listMechanic = listMechanic;
    }

    @NonNull
    @Override
    public MechanicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_mech, parent, false);
        MechanicViewHolder viewHolder = new MechanicViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MechanicViewHolder viewHolder, int position) {
        Mechanic mechanic = listMechanic.get(position);
        viewHolder.textNama.setText(mechanic.nama);
        viewHolder.textNomor.setText(mechanic.nomor);
        viewHolder.imageImage.setImageResource(R.drawable.profile);

    }

    @Override
    public int getItemCount() {
        return listMechanic.size();
    }
}
