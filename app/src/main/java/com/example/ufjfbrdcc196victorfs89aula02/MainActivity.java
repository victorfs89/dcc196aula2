package com.example.ufjfbrdcc196victorfs89aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMensagem = findViewById(R.id.textViewMensagem);
    private EditText editTextNome = findViewById(R.id.editTextNome);
    private EditText editTextStarter = findViewById(R.id.editTextStarter);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMensagem = findViewById(R.id.textViewMensagem);
        editTextNome = findViewById(R.id.editTextNome);
        editTextStarter = findViewById(R.id.editTextStarter);
    }

    public void clickBotaoMensagem(View origem){

        String nome = editTextNome.getText().toString();
        String starter = editTextStarter.getText().toString();

        String mensagem = String.format("Olá treinador %s. Seu starter é o %s", nome, starter);

        textViewMensagem.setText(mensagem);

    }
}