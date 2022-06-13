package com.example.my_appl2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1=findViewById(R.id.txtforget);
        Button button = findViewById(R.id.btngo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent =new Intent(MainActivity.this,pdf1.class)
                Intent intent =new Intent(MainActivity.this,gestion.class);
                startActivity(intent);
//                Intent intent=new Intent(MainActivity.this,gestion.class);
//                startActivity(intent);




            }
        });



    }

  /*
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_acty_menu,menu);
        return true;
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_acty_menu,menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

//        //TextView txtv =(TextView)findViewById(R.id.textView);
//        int id=item.getItemId();
//         if(id ==R.id.Menu1)
//         {
//             txtv.setText("is item 1");
//         }
//         else if (id ==R.id.Menu3)
//         {
//             txtv.setText("is item 3");
//         }
//        return super.onOptionsItemSelected(item);
//    }









}