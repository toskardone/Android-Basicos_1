package com.ndigitales.android.basicos_1;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void mostrar(View v) {
    	
    	EditText et1 = (EditText) findViewById(R.id.et1);
    	EditText et2 = (EditText) findViewById(R.id.et2);
    	TextView tview = (TextView) findViewById(R.id.tvmensaje);
    	
    	String set1 = et1.getText().toString();
    	String set2 = et2.getText().toString();
    	
    	String msj = set1+ " " + set2;
    	System.out.println(msj);
    	Toast.makeText(this, msj, Toast.LENGTH_LONG).show();
    	
    	tview.setText(msj);
    	
    	
    }
    
    
}
