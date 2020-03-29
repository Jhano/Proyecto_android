package com.example.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class DetalleSandwiches extends AppCompatActivity  {

    TextView descripcion;
    ImageView imageSandwich;
    TextView nameSandwich;
    TextView precio;
    Sandwich sandwich;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_sandwiches);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar !=null){
            actionbar.setDisplayHomeAsUpEnabled(true);
        }


        Intent intent = getIntent();

        TextView descripcion = (TextView) findViewById(R.id.descripcionSandwich);
        ImageView imageSandwich = (ImageView) findViewById(R.id.imageSandwich);
        TextView nameSandwich = (TextView) findViewById(R.id.nameSandwich);
        TextView precio = (TextView) findViewById(R.id.precio);


        sandwich = (Sandwich) intent.getSerializableExtra("sandwich");
        actionbar.setTitle(sandwich.getNombre());
        descripcion.setText(sandwich.getDescripcion());
        imageSandwich.setImageResource(sandwich.getImagen());
        nameSandwich.setText(sandwich.getNombre());
        precio.setText(sandwich.getPrecio());
    }



}
