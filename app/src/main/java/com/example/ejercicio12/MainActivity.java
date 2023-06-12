package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText nom, apell,edad,correo;
      Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom=findViewById(R.id.txt_nom);
         apell = findViewById(R.id.txt_apell);
         edad= findViewById(R.id.txt_edad);
         correo= findViewById(R.id.txt_corr);
        enviar=findViewById(R.id.btn_inf);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = nom.getText().toString();
                String apellidos = apell.getText().toString();
                String edadd = edad.getText().toString();
                String correoo = correo.getText().toString();

                Intent intent = new Intent(MainActivity.this, Datos.class);
                intent.putExtra("name", nombre);
                intent.putExtra("lastName", apellidos);
                intent.putExtra("age", edadd);
                intent.putExtra("email", correoo );
                startActivity(intent);

            }
        });


    }
}