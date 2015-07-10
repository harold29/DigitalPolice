package com.example.android.retochacao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Login_Supervisor extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__supervisor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login__supervisor, menu);
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

    public void verFuncionarios (View view) {
        EditText editText = (EditText) findViewById(R.id.Usuario);
        String texto = editText.getText().toString();
        if (texto.equals("admin")) {
            Intent nextScreen = new Intent(getApplicationContext(), funcionarios.class);
            startActivity(nextScreen);
        } else {
            Intent nextScreen = new Intent(getApplicationContext(), Login_Supervisor.class);
            startActivity(nextScreen);
        }
    }
}
