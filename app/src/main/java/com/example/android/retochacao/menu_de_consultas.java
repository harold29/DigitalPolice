package com.example.android.retochacao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ToggleButton;


public class menu_de_consultas extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_de_consultas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_de_consultas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void consultarDatos (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), Introducir_placa_y_cedula.class);
        startActivity(nextScreen);
    }

    public void verMapa (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), mapa_del_crimen.class);
        startActivity(nextScreen);
    }

/*
    public void consultar(View view){
        Intent nextScreen;
        if (cedula && placa) {
            nextScreen = new Intent(getApplicationContext(), Introducir_placa_y_cedula.class);
            startActivity(nextScreen);
        } else if (cedula) {
            nextScreen = new Intent(getApplicationContext(), verificar_por_cedula.class);
            startActivity(nextScreen);
        } else if (placa) {
            nextScreen = new Intent(getApplicationContext(), introducir_placa.class);
            startActivity(nextScreen);
        }
    }
    */

}
