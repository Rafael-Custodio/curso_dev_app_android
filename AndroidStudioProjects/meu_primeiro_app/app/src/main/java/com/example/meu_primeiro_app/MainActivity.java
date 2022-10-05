package com.example.meu_primeiro_app;

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
    public void maiorNumero(View view) {

        // criando e instanciando objeto
        EditText numero1 = (EditText) findViewById(R.id.campo_numero1);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int campo1 = Integer.parseInt(numero1.getText().toString());

        // criando e instanciando objeto
        EditText numero2 = (EditText) findViewById(R.id.campo_numero2);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int campo2 = Integer.parseInt(numero2.getText().toString());

        // criando e instanciando objeto
        EditText numero3 = (EditText) findViewById(R.id.campo_numero3);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int campo3 = Integer.parseInt(numero3.getText().toString());


        // criando condicionamento
        if (campo1 > campo2 && campo1 > campo3) {
            // criando e instanciando objeto
            TextView resultado = (TextView) findViewById(R.id.txt_resultado);
            resultado.setText("O maior número é: " + campo1);
        } else if (campo2 > campo1 && campo2 > campo3) {
            TextView resultado = (TextView) findViewById(R.id.txt_resultado);
            resultado.setText("O maior número é: " + campo2);
        } else {
            TextView resultado = (TextView) findViewById(R.id.txt_resultado);
            resultado.setText("O maior número é " + campo3);
        }

    }

}

