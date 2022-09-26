package com.example.a02_ciclodevidadelasactividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.logging.LogManager;

public class MainActivity extends AppCompatActivity {

    //Varianbles de vista
    private Button btnAbrirHijo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("CCICLO DE VIDA","Estoy ejecutando actividad 1");

        btnAbrirHijo = findViewById(R.id.btnAbridAc2Main);

        btnAbrirHijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * Intent ==> Conductor para creacion y apertura de actividades
                 *
                 * - Implicitos: Ya programados - Camara, Galeria, Operaciones estandar del móvil
                 * - Explicitos: Programas para brir nuestras aoctividades
                 *      -Context -> La actividad en la que estoy (Retorno)
                 *      -Destino -> la actividad que quiero abrir
                 */
                Intent intent = new Intent(MainActivity.this, HijoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onStart ACTIVIDAD 1");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onRestart ACTIVIDAD 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onStop ACTIVIDAD 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onDestroy ACTIVIDAD 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onPause ACTIVIDAD 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onResume ACTIVIDAD 1");
    }
}