package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list_bone_de_commande extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_list_bone_de_commande);


        my_database my_db=new my_database(this,"test_db",null,4);

        Button btnadd=findViewById(R.id.btnajouter_BDC);
        ListView listbdc =findViewById(R.id.listBDC);

        //---

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(list_bone_de_commande.this,bon_de_commande.class);
                startActivity(intent);
                Toast.makeText(list_bone_de_commande.this, "Go To  add bon de commade ", Toast.LENGTH_SHORT).show();
            }
        });

        //--
//        file cl1=new file("12/02/2020","13/05/2021","mohamed","book");
//        file cl2=new file("01/01/2015","02/9/2016","younes","machine a12");
//
//
//        ArrayList<file> listbdc1 =new ArrayList<file>();
//        listbdc1.add(cl1);
//        listbdc1.add(cl2);



//        clientadapter adapter=new clientadapter(this,R.layout.design_list_fourniseur,lclientlist);
//        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,lclient);
        ArrayList<file> listbdc1 =my_db.getBon_de_commande();
        fileadapter adapter=new fileadapter(this,R.layout.design_list_bdc,listbdc1);
        listbdc.setAdapter(adapter);

    }
}