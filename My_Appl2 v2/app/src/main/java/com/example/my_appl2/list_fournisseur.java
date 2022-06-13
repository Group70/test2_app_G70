package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list_fournisseur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_list_fournisseur);

        my_database my_db=new my_database(this,"test_db",null,4);

        Button btnadd=findViewById(R.id.btnajoutercfournisseur);
        ListView listclient =findViewById(R.id.listfournissseur);

        //---

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(list_fournisseur.this,fournisseur.class);
                startActivity(intent);
                Toast.makeText(list_fournisseur.this, "Go To Client add client ", Toast.LENGTH_SHORT).show();
            }
        });
        //-----
        ArrayList<clientforview> list_fournisseur =my_db.getfournisseur();
//          ArrayList<clientforview> list_fournisseur =new ArrayList<>();
//        clientforview cl1=new clientforview("moha nori","06215487","moha123@gamail.com","res nori 123");
//        clientforview cl2=new clientforview("zounes","06215487","younes123@gamail.com","res_nori_332");
//        list_fournisseur.add(cl1);
//        list_fournisseur.add(cl2);

        clientadapter adapter=new clientadapter(this,R.layout.design_list_fourniseur,list_fournisseur);
        listclient.setAdapter(adapter);
        //-----




    }
}