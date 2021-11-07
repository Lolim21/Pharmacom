package com.example.pharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class pharmacies extends AppCompatActivity {

    private DocumentReference mDocRef = FirebaseFirestore.getInstance().document("favoris/medicaments");

    public static final String NOM_KEY = "nom";
    public static final String NOM2_KEY = "nom2";



    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacies);

        txt2= (TextView) findViewById(R.id.textView31);
    }
   /*  public void findfavmed(View v) {
        mDocRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    String nom = documentSnapshot.getString(NOM_KEY);
                    String nom2 = documentSnapshot.getString(NOM2_KEY);
                    txt2.setText("\"" + nom + "\" --" + nom2);




            }

            }
        });
    }

     */
    public void findfavmed(View v){
        TextView txt1= (TextView) findViewById(R.id.textView31);
        if (txt1.toString()=="XALKORI 200 MG, Gélule") {
            Intent i = new Intent(this, xalkoric.class);
            startActivity(i);
        }
        else {
            if (txt1.toString()=="OCET 200 MG, comprimé") {
                Intent i = new Intent(this, quinolxc.class);
                startActivity(i);
            }
            else {
                Intent i = new Intent(this, abilify.class);
                startActivity(i);
            }

        }


    }

    public void findfavphar(View v){
        TextView txt2= (TextView) findViewById(R.id.textView32);
        if (txt2.toString()=="Al Hayat") {
            Intent i = new Intent(this, agdal.class);
            startActivity(i);
        }
        else {
            if (txt2.toString()=="Ibn Rochd") {
                Intent i = new Intent(this, agdal.class);
                startActivity(i);
            }
            else {
                Intent i = new Intent(this, centrale.class);
                startActivity(i);
            }

        }


    }
    public void mainy(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}
