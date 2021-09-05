package com.example.lablayouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conversor(View vista){
    	EditText pBoliviano = (EditText)findViewById(R.id.editText1);
    	int monto = Integer.parseInt(pBoliviano.getText().toString());
    	
    	EditText pDolar = (EditText)findViewById(R.id.editText2);
    	double dolar = monto/ 6.96;
    	pDolar.setText(dolar+"");
    	EditText pEuro = (EditText)findViewById(R.id.editText3);
    	double euro = monto/ 7.52;
    	pEuro.setText(euro+"");
    	EditText pSoles = (EditText)findViewById(R.id.editText4);
    	double sol = monto/ 2.23;
    	pSoles.setText(sol+"");
    	EditText pPesoCh = (EditText)findViewById(R.id.editText5);
    	double pesoch = monto/ 0.011354;
    	pPesoCh.setText(pesoch+"");
    	EditText pReal = (EditText)findViewById(R.id.editText6);
    	double real = monto/ 2.2852;
    	pReal.setText(real+"");
    	EditText pYuan = (EditText)findViewById(R.id.editText7);
    	double yuan = monto/ 1.1379;
    	pYuan.setText(yuan+"");
    	EditText pYen = (EditText)findViewById(R.id.editText8);
    	double yen = monto/ 0.05849034;
    	pYen.setText(yen+"");    	
    }
    public void resetear(View vista){
    	EditText pBoliviano = (EditText)findViewById(R.id.editText1);
    	pBoliviano.setText("");
    	EditText pDolar = (EditText)findViewById(R.id.editText2);
    	pDolar.setText("");
    	EditText pEuro = (EditText)findViewById(R.id.editText3);
    	pEuro.setText("");
    	EditText pSoles = (EditText)findViewById(R.id.editText4);
    	pSoles.setText("");
    	EditText pPesoCh = (EditText)findViewById(R.id.editText5);
    	pPesoCh.setText("");
    	EditText pReal = (EditText)findViewById(R.id.editText6);
    	pReal.setText("");
    	EditText pYuan = (EditText)findViewById(R.id.editText7);
    	pYuan.setText("");
    	EditText pYen = (EditText)findViewById(R.id.editText8);
    	pYen.setText("");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
