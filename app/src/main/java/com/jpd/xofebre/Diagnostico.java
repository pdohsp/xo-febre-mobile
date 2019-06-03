package com.jpd.xofebre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Diagnostico extends AppCompatActivity {

    //Declarar variaveis
    private TextView exibirDiagnostico;
    private Button botaoSair;
    private Button botaoConsulta;
    private Button buttonMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);

        //recuperar dados que foram enviados da activit consulta
        Intent intent = getIntent();
        Bundle dados = intent.getExtras();
        String diagnostico = dados.getString("diagnostico");//Atribuir valor recuperado a variavel diagnostico

        exibirDiagnostico = (TextView) findViewById(R.id.textViewDiagnostico); //referenciando diagnostico do xml com a variavel exibirDiagnostico
        exibirDiagnostico.setText(diagnostico);//setando o valor da variavel diagnostico no textView

        //Botão para pagina inicial
        botaoSair = (Button) findViewById(R.id.buttonSair); // atribuir valor a variavel
        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // metodo in click
                Intent it = new Intent(Diagnostico.this, MainActivity.class); //criando a ação
                startActivity(it); //executando a ação
            }
        });

        //Botão para pagina consulta
        botaoConsulta = (Button) findViewById(R.id.buttonNovaConsulta); // atribuir valor a variavel
        botaoConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // metodo in click
                Intent it = new Intent(Diagnostico.this, Consuta.class); //criando a ação
                startActivity(it); //executando a ação
            }
        });

        //Botão para pagina map
        buttonMap = (Button) findViewById(R.id.buttonMap); // atribuir valor a variavel
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // metodo in click
                Intent it = new Intent(Diagnostico.this, MapsActivity.class); //criando a ação
                startActivity(it); //executando a ação
            }
        });

    }
}