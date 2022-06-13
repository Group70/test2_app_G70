package com.example.my_appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class My_data extends AppCompatActivity {
    private int numagent;
    private ArrayList<String> all;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);

        my_database my_db=new my_database(this,"test_db",null,3);
        //declaration variable
        //button
        Button btngo=findViewById(R.id.btngo);
        Button btnsave= findViewById(R.id.btnadd);
        Button btnaff= findViewById(R.id.btnaffiche);
        Button btmodif= findViewById(R.id.btnodif);

        //edittext
        EditText txtnom,txtage;
        txtnom =findViewById(R.id.ednom);
        txtage =findViewById(R.id.edage);
        EditText txtid =findViewById(R.id.edtxtid);
        //listview
        ListView lsagent=findViewById(R.id.listagent);
        //var

        //fonction
        //--------------
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                my_db.Ajouter(txtnom.getText().toString(),txtnom.getText().toString());

                txtnom.setText("");
                txtage.setText("");
            }
        });

        //-------------

        btnaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                all=my_db.get();
                ArrayAdapter<String> ad =new ArrayAdapter<String>(My_data.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,all);

                lsagent.setAdapter(ad);

            }
        });
        //-------------

        lsagent.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //-----fonction modifier
        btmodif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id=Integer.parseInt(String.valueOf(txtid.getText()));
               my_db.modifieragent(id,txtnom.getText().toString(),txtage.getText().toString());
                txtage.setText("");
                txtnom.setText("");
                txtid.setText("");
                Toast.makeText(My_data.this,"Modification is done",Toast.LENGTH_SHORT).show();


            }
        });


        //------
        //btngo
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent1 =new Intent(My_data.this,gestion.class);
//                startActivity(intent1);
                Intent intent=new  Intent(My_data.this,gestion.class);
                startActivity(intent);
            }
        });


        //-------



     }



    //---------
}