package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class gestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        //-----


        ImageButton btnclient = findViewById(R.id.imgbtnclient);
        ImageButton btncfournisseur = findViewById(R.id.imgbtnfournisseur);
        ImageButton btncbonc = findViewById(R.id.imgbtnbondec);
        ImageButton btncfacture = findViewById(R.id.imgbtnfacture);
        ImageButton btncdevis = findViewById(R.id.imgbtnfdevis);
        ImageButton btcclcule =findViewById(R.id.btncalcule);
        //---------
        btnclient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent =new Intent(gestion.this,client.class);
//                startActivity(intent);
                Intent intent =new Intent(gestion.this,Listclient.class);
               startActivity(intent);
                Toast.makeText(gestion.this, "Go To list Client ", Toast.LENGTH_SHORT).show();
            }
        });

        //-----
        //---------
        btncfournisseur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(gestion.this,list_fournisseur.class);
                startActivity(intent);
                Toast.makeText(gestion.this, "Go To list Fournisseur ", Toast.LENGTH_SHORT).show();
            }
        });

        //-----
        //---------
        btncfacture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(gestion.this,list_facture.class);
                startActivity(intent);
                Toast.makeText(gestion.this, "Go To list Facture", Toast.LENGTH_SHORT).show();
            }
        });

        //-----
        //---------
        btncdevis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(gestion.this,list_devis.class);
                startActivity(intent);
                Toast.makeText(gestion.this, "Go To list Devis ", Toast.LENGTH_SHORT).show();
            }
        });

        //-----
        //*****bone de commamde
        //---------
        btncbonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(gestion.this,list_bone_de_commande.class);
                startActivity(intent);
                Toast.makeText(gestion.this, "Go To list Bone de Comande", Toast.LENGTH_SHORT).show();
            }
        });

        //-----
        //*****bone de calcule
        //---------
        btcclcule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(gestion.this,calcule.class);
                startActivity(intent);
                Toast.makeText(gestion.this, "Go To use calcule", Toast.LENGTH_SHORT).show();
            }
        });

        //-----





    }
}