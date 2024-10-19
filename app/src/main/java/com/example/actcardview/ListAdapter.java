package com.example.actcardview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListadoDeElementos> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListadoDeElementos> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.listado, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListadoDeElementos> items) {
        mData = items;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage;
        TextView nombre, ciudad, descripcion;

        ViewHolder(View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.IconImageView);
            nombre = itemView.findViewById(R.id.nombreTextView);
            ciudad = itemView.findViewById(R.id.ciudadTextView);
            descripcion = itemView.findViewById(R.id.descripcionTextView);
        }

        void bindData(ListadoDeElementos item) {
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);

            // Asigna la imagen correcta a cada universidad
            switch (item.getNombre()) {
                case "Universidad de la Serena":
                    iconImage.setImageResource(R.drawable.logo_uls_8);
                    break;
                case "Santo Tomas":
                    iconImage.setImageResource(R.drawable.santotomas);
                    break;
                case "Ip Chile":
                    iconImage.setImageResource(R.drawable.logoipchile);
                    break;
                case "Ucn":
                    iconImage.setImageResource(R.drawable.escudo_ucn_logos);
                    break;
                default:
                    iconImage.setImageResource(R.drawable.logo_inacap);
                    break;
            }

            nombre.setText(item.getNombre());
            ciudad.setText(item.getCiudad());
            descripcion.setText(item.getDescripcion());
        }
    }
}