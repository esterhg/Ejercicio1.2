package com.example.ejercicio12;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;


import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Datos extends AppCompatActivity{
        @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_datos);


            EditText nombre = findViewById(R.id.txtnombre);
            EditText apellido = findViewById(R.id.txtapellidos);
            EditText edad = findViewById(R.id.txtedad);
             EditText correo = findViewById(R.id.txtcorreo);

            Intent intent = getIntent();
            String nom= intent.getStringExtra("name");
            String last = intent.getStringExtra("lastName");
            String age = intent.getStringExtra("age");
            String email = intent.getStringExtra("email");

            nombre.setText("Nombre: " + nom);
            apellido.setText("Apellidos: " + last);
            edad.setText("Edad: " + age);
            correo.setText("Correo: " + email);



        }
}
