package com.example.ufjfbrdcc196victorfs89aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBotaoMensagem(View origem){
        TextView textViewMensagem = findViewById(R.id.textViewMensagem);

        textViewMensagem.setText("Olá Mundo!!!");

    }
}