package com.example.alanflores.unidad7_1certificacion.lista;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alanflores.unidad7_1certificacion.R;

/**
 * Created by alan.flores on 12/5/16.
 */

public class AdaptadorLista extends ArrayAdapter<String> {

    Context context;
    String[] nombres;
    String[] descripciones;
    int[] idFotos;

    AdaptadorLista(Context context, int resource, int textViewResourceId, String[] strings){
        super(context,resource,textViewResourceId,strings);
        this.context = context;
    }

    @NonNull
    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(String[] descripciones) {
        this.descripciones = descripciones;
    }

    public int[] getIdFotos() {
        return idFotos;
    }

    public void setIdFotos(int[] idFotos) {
        this.idFotos = idFotos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista = inflater.inflate(R.layout.vista_lista_personalizada,parent,false);

        TextView nombreText = (TextView)vista.findViewById(R.id.texto_nombre);
        TextView descriptuinText = (TextView)vista.findViewById(R.id.texto_description);
        ImageView systemImage = (ImageView)vista.findViewById(R.id.image_lista);

        nombreText.setText(nombres[position]);
        descriptuinText.setText(descripciones[position]);
        systemImage.setImageResource(idFotos[position]);


        return vista;
    }
}
