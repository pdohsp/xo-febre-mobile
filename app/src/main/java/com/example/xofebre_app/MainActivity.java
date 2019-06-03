package com.example.xofebre_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText TextView_temperatura, TextView_dias, CheckBox_coriza   ;
    private Button button_consultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected String realizarConsulta(double temperatura, int dias, booleam coriza) {

        if(temperatura > 36 && temperatura < 37.6){

        }
    }



}
