package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nome;
    private EditText cidade;
    private EditText idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.editTextTextPersonName3);
        idade = findViewById(R.id.editTextTextPersonName4);
        cidade = findViewById(R.id.editTextTextPersonName5);
        Button botaoNext = (Button) findViewById(R.id.button);
        botaoNext.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {
                String nomeValue = nome.getText().toString();
                String idadeValue = idade.getText().toString();
                String cidadeValue = cidade.getText().toString();

                Intent intent = new Intent( MainActivity.this, PrintaTela.class );

                intent.putExtra("nome", nomeValue);
                intent.putExtra("idade", idadeValue);
                intent.putExtra("cidade", cidadeValue);
                startActivity(intent);
                finish();
            }
        });
    }
}