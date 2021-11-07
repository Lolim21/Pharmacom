package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class medicaments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicament);
    }
    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void phrabat(View v){
        TextView txt1= (TextView) findViewById(R.id.textView33);
        TextView txt2= (TextView) findViewById(R.id.textView34);
        TextView txt3= (TextView) findViewById(R.id.textView35);
        txt1.setText("Centrale  TEL : 0537724395 ");
        txt2.setText("Ibn Rochd  TEL : 0537690119");
        txt3.setText("Jnane Souissi  TEL : 0537630404");


    }
    public void phcasa(View v){
        TextView txt1= (TextView) findViewById(R.id.textView33);
        TextView txt2= (TextView) findViewById(R.id.textView34);
        TextView txt3= (TextView) findViewById(R.id.textView35);
        txt1.setText("Dalanda  TEL : 0522523561");
        txt2.setText("Hay El Matar  TEL : 0522932026");
        txt3.setText("Riad El Oulfa  TEL : 0522914578");
    }

}