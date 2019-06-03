package com.jpd.xofebre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Consuta extends AppCompatActivity {

    //Declarando variaveis
    private EditText editTextTemperatura;
    private EditText editTextDias;
    private CheckBox checkBoxCoriza;
    private Button buttonConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consuta);

        //
        editTextTemperatura = (EditText) findViewById(R.id.editTextTemperatura);
        editTextDias = (EditText) findViewById(R.id.editTextDias);
        checkBoxCoriza = (CheckBox) findViewById(R.id.checkBoxCotiza);

        //Botão para pagina
        buttonConsultar = (Button) findViewById(R.id.buttonConsultar); // atribuir valor a variavel
        buttonConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){


                String diagnostico;
                double temperatura = Double.parseDouble(editTextTemperatura.getText().toString());
                int dias = Integer.parseInt(editTextDias.getText().toString());

                //logica para atribuir valor a variavel diagnostico
                if (temperatura >= 36 && temperatura <= 37.2){
                    diagnostico = "Temperatura normal!";
                }else if (temperatura >= 37.3 && temperatura <= 37.8){
                    diagnostico = "Você está apenas com uma febrícula, tome um antitérmico!";
                }else if (temperatura >= 37.9 && temperatura <= 40.5){

                    if (dias <= 1){

                        if (checkBoxCoriza.isChecked()){
                            diagnostico = "Você pode estar com febre em decorrência de uma virose ou gripe. Tome um antitérmico, beba bastante líquido e repouse!";
                        }else {
                            diagnostico = "Você pode estar com febre em decorrência de uma inflamação, siga para o pronto socorro mais próximo!";
                        }

                    }else {
                        diagnostico = "Siga para o pronto socorro mais próximo imediatamente!";
                    }
                }
                else{
                    diagnostico = "Esta temperatura não é de um ser humano";
                }
                //Passando variavel diagnostico para a activit diagnostico
                Bundle parametro = new Bundle();
                parametro.putString("diagnostico",diagnostico);
                Intent intent = new Intent(getApplicationContext(), Diagnostico.class);
                intent.putExtras(parametro);
                startActivity(intent);

            }
        });


    }



}
