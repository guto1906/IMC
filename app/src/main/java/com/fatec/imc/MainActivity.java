package com.fatec.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){
        EditText altura = (EditText)findViewById(R.id.altura);
        EditText peso = (EditText)findViewById(R.id.peso);
        double p = Double.parseDouble(peso.getText().toString());
        double a = Double.parseDouble(altura.getText().toString());
        double imc = p/(a*a) ;
        TextView t = (TextView) findViewById(R.id.textIMC);
        t.setText("" + imc);
        if (imc >= 40){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Obesidade Mórbida");
        };
        if (imc >= 35 && imc < 40){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Obesidade Severa");
        };
        if (imc >= 30 && imc < 35){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Obesidade Grau I");
        };
        if (imc >= 25 && imc < 30){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Sobrepeso");
        };
        if (imc >= 18.5 && imc < 25){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Saudável");
        };
        if (imc >= 17 && imc < 18.5){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Magreza Leve");
        };
        if (imc >= 16 && imc < 17){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Magreza Moderada");
        };
        if (imc < 16){
            TextView r = (TextView) findViewById(R.id.classif);
            r.setText("Magreza Grave");
        };
    }
}
