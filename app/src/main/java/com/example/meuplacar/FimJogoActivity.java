package com.example.meuplacar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FimJogoActivity extends AppCompatActivity {

    private Button btnVoltar;

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim_jogo);

        btnVoltar = findViewById(R.id.buttonVoltarActivityMain);
        tvResultado = findViewById(R.id.textViewResultado);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Bundle dados = getIntent().getExtras();

        Placar placar = (Placar) dados.getSerializable("placar");
        int placarJogadorUm = placar.getPontosJogador1();
        int placarJogadorDois = placar.getPontosJogador2();

        if (placarJogadorUm > placarJogadorDois) {
            tvResultado.setText(R.string.tvJogadorUmVencedor);
        } else if (placarJogadorDois > placarJogadorUm) {
            tvResultado.setText(R.string.tvJogadorDoisVencedor);
        } else {
            tvResultado.setText(R.string.tvEmpate);
        }

    }
}