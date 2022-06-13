package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class devis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devis);


        my_database my_db=new my_database(this,"test_db",null,4);

        //declaration button
        Button btnadd= findViewById(R.id.btn_ajouter_devis);
        //declaration textview
        TextView nom=findViewById(R.id.nomfournisseur);
        TextView prenom=findViewById(R.id.prenomfournisseur);
        TextView phone=findViewById(R.id.phonefournisseur);
        TextView gmail=findViewById(R.id.gmailfournisseur);




        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                my_db.AjouterDevis(nom.getText().toString(),prenom.getText().toString(),phone.getText().toString(),gmail.getText().toString());
                nom.setText("");prenom.setText("");phone.setText("");gmail.setText("");
                Toast.makeText(devis.this, "save done ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}