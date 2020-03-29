package com.example.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.Serializable;
import java.util.ArrayList;

public class Sandwiches extends AppCompatActivity {



    int cantSandwich = 5;
    LinearLayout container;
    Button italiano;
    Button chacarero;
    Button aLoPobre;
    Button campestre;
    Button barrosLucos;
    int i = 0;
    ArrayList<Sandwich> arraySandiwch= new ArrayList<Sandwich>();
    Sandwich sandwich_italiano;
    Sandwich sandwich_campestre;
    Sandwich sandwich_aLoPobre;
    Sandwich sandwich_barrosLucos;
    Sandwich sandwich_chacarero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar !=null){
            actionbar.setDisplayHomeAsUpEnabled(true);
        }
        actionbar.setTitle("SANDWICH A ELECCIÓN");

        italiano = (Button) findViewById(R.id.italiano);
        chacarero = (Button) findViewById(R.id.chacarero);
        aLoPobre = (Button) findViewById(R.id.aLoPobre);
        campestre = (Button) findViewById(R.id.campestre);
        barrosLucos = (Button) findViewById(R.id.barrosLucos);

        sandwich_italiano = new Sandwich(getString(R.string.nombre_italiano), R.drawable.italiano, getString(R.string.detail_italiano), getString(R.string.precio_italiano));
        arraySandiwch.add(0,sandwich_italiano);

        sandwich_chacarero = new Sandwich(getString(R.string.nombre_barrosLucos), R.drawable.barrosluco, getString(R.string.detail_barrosLuco), getString(R.string.precio_barrosLucos));
        arraySandiwch.add(1,sandwich_chacarero);

        sandwich_aLoPobre = new Sandwich(getString(R.string.nombre_aLoPobre), R.drawable.alopobre, getString(R.string.detail_aLoPobre), getString(R.string.precio_aLoPobre));
        arraySandiwch.add(2,sandwich_aLoPobre);

        sandwich_campestre = new Sandwich(getString(R.string.nombre_chacarero), R.drawable.chacarero, getString(R.string.detail_chacarero), getString(R.string.precio_chacarero));
        arraySandiwch.add(3,sandwich_campestre);

        sandwich_barrosLucos = new Sandwich(getString(R.string.nombre_campestre), R.drawable.campestre, getString(R.string.detail_campestre), getString(R.string.precio_campestre));
        arraySandiwch.add(4,sandwich_barrosLucos);


        italiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent  = new Intent(Sandwiches.this, DetalleSandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) arraySandiwch.get(0));
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        chacarero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent intent  = new Intent(Sandwiches.this, DetalleSandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) arraySandiwch.get(1));
                intent.putExtras(b);
                startActivity(intent);
                Log.i("Sandwich", arraySandiwch.get(i).nombre);
            }
        });

        aLoPobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(Sandwiches.this, DetalleSandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) arraySandiwch.get(2));
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        campestre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent  = new Intent(Sandwiches.this, DetalleSandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) arraySandiwch.get(3));
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        barrosLucos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(Sandwiches.this, DetalleSandwiches.class);
                Bundle b = new Bundle();
                b.putSerializable("sandwich", (Serializable) arraySandiwch.get(4));
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }

}
