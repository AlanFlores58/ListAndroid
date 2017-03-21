package com.example.alanflores.unidad7_1certificacion.lista;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alanflores.unidad7_1certificacion.R;

public class ListaSimpleActivity extends Activity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("onCreate","onCreate");
        setContentView(R.layout.activity_lista_simple);

        listView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> miArrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.elementos_lista));

        listView.setAdapter(miArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("ListaSimpleActivity","Elemento precionado " + miArrayAdapter.getItem(position));
            }
        });
    }

    @Override
    protected void onResume() {
        Log.v("onResume","onResume");
        super.onResume();
    }
}
