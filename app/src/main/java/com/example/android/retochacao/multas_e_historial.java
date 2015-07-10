package com.example.android.retochacao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class multas_e_historial extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multas_e_historial);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_multas_e_historial, menu);
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

    public void verMulta (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), detalle_de_multa.class);
        startActivity(nextScreen);
    }

    public void verMulta2 (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), detalle_de_multa2.class);
        startActivity(nextScreen);
    }

    public void verVehiculo (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), multas_vehiculo.class);
        startActivity(nextScreen);
    }

    public void inicio (View view){
        Intent nextScreen = new Intent(getApplicationContext(), menu_de_consultas.class);
        startActivity(nextScreen);
    }

}
