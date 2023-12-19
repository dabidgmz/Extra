package com.example.myapplication.repositor;


import androidx.lifecycle.MutableLiveData;
import com.example.myapplication.models.Contacto;
import java.util.ArrayList;
import java.util.List;

public class ContactoRepository {
    private MutableLiveData<List<Contacto>> listaContactosLiveData = new MutableLiveData<>();

    public MutableLiveData<List<Contacto>> getListaContactosLiveData() {
        if (listaContactosLiveData.getValue() == null) {
            List<Contacto> listaContactos = new ArrayList<>();
            listaContactos.add(new Contacto("Jorge", "8713267638", "es una amigo que lo conoci en la escuela", "20", 1));
            listaContactos.add(new Contacto("Maria", "8713267980", " es una amigo que lo conoci en la escuela", "50", 2));
            listaContactos.add(new Contacto("Mom", "8713267765", "es mi mami", "", 3));
            listaContactos.add(new Contacto("Jose", "8713267890", "lo conoci de la calle", "50", 4));
            listaContactos.add(new Contacto("Chnaguito yeso", "8713267654", "se hizo amistad desde tercero", "15", 5));
            listaContactosLiveData.setValue(listaContactos);
        }
        return listaContactosLiveData;
    }
}
