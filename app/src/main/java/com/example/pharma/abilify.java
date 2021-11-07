package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class abilify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abilifyc);
    }
    public void mainy(View v){
        Intent i = new Intent(this, ocetc.class);
        startActivity(i);
    }
    public void phar(View v){
        Intent a = new Intent(this, ibertinc.class);
        a.putExtra("abili","ABILIFY 10 MG, Comprimé");
        startActivity(a);
    }
}