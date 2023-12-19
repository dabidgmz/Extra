package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.models.Contacto;

public class MainActivity3 extends AppCompatActivity {

    TextView nombre,descripcion,edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        nombre = findViewById(R.id.nombrem3);
        descripcion = findViewById(R.id.descripcionm3);
        edad = findViewById(R.id.edadm3);

        Contacto contacto = (Contacto) getIntent().getSerializableExtra("Contacto");
        if(contacto!=null){
            nombre.setText(contacto.getNombre().toString());
            descripcion.setText(contacto.getDescripcion().toString());
            edad.setText(String.valueOf(contacto.getEdad()));
        }

    }
}