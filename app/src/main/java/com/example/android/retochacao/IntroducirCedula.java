package com.example.android.retochacao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class IntroducirCedula extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_cedula);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_introducir_cedula, menu);
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

    public void limpiarDatos (View view) {
        EditText usuario = (EditText) findViewById(R.id.Usuario);
        usuario.setText("");
        EditText contraseña = (EditText) findViewById(R.id.Contraseña);
        contraseña.setText("");
    }

    public void pasarACedula (View view) {
        EditText editText = (EditText) findViewById(R.id.Usuario);
        String texto = editText.getText().toString();
        if (texto.equals("admin")) {
            Intent nextScreen = new Intent(getApplicationContext(), menu_supervisor.class);
            startActivity(nextScreen);
        } else {
            Intent nextScreen = new Intent(getApplicationContext(), menu_de_consultas.class);
            startActivity(nextScreen);
        }
    }
}

