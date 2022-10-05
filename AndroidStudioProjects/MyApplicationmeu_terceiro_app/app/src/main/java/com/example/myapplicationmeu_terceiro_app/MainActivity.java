package com.example.myapplicationmeu_terceiro_app;

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
    public void receberDados(View view) {

        // criando e instanciando objeto
        EditText receberNome = (EditText) findViewById(R.id.txt1);
        String recebendoNome = receberNome.getText().toString();

        // criando e instanciando objeto
        EditText receberSobrenome = (EditText) findViewById(R.id.txt2);
        String recebendoSobrenome = receberSobrenome.getText().toString();

        // criando e instanciando objeto
        EditText numero1 = (EditText) findViewById(R.id.num1);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int conta = Integer.parseInt(numero1.getText().toString());

        // criando e instanciando objeto
        EditText numero2 = (EditText) findViewById(R.id.num2);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int digito = Integer.parseInt(numero2.getText().toString());


        // criando condicionamento
        if (receberNome != null && receberSobrenome != null) {
            // criando e instanciando objeto
            TextView texto1 = (TextView) findViewById(R.id.txt3);
            texto1.setText("Olá, " + recebendoNome + " " + recebendoSobrenome + ", titular da conta-corrente: " + conta + "-" + digito);
        }

        else {
            TextView texto1 = (TextView) findViewById(R.id.txt3);
            texto1.setText("ATENÇÃO: Digite seus dados acima.");
        }
    }

    // criando método para implementar a lógica no botão
    public void transferirPix(View view) {

        // criando e instanciando objeto
        EditText saldo11 = (EditText) findViewById(R.id.saldo1);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int saldo111 = Integer.parseInt(saldo11.getText().toString());

        // criando e instanciando objeto
        EditText credito11 = (EditText) findViewById(R.id.credito1);
        // convertendo o tipo int que vai receber o resultado para String, que vai mostrar na textView
        int credito111 = Integer.parseInt(credito11.getText().toString());


        // criando condicionamento
        if (receberNome != null && receberSobrenome != null) {
            // criando e instanciando objeto
            TextView texto1 = (TextView) findViewById(R.id.txt3);
            texto1.setText("Olá, " + recebendoNome + " " + recebendoSobrenome + ", titular da conta-corrente: " + conta + "-" + digito);
        }

        else {
            TextView texto1 = (TextView) findViewById(R.id.txt3);
            texto1.setText("ATENÇÃO: Digite seus dados acima.");
        }
    }








}