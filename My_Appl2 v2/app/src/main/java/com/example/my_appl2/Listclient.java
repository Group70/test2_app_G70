package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Listclient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listclient);

        my_database my_db=new my_database(this,"test_db",null,4);

        Button btnadd=findViewById(R.id.btnaddclient);
        ListView listclient =findViewById(R.id.listclient1);

        //---

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Listclient.this,client.class);
                startActivity(intent);
                Toast.makeText(Listclient.this, "Go To Client add client ", Toast.LENGTH_SHORT).show();
            }
        });

        //--
//        clientforview cl1=new clientforview("moha nori","06215487","moha123@gamail.com","res nori 123");
//        clientforview cl2=new clientforview("zounes","06215487","younes123@gamail.com","res_nori_332");
//        clientforview cl3=new clientforview("zounes","06215487","younes123@gamail.com","res_nori_332");
//        clientforview cl4=new clientforview("zounes","06215487","younes123@gamail.com","res_nori_332");
//        clientforview cl5=new clientforview("zounes","06215487","younes123@gamail.com","res_nori_332");
//        clientforview cl6=new clientforview("zounes","06215487","younes123@gamail.com","res_nori_332");

//        ArrayList<clientforview> lclientlist =new ArrayList<clientforview>();
//        lclientlist.add(cl1);
//        lclientlist.add(cl2);
//        lclientlist.add(cl3);
//        lclientlist.add(cl4);
//        lclientlist.add(cl5);
//        lclientlist.add(cl6);
        //--
//        int xmfile= androidx.appcompat.R.layout.support_simple_spinner_dropdown_item;


//        clientadapter adapter=new clientadapter(this,R.layout.design_list_fourniseur,lclientlist);
//        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,lclient);
        ArrayList<clientforview> lclientlist =my_db.getclient();
        clientadapter adapter=new clientadapter(this,R.layout.listviewclient1,lclientlist);
        listclient.setAdapter(adapter);


//        ListView listcl1=findViewById(R.id.listclient1);
//
//        setContentView(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
//        clientforview cl1=new clientforview("MOHAMED","0632568974","mohamed152&gmail.com","rabat ress nor");
//        clientforview cl2=new clientforview("ILYAS","0632584269","ilzas43&gmail.com","rabat ress chawach");
//
//        clientforview[] sommeclient={cl1,cl2};
//
//        int xmlfile=R.layout.activity_listclient;
//        clientadapter adapter=new clientadapter(Listclient.this,xmlfile,sommeclient);
//        listcl1.setAdapter(adapter);

    }
}