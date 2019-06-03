package com.jpd.xofebre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    // criar variavel
    private Button botaoQuemSomos;
    private Button botaoConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botão para pagina quem somos
        botaoQuemSomos = (Button) findViewById(R.id.buttonQuemSomos); // atribuir valor a variavel

        botaoQuemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // metodo on click
                Intent it = new Intent(MainActivity.this, QuemSomos.class); //criando a ação navegar para a pagina quemSomos
                startActivity(it); //executando a ação
            }
        });

        //Botão para pagina consulta
        botaoConsulta = (Button) findViewById(R.id.buttonConsulta);

        botaoConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // metodo in click
                Intent it = new Intent(MainActivity.this, Consuta.class); //criando a ação navegar para a pagina consulta
                startActivity(it); //executando a ação
            }
        });

    }
}