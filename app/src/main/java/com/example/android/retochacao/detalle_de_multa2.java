package com.example.android.retochacao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class detalle_de_multa2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_de_multa2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detalle_de_multa2, menu);
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

    public void pasarADetalleVehiculo (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), multas_vehiculo.class);
        startActivity(nextScreen);
    }

    public void pasarADetallePersona (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), multas_e_historial.class);
        startActivity(nextScreen);
    }

    public void inicio (View view){
        Intent nextScreen = new Intent(getApplicationContext(), menu_de_consultas.class);
        startActivity(nextScreen);
    }
}
