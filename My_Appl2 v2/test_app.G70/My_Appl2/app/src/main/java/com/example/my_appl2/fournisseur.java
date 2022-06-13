package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fournisseur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur);

        my_database my_db=new my_database(this,"test_db",null,4);

        //declaration button
        Button btnadd= findViewById(R.id.ajouterfour);
        //declaration textview
        TextView nom=findViewById(R.id.nomfournisseur);
        TextView prenom=findViewById(R.id.prenomfournisseur);
        TextView phone=findViewById(R.id.phonefournisseur);
        TextView gmail=findViewById(R.id.gmailfournisseur);
        TextView adress=findViewById(R.id.adressfournisseur);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                my_db.AjouterFrournisseur(nom.getText().toString(),prenom.getText().toString(),phone.getText().toString(),gmail.getText().toString(),adress.getText().toString());
//                my_db.AjouterFrournisseur("four","nisseur","0000000000","aaaaagmail","aaaaaaa");
//                nom.setText("");prenom.setText("");phone.setText("");gmail.setText("");adress.setText("");
                Toast.makeText(fournisseur.this, "save fournisseur done ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}