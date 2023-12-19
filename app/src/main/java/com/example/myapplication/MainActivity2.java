package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapters.ContactoAdapter;
import com.example.myapplication.models.Contacto;
import com.example.myapplication.models.ContactoViewModel;
import java.util.ArrayList;
public class MainActivity2 extends AppCompatActivity {
    private ContactoViewModel contactoViewModel;
    private ContactoAdapter contactoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        contactoViewModel = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(ContactoViewModel.class);

        RecyclerView rc = findViewById(R.id.recycler);
        contactoAdapter = new ContactoAdapter(new ArrayList<>(), contactoViewModel);
        rc.setAdapter(contactoAdapter);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
        contactoViewModel.getListaContactosLiveData().observe(this, contactos -> {
            contactoAdapter.setListaContactos(contactos);
            contactoAdapter.notifyDataSetChanged();
        });
    }
}
