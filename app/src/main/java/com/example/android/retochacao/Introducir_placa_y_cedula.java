package com.example.android.retochacao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;



public class Introducir_placa_y_cedula extends ActionBarActivity {

    /* Variables para verificacion de placas segun lo estipulado en la resolucion #27 de
    la gaceta oficial #38.685 de fecha 17 de mayo de 2015
     */

    String moto= ("[a-zA-Z][a-zA-Z]\\d[a-zA-Z]\\d\\d[a-zA-Z]\\s*");
    String ptoLibrePart = ("[a-zA-Z][a-zA-Z]\\d\\d[a-zA-Z]\\d[Oo]\\s*");
    String part = ("[a-zA-Z][a-zA-Z]\\d\\d\\d[a-zA-Z][a-zA-Z]\\s*");
    String ptoLibreMoto = ("[a-zA-Z][a-zA-Z]\\d\\d\\d\\d[Oo]\\s*");
    String tracDeSangre = ("[a-zA-Z]\\d[a-zA-Z][a-zA-Z]\\d[a-zA-Z]\\s*");
    String ptoLibreCarga = ("[a-zA-Z]\\d[a-zA-Z]\\d\\d\\d[Oo]\\s*");
    String carga = ("[a-zA-Z]\\d\\d[a-zA-Z][a-zA-Z]\\d\\d\\s*");
    String turistico = ("[a-zA-Z]\\d\\d[a-zA-Z]\\d[a-zA-Z][a-zA-Z]\\s*");
    String discapacitado = ("[a-zA-Z]\\d\\d[a-zA-Z]\\d[a-zA-Z]\\s*");
    String grua = ("[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\s*");
    String transEscolar = ("[a-zA-Z]\\d\\d\\d[a-zA-Z]\\d[a-zA-Z]\\s*");
    String transPrivado = ("[a-zA-Z]\\d\\d\\d\\d[a-zA-Z][a-zA-Z]\\s*");
    String minibus = ("\\d[a-zA-Z][a-zA-Z]\\d\\d[a-zA-Z][a-zA-Z]\\s*");
    String ptoLibreTransPublico = ("\\d[a-zA-Z][a-zA-Z]\\d\\d\\d[Oo]\\s*");
    String taxi	= ("\\d[a-zA-Z]\\d[a-zA-Z][a-zA-Z]\\d[a-zA-Z]\\s*");
    String rustico = ("\\d[a-zA-Z]\\d[a-zA-Z]\\d\\d[a-zA-Z]\\s*");
    String autobus = ("\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d[a-zA-Z]\\s*");
    String autoUrbano = ("\\d[a-zA-Z]\\d\\d\\d[a-zA-Z][a-zA-Z]\\s*");
    String autoInterurbano = ("\\d\\d[a-zA-Z][a-zA-Z]\\d\\d[a-zA-Z]\\s*");
    String autobusInterurbanos = ("\\d\\d[a-zA-Z]\\d\\d[a-zA-Z][a-zA-Z]\\s*");
    String rusticosPeriferico = ("\\d\\d\\d[a-zA-Z][a-zA-Z]\\d[a-zA-Z]\\s*");


    /* Variable para verificar las placas viejas, no se investigo el estandar, por lo que se
    acepta cualquier combinacion de letras y numeros para un total de 6 caracteres.
     */
    String placaVieja = "[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]";

    /* Variable para verificacion de cedula con el formato E o V seguido de 1 a 8 digitos,
       puede o no tener puntos y guion.
    */
    String cedula = ("[EVev]\\-?\\d?\\d?\\.?\\d?\\d?\\d?\\.?\\d?\\d?\\d?\\s*$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_placa_y_cedula);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_introducir_placa_y_cedula, menu);
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




    public void mostrarMultaCedulaPlaca (View view){
        EditText editText = (EditText) findViewById(R.id.id_a_consultar_edit_text);
        String texto = editText.getText().toString();
        if (texto.matches(moto)) {
            editText.setText("Si era");
        } else if (texto.matches(part)) {
            editText.setText("Si era");
        } else if (texto.matches(cedula)) {
            editText.setText("Si era");
        } else if (texto.matches(ptoLibrePart)) {
            editText.setText("Si era");
        } else if (texto.matches(ptoLibreMoto)) {
            editText.setText("Si era");
        } else if (texto.matches(tracDeSangre)) {
            editText.setText("Si era");
        } else if (texto.matches(ptoLibreCarga)) {
            editText.setText("Si era");
        } else if (texto.matches(carga)) {
            editText.setText("Si era");
        } else if (texto.matches(turistico)) {
            editText.setText("Si era");
        } else if (texto.matches(discapacitado)) {
            editText.setText("Si era");
        } else if (texto.matches(grua)) {
            editText.setText("Si era");
        } else if (texto.matches(transEscolar)) {
            editText.setText("Si era");
        } else if (texto.matches(transPrivado)) {
            editText.setText("Si era");
        } else if (texto.matches(minibus)) {
            editText.setText("Si era");
        } else if (texto.matches(ptoLibreTransPublico)) {
            editText.setText("Si era");
        } else if (texto.matches(taxi)) {
            editText.setText("Si era");
        } else if (texto.matches(rustico)) {
            editText.setText("Si era");
        } else if (texto.matches(autobus)) {
            editText.setText("Si era");
        } else if (texto.matches(autoUrbano)) {
            editText.setText("Si era");
        } else if (texto.matches(autoInterurbano)) {
            editText.setText("Si era");
        } else if (texto.matches(autobusInterurbanos)) {
            editText.setText("Si era");
        } else if (texto.matches(rusticosPeriferico)) {
            editText.setText("Si era");
        } else if (texto.matches(placaVieja)){
            editText.setText("Si era");
        } else {
            editText.setText("No era");
        }

        Intent nextScreen = new Intent(getApplicationContext(), multas_cedula_y_placa.class);
        startActivity(nextScreen);
    }

    public void verMulta (View view) {
        Intent nextScreen = new Intent(getApplicationContext(), detalle_de_multa.class);
        startActivity(nextScreen);
    }
}
