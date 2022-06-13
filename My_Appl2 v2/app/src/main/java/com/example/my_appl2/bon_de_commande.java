package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class bon_de_commande extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bon_de_commande);

        my_database my_db=new my_database(this,"test_db",null,4);

        //declaration button
        Button btnadd= findViewById(R.id.btnajouterbdc);
        //declaration textview
        TextView v1=findViewById(R.id.nomfournisseur);
        TextView v2=findViewById(R.id.prenomfournisseur);
        TextView v3=findViewById(R.id.phonefournisseur);
        TextView v4=findViewById(R.id.gmailfournisseur);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                my_db.AjouterBon_de_commande(v1.getText().toString(),v2.getText().toString(),v3.getText().toString(),v4.getText().toString());
                v1.setText("");v2.setText("");v3.setText("");v4.setText("");
                Toast.makeText(bon_de_commande.this, "save done ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}