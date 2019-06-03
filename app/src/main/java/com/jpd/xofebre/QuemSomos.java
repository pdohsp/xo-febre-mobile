package com.jpd.xofebre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuemSomos extends AppCompatActivity {

    // criar variavel
    private Button botaoHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quem_somos);

        // atribuir valor a variavel
        botaoHome = (Button) findViewById(R.id.buttonHome);


        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // metodo in click
                Intent it = new Intent(QuemSomos.this, MainActivity.class); //criando a ação direcionar para pagina home
                startActivity(it); //executando a ação
            }
        });

    }
}
