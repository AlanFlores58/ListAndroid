package com.example.alanflores.unidad7_1certificacion.lista;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alanflores.unidad7_1certificacion.R;

public class ListaPersonalizadaActivity extends Activity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);

        listView = (ListView) findViewById(R.id.listView);

        String[] elementos_nombre = getResources().getStringArray(R.array.elementos_lista);
        String[] elementos_description = getResources().getStringArray(R.array.elementos_descropcion);
        int[] elementos_imagenes = {R.drawable.asset1ldpi,
                R.drawable.asset1mdpi,
                R.drawable.asset2ldpi,
                R.drawable.asset3ldpi,
                R.drawable.asset6hdpi};

        final AdaptadorLista adaptadorLista = new AdaptadorLista(this,android.R.layout.simple_list_item_1, R.id.texto_nombre, elementos_nombre);

        adaptadorLista.setContext(this);
        adaptadorLista.setNombres(elementos_nombre);
        adaptadorLista.setDescripciones(elementos_description);
        adaptadorLista.setIdFotos(elementos_imagenes);

        listView.setAdapter(adaptadorLista);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("ListaPersonalizadaActivity","Elemento presionado " + adaptadorLista.getItem(position));
            }
        });
    }
}


    Rebeca Vega	1:06 PM
        1- Tu aplicación para compartir fotos muestra una notificación de sistema cada que el usuario recibe una foto nueva. Tu aplicación debería mostrar la foto cuando el usuario presiona la notificación. Cual de los siguientes debes adjuntar a un objeto de tipo Notification (al pasarlo al NotificationManager) para cumplir dicho objetivo:
        A. Una referencia a tu Activity
        B. Un PendingIntent
        C. Un BroadcastReceiver
        D. Una transacción de Fragments
        To list all available commands enter "/?".

        me	1:07 PM
        C

        Rebeca Vega	1:07 PM
        2- Si tu anidas RelativeLayout dentro de un LinearLayout, qué tipo de LayoutParams debería aceptar el RelativeLayout (si el candidato pregunta, especificar que el LinearLayout es el padre y el RelativeLayout es su único "hijo")
        A. RelativeLayout.LayoutParams
        B. ViewGroup.MarginLayoutParams
        C. ViewGroup.LayoutParams
        D. LinearLayout.LayoutParams

        me	1:09 PM
        A

        Rebeca Vega	1:09 PM
        3- Estás escribiendo una aplicación de monitoreo que periódicamente revisa si un sitio web está disponible. De la siguiente lista, cuál es la mejor manera de programar dichas revisiones periódicas?
        A. Registrar un WakeLock con PowerManager.
        B. Llamar setInexactRepeating en el AlarmManager.
        C. Hacer un Post a un Handler con postDelayed.
        D. Llamar setPeriodicTimer en un TimerService.

        me	1:11 PM
        D

        Rebeca Vega	1:11 PM
        4- Deseas iniciar una animación un segundo y medio después de que un usuario presiona un botón, la mejor manera de hacer esto es:
        A. Llamar Timer.schedule y pasar la animación como un TimerTask.
        B. Llamar Thread.sleep en el método onClick del clickListener del botón
        C. Llamar postDelayed en el Handler apropiado.
        D. Llamar setInterval en un Alarm creado con AlarmManager.

        me	1:13 PM
        C

        Rebeca Vega	1:13 PM
        5- Cuál de los siguientes es verdadero en una implementación por defecto de un Service (Service es la clase, un servicio) declarado en el Manifest de la aplicación?
        A. Se ejecuta en el hilo de la UI
        B. Viene con un Thread asociado para ejecución en segundo plano
        C. Se inicializa automáticamente al iniciar tu app.
        D. Sólo puedes configurarlo para que se comunique con el proceso que lo inició

        me	1:15 PM
        B

        /*
        Rebeca Vega	1:15 PM
        6- Quieres que tu aplicación de mensajería aparezca como opción en un Intent Chooser cuando el usuario comparte contenido desde otra aplicación. Para lograr esto, qué es necesario hacer?
        A. Crear un IntentService en un objeto que herede de Application y escuchar los Intents marcados como SENT_MESSAGE.
        B. Registrar un Broadcast Receiver en el Manifest para recibir Intents marcados como BROADCAST_SMS.
        C. Registrar un ContentObserver y revisar cuando se escribe a Telephony.Sms.Inbox
        D. Registrar un IntentFilter para ACTION_SEND en el Manifest.*/

        me	1:18 PM
        D

        Rebeca Vega	1:18 PM
        7- Cuál de las siguientes no es una buena manera de mejorar el desempeño de scrolling en un ListView?
        //A. Agregar hardwareAccelerated=true a la declaración del ListView en el manifest. Hardware acceleration is enabled by default if your Target API level is >=14 all drawing operations that are performed on a View's canvas use the GPU.
        B. Reducir las llamadas a findViewById usando el patrón ViewHolder.
        C. Reducir la complejidad de los layouts de las celdas
        D. Reusar las vistas que se pasan a Adapter.getView

        me	1:19 PM
        C

        Rebeca Vega	1:19 PM
        8- Tu app tiene una lista de restaurantes incluyendo sus nombres y números telefónicos. Cuál es la mejor manera de almacenar y exponer esta información a otras aplicaciones para que puedan ver los nombres, no ver los números telefónicos y tampoco puedan editar dicha información?
        A. Almacenar la información en el almacenamiento interno, exponer la información a otras apps con RPC vía transacciones de IBinder.
        B. Almacenar la información en SQLite en almacenamiento externo, exponer tablas y columnas específicas utilizando SQL VIEWS (vistas)
        C. Almacenar la información en SharedPreferences, compartir vía SharedPreferences.
        D. Almacenar la información en SQLite en almacenamiento interno, exponer tablas y columnas específicas usando un ContentProvider.

        me	1:20 PM
        D