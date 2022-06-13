package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list_facture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_list_facture);

        my_database my_db=new my_database(this,"test_db",null,4);

        Button btnadd=findViewById(R.id.btn_ajouter_devis);
        ListView list_facture =findViewById(R.id.listdevis);

        //---

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(list_facture.this,facture.class);
                startActivity(intent);
                Toast.makeText(list_facture.this, "Go To Client add facture", Toast.LENGTH_SHORT).show();
            }
        });

        //--
//        file cl1=new file("12/02/2020","13/05/2021","mohamed","book");
//        file cl2=new file("01/01/2015","02/9/2016","younes","machine a12");
//
//
//        ArrayList<file> listfacture =new ArrayList<file>();
//        listfacture.add(cl1);
//        listfacture.add(cl2);



        ArrayList<file> listfacture =my_db.getFacture();
        fileadapter adapter=new fileadapter(this,R.layout.design_list_facture,listfacture);
        list_facture.setAdapter(adapter);



    }
}