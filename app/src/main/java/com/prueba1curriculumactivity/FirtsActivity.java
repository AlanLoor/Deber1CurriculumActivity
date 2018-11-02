package com.prueba1curriculumactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

public class FirtsActivity extends AppCompatActivity
{
    //Se declara boton-Se importa automaticamente ALT-ENT
    Button BotonEstudios;
    Button BotonExperiencia;
    Button BotonConociemientos;
    Button BotonReferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firts);

        //El boton declarado se le asigna el id del boton creado con el nombre bnEstudios.
        BotonEstudios = (Button) findViewById(R.id.bnEstudios);
        BotonExperiencia = (Button) findViewById(R.id.bnExperiencia);
        BotonConociemientos = (Button) findViewById(R.id.bnConocimientos);
        BotonReferencias = (Button) findViewById(R.id.bnReferencias);

        //Metodo del BotonEstudios
        BotonEstudios.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Se declara variable donde llevará de Pagina principal a segunta actividad
                Intent BotonEstudios = new Intent (FirtsActivity.this, EstudiosActivity.class);
                startActivity(BotonEstudios);
            }
        });

        //Metodo del BotonExperiencia
        BotonExperiencia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Se declara variable donde llevará de Pagina principal a tercera actividad
                Intent BotonExperiencia = new Intent (FirtsActivity.this, ExperienciaActivity.class);
                startActivity(BotonExperiencia);
            }
        });

        //Metodo del BotonConocimiento
        BotonConociemientos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Se declara variable donde llevará de Pagina principal a tercera actividad
                Intent BotonConociemientos = new Intent (FirtsActivity.this, ConocimientosActivity.class);
                startActivity(BotonConociemientos);
            }
        });

        //Metodo del BotonReferencias
        BotonReferencias.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Se declara variable donde llevará de Pagina principal a tercera actividad
                Intent BotonReferencias = new Intent (FirtsActivity.this, ReferenciasActivity.class);
                startActivity(BotonReferencias);
            }
        });
    }
}
