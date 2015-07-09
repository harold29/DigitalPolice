package com.example.android.retochacao;

import java.io.StreamCorruptedException;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class menu_supervisor extends Activity {

    GridView menu_sup;
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_supervisor);

        menu_sup=(GridView)findViewById(R.id.menu_sup);

        data= new String[35];

        for(int i=0; i<data.length; i++){
            data[i]="dato "+i;
        }

        ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, data);
        menu_sup.setAdapter(dataAdapter);

        menu_sup.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
                Toast.makeText(getBaseContext(), data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login__supervisor, menu);
        return true;
    }

}
