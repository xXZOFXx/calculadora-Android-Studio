package com.example.calculadorazuniga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


            //declarando variables

    public EditText campoUno,campoDos;

         public TextView resultadoOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            campoUno = findViewById(R.id.ivcampouno);
            campoDos = findViewById(R.id.ivcampodos);

            resultadoOperacion = findViewById(R.id.resultadoOperacion);

    }


    public void suma(View view){


                int valorUnoS = Integer.parseInt(campoUno.getText().toString());
                int valorDosS = Integer.parseInt(campoDos.getText().toString());

                int resultadoSuma = valorUnoS + valorDosS;

                    resultadoOperacion.setText("EL resultado de la operación es: " + resultadoSuma);


    }

    public void resta(View view){

            int valorUno = Integer.parseInt(campoUno.getText().toString());
            int valorDos = Integer.parseInt(campoDos.getText().toString());

            int resultadoResta = valorUno - valorDos;

            resultadoOperacion.setText("El resultado de la resta es :" + resultadoResta);



    }

    public void multiplicacion(View view){

        int valorUno = Integer.parseInt(campoUno.getText().toString());
        int valorDos = Integer.parseInt(campoDos.getText().toString());

        int resultadoResta = valorUno * valorDos;

        resultadoOperacion.setText("El resultado de la Multiplicación es : " + resultadoResta);



    }

    public void division(View view){

        int valorUno = Integer.parseInt(campoUno.getText().toString());
        int valorDos = Integer.parseInt(campoDos.getText().toString());

        int resultadoResta = valorUno / valorDos;

        resultadoOperacion.setText("El resultado de la división es : " + resultadoResta);



    }


}