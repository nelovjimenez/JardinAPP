package com.example.jardin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<Municipio> listaDeMunicipio = new ArrayList<>();

    RecyclerView listadoGrafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listadoGrafico=findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearLista();
        ListaAdaptador adaptador= new ListaAdaptador(listaDeMunicipio);
        listadoGrafico.setAdapter(adaptador);
    }

    private void crearLista(){

        listaDeMunicipio.add(new Municipio("Municipio De Jardin",R.drawable.avatar1, getString(R.string.descripcion1)));
        listaDeMunicipio.add(new Municipio("Gastronomia",R.drawable.avatar2,getString(R.string.descripcion2)));
        listaDeMunicipio.add(new Municipio("Actividades",R.drawable.avatar3,getString(R.string.descripcion3)));
        listaDeMunicipio.add(new Municipio("Hoteles",R.drawable.avatar4,getString(R.string.descripcion4)));
        listaDeMunicipio.add(new Municipio("Paisajes",R.drawable.avatar5,getString(R.string
                .descripcion5)));
    }

}