package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sobreNosotros;
    Button btn_sandwiches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sobreNosotros = (Button) findViewById(R.id.sobreNosotros);
        btn_sandwiches = (Button) findViewById(R.id.btnSandwiches);

        btn_sobreNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, SobreNosotros.class);
                startActivity(i);
            }
        });

        btn_sandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, Sandwiches.class);
                startActivity(i);
            }
        });

    }
}
