package com.example.joken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //criando método para elemento pedra
    public void selecionandoPedra(View view) {
        this.opcaoSelecionada("PEDRA");
    }

    //criando método para elemento papel
    public void selecionandoPapel(View view) {
        this.opcaoSelecionada("PAPEL");
    }

    //criando método para elemento tesoura
    public void selecionandoTesoura(View view) {
        this.opcaoSelecionada("TESOURA");
    }

    //criando método usuário vs máquina
    public void opcaoSelecionada(String escolhaUsuario) {
        //testando o clique dos botões
        //System.out.println("item que selecionei: " + escolhaUsuario);

        ImageView imagemResultado = findViewById(R.id.img_oponente);
        TextView textoResultado = findViewById(R.id.txt_resultado);

        //criando objeto e posições do seu array
        int posicoes = new Random().nextInt(3);//0, 1, 2
        String[] opcoes = {"PEDRA", "PAPEL", "TESOURA"};
        String escolhaOponente = opcoes[posicoes];


        //testando a jogada do oponente (aleatório)
        //System.out.println("item que o oponente escolheu rendomicamente: " + escolhaOponente);

        switch (escolhaOponente) {
            case "PEDRA":
                imagemResultado.setImageResource(R.drawable.img_pedra);
                break;

            case "PAPEL":
                imagemResultado.setImageResource(R.drawable.img_papel);
                break;

            case "TESOURA":
                imagemResultado.setImageResource(R.drawable.img_tesoura);
                break;
        }

        if (escolhaUsuario == "PEDRA" && escolhaOponente == "TESOURA" ||
                escolhaUsuario == "PAPEL" && escolhaOponente == "PEDRA" ||
                escolhaUsuario == "TESOURA" && escolhaOponente == "PAPEL") {
            textoResultado.setTextColor(getResources().getColor(R.color.verde));
            textoResultado.setText("VOCÊ VENCEU !!!\nPARABÉNS !!!\nUHUUUUUUUUUU");
        } else if (escolhaUsuario == "PEDRA" && escolhaOponente == "PEDRA" ||
                escolhaUsuario == "PAPEL" && escolhaOponente == "PAPEL" ||
                escolhaUsuario == "TESOURA" && escolhaOponente == "TESOURA") {
            textoResultado.setTextColor(getResources().getColor(R.color.amarelo));
            textoResultado.setText("EMPATOU !!!");
        } else {
            textoResultado.setTextColor(getResources().getColor(R.color.vermelho));
            textoResultado.setText("VOCÊ PERDEU !!!\nHAHAHAHA" +
                    "\nBEM FEITO, RECEEEEEEEEBA\nPERDEDOR !!!\nLOOOOOOSER");
        }
    }
}


