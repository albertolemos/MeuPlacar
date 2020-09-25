package com.example.meuplacar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private Button btnJogadorUm, btnJogadorDois, btnEncerrarJogo, btnZerarPlacar;
    private TextView pontosJogadorUm, pontosJogadorDois;
    private int contadorUm = 0;
    private int contadorDois = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogadorUm = findViewById(R.id.buttonJogadorUm);
        btnJogadorDois = findViewById(R.id.buttonJogadorDois);
        btnEncerrarJogo = findViewById(R.id.buttonEncerrarPartida);
        btnZerarPlacar = findViewById(R.id.buttonZerarPlacar);

        pontosJogadorUm = (TextView) findViewById(R.id.tvContadorUm);
        pontosJogadorDois = (TextView) findViewById(R.id.tvContadorDois);

        btnJogadorUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorUm++;
                pontosJogadorUm.setText(String.valueOf((contadorUm)));
            }
        });

        btnJogadorDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorDois++;
                pontosJogadorDois.setText(String.valueOf((contadorDois)));
            }
        });

        btnEncerrarJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FimJogoActivity.class);

                Placar placar = new Placar(contadorUm, contadorDois);
                intent.putExtra("placar", placar);

                /*intent.putExtra("jogador 1", contadorUm);
                intent.putExtra("jogador 2", contadorDois);*/

                startActivity(intent);
            }
        });

        btnZerarPlacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorUm = 0;
                pontosJogadorUm.setText(String.valueOf((contadorUm)));
                contadorDois = 0;
                pontosJogadorDois.setText(String.valueOf((contadorDois)));
            }
        });

    }
}