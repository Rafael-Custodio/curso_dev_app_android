package com.example.meu_segundo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // criando método para implementar a lógica no botão
    public void parImpar(View view) {

        // criando e instanciando objeto
        EditText numero = (EditText) findViewById(R.id.campo_numero);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int campo = Integer.parseInt(numero.getText().toString());


        // criando condicionamento
        if (campo % 2 == 0) {
            // criando e instanciando objeto
            TextView resultado = (TextView) findViewById(R.id.txt_resultado);
            resultado.setText("O número " + campo + " é PAR.");
        } else {
            TextView resultado = (TextView) findViewById(R.id.txt_resultado);
            resultado.setText("O número " + campo + " é ÍMPAR.");
        }

    }

}


