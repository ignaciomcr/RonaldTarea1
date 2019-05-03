package com.example.ronaldtarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    String Valor1="";
    String Valor2="";
    int resultado = 0;

    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operacion();
    }


    private void operacion() {


        final TextView mTextView = (TextView) findViewById(R.id.textview);

        final EditText mEdittext = (EditText)findViewById(R.id.edittext1);

        //Botón +
        Button mbuttonMas = (Button) findViewById(R.id.buttonMas);
        mbuttonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mEdittext.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Debe digitar un número válido ",Toast.LENGTH_SHORT).show();
                    mEdittext.setText("");
                }
                else
                {
                    operacion = "+";
                    mTextView.setText(mEdittext.getText()+operacion);
                    Valor1 = mEdittext.getText().toString();
                    mEdittext.setText("");
                }

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón -
        Button mbuttonMenos = (Button) findViewById(R.id.buttonMenos);
        mbuttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mEdittext.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Debe digitar un número válido ",Toast.LENGTH_SHORT).show();
                    mEdittext.setText("");
                }
                else
                {
                    operacion = "-";
                    mTextView.setText(mEdittext.getText()+operacion);
                    Valor1 = mEdittext.getText().toString();
                    mEdittext.setText("");
                }

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón *
        Button mbuttonPor = (Button) findViewById(R.id.buttonMulti);
        mbuttonPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mEdittext.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Debe digitar un número válido ",Toast.LENGTH_SHORT).show();
                    mEdittext.setText("");
                }
                else
                {
                    operacion = "*";
                    mTextView.setText(mEdittext.getText()+operacion);
                    Valor1 = mEdittext.getText().toString();
                    mEdittext.setText("");
                }

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón /
        Button mbuttonDiv = (Button) findViewById(R.id.buttonDiv);
        mbuttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mEdittext.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Debe digitar un número válido ",Toast.LENGTH_SHORT).show();
                    mEdittext.setText("");
                }
                else
                {
                    operacion = "/";
                    mTextView.setText(mEdittext.getText()+operacion);
                    Valor1 = mEdittext.getText().toString();
                    mEdittext.setText("");
                }

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------



        //Botón 1
        Button mbutton1 = (Button) findViewById(R.id.button1);
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"1");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 2
        Button mbutton2 = (Button) findViewById(R.id.button2);
        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"2");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------

        //Botón 3
        Button mbutton3 = (Button) findViewById(R.id.button3);
        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"3");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 4
        Button mbutton4 = (Button) findViewById(R.id.button4);
        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"4");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());

            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 5
        Button mbutton5 = (Button) findViewById(R.id.button5);
        mbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"5");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 6
        Button mbutton6 = (Button) findViewById(R.id.button6);
        mbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"6");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 7
        Button mbutton7 = (Button) findViewById(R.id.button7);
        mbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"7");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 8
        Button mbutton8 = (Button) findViewById(R.id.button8);
        mbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"8");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 9
        Button mbutton9 = (Button) findViewById(R.id.button9);
        mbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"9");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón 0
        Button mbutton0 = (Button) findViewById(R.id.button0);
        mbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEdittext.setText(mEdittext.getText().toString()+"0");
                mTextView.setText(mEdittext.getText());
                mEdittext.setSelection(mEdittext.getText().length());
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------

        //Botón =
        Button mbuttonIgual = (Button) findViewById(R.id.buttonIgual);
        mbuttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEdittext.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Debe digitar un número válido ",Toast.LENGTH_SHORT).show();
                    mEdittext.setText("");
                }
                else
                {

                    if (Valor1 != "" )
                    {

                        Valor2 = mEdittext.getText().toString();
                        mEdittext.setText("");

                        switch (operacion){

                            case "+":
                                resultado = Integer.parseInt(Valor1) + Integer.parseInt(Valor2);
                                mTextView.setText(Integer.toString(resultado));
                                break;
                            case "-":
                                resultado = Integer.parseInt(Valor1) - Integer.parseInt(Valor2);
                                mTextView.setText(Integer.toString(resultado));
                                break;
                            case "/":
                                resultado = Integer.parseInt(Valor1) / Integer.parseInt(Valor2);
                                mTextView.setText(Integer.toString(resultado));
                                break;
                            case "*":
                                resultado = Integer.parseInt(Valor1) * Integer.parseInt(Valor2);
                                mTextView.setText(Integer.toString(resultado));
                                break;
                        }


                        Intent intent = new Intent();
                        intent.setClass(getApplicationContext(), ResultadoActivity.class);
                        intent.putExtra("SESION_RESULTADO",mTextView.getText());
                        startActivity(intent);



                        operacion = "";
                        Valor1 = "";
                        Valor2 = "";
                        resultado = 0;
                        mEdittext.setText("");
                        mTextView.setText("");

                    }else
                    {
                        Toast.makeText(getApplicationContext(),"Deben haber dos valores para poder realizar la operación",Toast.LENGTH_SHORT).show();
                        operacion = "";
                        Valor1 = "";
                        Valor2 = "";
                        resultado = 0;

                        mEdittext.setText("");

                    }


                }



            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------


        //Botón AC
        Button mbuttonAC = (Button) findViewById(R.id.buttonAC);
        mbuttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "";
                Valor1 = "";
                Valor2 = "";
                resultado = 0;
                mTextView.setText("");
                mEdittext.setText("");
            }//Método OnClick
        });//setOnClickListener
        //--------------------------------------



    }

}
