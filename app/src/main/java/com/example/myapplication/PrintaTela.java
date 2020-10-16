package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrintaTela extends AppCompatActivity {
    private TextView PNome;
    private TextView PCidade;
    private TextView PIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printa_tela);
        PNome = findViewById(R.id.nome);
        PCidade = findViewById(R.id.cidade);
        PIdade = findViewById(R.id.idade);

        String nomevalue = (String) getIntent().getExtras().get("nome");
        String idadevalue = (String) getIntent().getExtras().get("idade");
        String cidadevalue = (String) getIntent().getExtras().get("cidade");

        PNome.setText(nomevalue);
        PIdade.setText(idadevalue);
        PCidade.setText(cidadevalue);

    }
}