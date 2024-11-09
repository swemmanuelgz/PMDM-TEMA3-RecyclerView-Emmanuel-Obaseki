package com.example.pmdm_tema3_recyclerview_emmanuel_obaseki.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_tema3_recyclerview_emmanuel_obaseki.R;
import com.example.pmdm_tema3_recyclerview_emmanuel_obaseki.model.Contacto;

import java.util.List;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder> {

    private List<Contacto> contactoList;

    public ContactoAdapter(List<Contacto> contactoList) {
        this.contactoList = contactoList;
    }

    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contacto, parent, false);
        return new ContactoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder holder, int position) {
        Contacto contacto = contactoList.get(position);
        holder.txtNombre.setText(contacto.getNombre());
        holder.txtApellidos.setText(contacto.getApellidos());
        holder.txtEmail.setText(contacto.getEmail());
        holder.txtTelefono.setText(contacto.getTelefono());
        holder.imgFoto.setImageResource(contacto.getFotoResId());
    }

    @Override
    public int getItemCount() {
        return contactoList.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView txtNombre, txtApellidos, txtEmail, txtTelefono;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtApellidos = itemView.findViewById(R.id.txtApellidos);
            txtEmail = itemView.findViewById(R.id.txtEmail);
            txtTelefono = itemView.findViewById(R.id.txtTelefono);
        }
    }
}


