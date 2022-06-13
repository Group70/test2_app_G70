package com.example.my_appl2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class fileadapter extends ArrayAdapter<file> {

    Context context;
    int resource;

    public fileadapter(@NonNull Context context, int resource, @NonNull ArrayList<file> objects) {
        super(context, resource, objects);

        this.context =context;
        this.resource=resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        convertView = LayoutInflater.from(context).inflate(resource,parent,false);
        TextView nom=convertView.findViewById(R.id.txtviewnomprenom);
        TextView phone=convertView.findViewById(R.id.txtviewtelephone);
        TextView gmail=convertView.findViewById(R.id.txtviewgmail);
        TextView adress=convertView.findViewById(R.id.txtviewadress);


        file cl=getItem(position);
//        nom.setText("date de creation : "+cl.getDate_creation());
//        phone.setText("fournisseur : "+cl.getDate_expidetion());
//        gmail.setText("echange_de_paiement  : "+cl.getPersonne());
//        adress.setText("L_articl : "+cl.getArticle());
        nom.setText(cl.getDate_creation());
        phone.setText(cl.getDate_expidetion());
        gmail.setText(cl.getPersonne());
        adress.setText(cl.getArticle());

        return convertView;
    }


}
