package com.example.ronaldtarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    String resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultadoFinal =  getIntent().getExtras().getString("SESION_RESULTADO");

        final TextView mTextView = (TextView) findViewById(R.id.textviewResult);
        mTextView.setText(resultadoFinal);


    }
}
