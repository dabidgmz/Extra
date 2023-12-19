package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.models.Contacto;
import com.example.myapplication.models.ContactoViewModel;
import java.util.List;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ViewHolder> {
    private List<Contacto> listaContactos;
    private ContactoViewModel contactoViewModel;

    public ContactoAdapter(List<Contacto> listaContactos, ContactoViewModel contactoViewModel) {
        this.listaContactos = listaContactos;
        this.contactoViewModel = contactoViewModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contacto contacto = listaContactos.get(position);
        holder.setData(contacto);
        holder.itemView.setOnClickListener(v -> contactoViewModel.realizarAccion(contacto, v));
    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private Contacto contacto;
        private TextView nombre, accion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            accion = itemView.findViewById(R.id.accion);
        }

        public void setData(Contacto contacto) {
            this.contacto = contacto;
            nombre.setText(contacto.getNombre());
            accion.setText("Ir");
        }
    }
}

