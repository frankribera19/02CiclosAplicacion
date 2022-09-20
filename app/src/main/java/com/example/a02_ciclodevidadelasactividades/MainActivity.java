package com.example.a02_ciclodevidadelasactividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.logging.LogManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("CCICLO DE VIDA","Estoy ejecutando onResume");
    }
}