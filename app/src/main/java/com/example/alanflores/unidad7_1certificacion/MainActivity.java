package com.example.alanflores.unidad7_1certificacion;

import android.app.TabActivity;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.alanflores.unidad7_1certificacion.lista.ListaPersonalizadaActivity;
import com.example.alanflores.unidad7_1certificacion.lista.ListaSimpleActivity;

public class MainActivity extends TabActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("lista_simple");
        Intent intentListaSimple = new Intent(this, ListaSimpleActivity.class);
        tabSpec1.setContent(intentListaSimple);
        tabSpec1.setIndicator("Lista Simple");

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("lista_personalizada");
        Intent intentListaPerso = new Intent(this, ListaPersonalizadaActivity.class);
        tabSpec2.setContent(intentListaPerso);
        tabSpec2.setIndicator("Lista personalizada");
        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);

    }
}
