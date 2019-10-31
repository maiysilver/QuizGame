package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cuenta=0;
    private TextView textoPregunta;
    private String[] preguntas ;
    private String[] respuestas;
    private String tostada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        preguntas = res.getStringArray(R.array.preguntas);
        respuestas = res.getStringArray(R.array.respuestas);
        textoPregunta = findViewById(R.id.textoPregunta);
        textoPregunta.setText(preguntas[cuenta]);
    }
    public void truePulsado(View view){
        if(respuestas[cuenta].equals("true")){
           tostada="CORRECTO";
        }else{
            tostada="INCORRECTO";
        }
        Toast toast1 =
                Toast.makeText(getApplicationContext(),tostada, Toast.LENGTH_SHORT);
        toast1.show();
    }
    public void falsePulsado(View v){
        if(respuestas[cuenta].equals("false")){
            tostada="CORRECTO";
        }else{
            tostada="INCORRECTO";
        }
        Toast toast1 =
                Toast.makeText(getApplicationContext(),tostada, Toast.LENGTH_SHORT);
        toast1.show();
    }
    public void previo(View view){
        if(cuenta>0){
            cuenta--;
            textoPregunta.setText(preguntas[cuenta]);
        }else{
            cuenta=preguntas.length-1;
            textoPregunta.setText(preguntas[cuenta]);
        }
    }
    public void siguiente(View view){
        if (cuenta<preguntas.length-1){
            cuenta++;
            textoPregunta.setText(preguntas[cuenta]);
        }else{
            cuenta=0;
            textoPregunta.setText(preguntas[cuenta]);
        }
    }
}
