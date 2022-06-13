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



public class clientadapter extends ArrayAdapter <clientforview> {

    Context context;
    int resource;
//    int adapterresource;
//    clientforview [] clientadapter;


    public clientadapter(@NonNull Context context, int resource, @NonNull ArrayList<clientforview> obj) {

        super(context, resource, obj);

//        adaptercontext=context;
//        adapterresource=resource;
//        clientadapter=obj;
         this.context =context;
         this.resource=resource;

    }

//    @Nullable
//    @Override
//    public Object getItem(int position) {
//        return super.getItem(position);
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//        View row;
//        LayoutInflater rowinfalate=LayoutInflater.from(adaptercontext);
//        row=rowinfalate.inflate(adapterresource,parent,false);

        convertView = LayoutInflater.from(context).inflate(resource,parent,false);
        TextView nom=convertView.findViewById(R.id.txtviewnomprenom);
        TextView phone=convertView.findViewById(R.id.txtviewtelephone);
        TextView gmail=convertView.findViewById(R.id.txtviewgmail);
        TextView adress=convertView.findViewById(R.id.txtviewadress);

//        TextView nom=convertView.findViewById(R.id.txtclient);
//        TextView phone=convertView.findViewById(R.id.txtphone);
//        TextView gmail=convertView.findViewById(R.id.txtgmail);
//        TextView adress=convertView.findViewById(R.id.txtadress);

//        clientforview cl=clientadapter[position];
        clientforview cl=getItem(position);
        nom.setText("Monsieur : "+cl.getNom());
        phone.setText("Phone : "+cl.getPhone());
        gmail.setText("Gmail : "+cl.getGmail());
        adress.setText("Adress : "+cl.getAdress());

        return convertView;
    }
}
