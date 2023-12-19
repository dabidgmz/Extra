package com.example.myapplication.models;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.MainActivity3;
import com.example.myapplication.repositor.ContactoRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactoViewModel extends ViewModel {
    private ContactoRepository contactoRepository = new ContactoRepository();

    public LiveData<List<Contacto>> getListaContactosLiveData() {
        return contactoRepository.getListaContactosLiveData();
    }

    public void realizarAccion(Contacto contacto, View view) {
        switch (contacto.getTipoAccion()) {

            case 1:
                String url = "https://www.youtube.com";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                view.getContext().startActivity(webIntent);
                break;
            case 2:
                Intent infoIntent = new Intent(view.getContext(), MainActivity3.class);
                infoIntent.putExtra("Contacto", contacto);
                view.getContext().startActivity(infoIntent);
                break;
            case 3:
                double latitudLondres = 51.509865;
                double longitudLondres = -0.118092;
                String geoUriLondres = "geo:" + latitudLondres + "," + longitudLondres;
                Intent mapIntentLondres = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUriLondres));
                view.getContext().startActivity(mapIntentLondres);
                break;
            case 4:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + contacto.getNumero()));
                view.getContext().startActivity(callIntent);
                break;
            case 5:
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + contacto.getNumero()));
                view.getContext().startActivity(dialIntent);
                break;
            default:
                break;
        }
    }

}
