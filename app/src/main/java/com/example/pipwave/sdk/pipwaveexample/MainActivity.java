package com.example.pipwave.sdk.pipwaveexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText qtyMarron, qtyBlack;
    EditText marronTotal, blackTotal, subtotal;

    int qty1 = 0;
    int qty2 = 0;

    int subMarron = 0;
    int subBlack = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qtyMarron = findViewById(R.id.quantity1);
        qtyBlack = findViewById(R.id.quantity2);

        marronTotal = findViewById(R.id.mTotal);
        blackTotal = findViewById(R.id.bTotal);
        subtotal = findViewById(R.id.total);

    }

    public void marronPlus(View view) {
        qty1 = qty1 + 1;
        qtyMarron.setText(String.valueOf(qty1));

        subMarron = qty1 * 15;
        marronTotal.setText(String.valueOf(subMarron));

        String n = blackTotal.getText().toString();
        int s = Integer.parseInt(n);
        total = s + subMarron;
        subtotal.setText(String.valueOf(total));
    }

    public void marronMinus(View view) {
        qty1 = qty1 - 1;
        if(qty1 < 0){
            qty1 = 0;
        }
        qtyMarron.setText(String.valueOf(qty1));

        subMarron = qty1 * 15;
        marronTotal.setText(String.valueOf(subMarron));

        String n = blackTotal.getText().toString();
        int s = Integer.parseInt(n);
        total = s + subMarron;
        subtotal.setText(String.valueOf(total));
    }

    public void blackPlus(View view) {
        qty2 = qty2 + 1;
        qtyBlack.setText(String.valueOf(qty2));

        subBlack = qty2 * 10;
        blackTotal.setText(String.valueOf(subBlack));

        String n = marronTotal.getText().toString();
        int s = Integer.parseInt(n);
        total = s + subBlack;
        subtotal.setText(String.valueOf(total));
    }

    public void blackMinus(View view) {
        qty2 = qty2 - 1;
        if(qty2 < 0){
            qty2 = 0;
        }
        qtyBlack.setText(String.valueOf(qty2));

        subBlack = qty2 * 10;
        blackTotal.setText(String.valueOf(subBlack));

        String n = marronTotal.getText().toString();
        int s = Integer.parseInt(n);
        total = s + subBlack;
        subtotal.setText(String.valueOf(total));
    }

    public void checkout(View view) {

        String quantity1 = qtyMarron.getText().toString();
        String quantity2 = qtyBlack.getText().toString();
        String totalMarron = marronTotal.getText().toString();
        String totalBlack = blackTotal.getText().toString();
        String subTotal = subtotal.getText().toString();

        Intent i = new Intent(MainActivity.this, AddressActivity.class);
        i.putExtra("quantity1",quantity1);
        i.putExtra("quantity2", quantity2);
        i.putExtra("totalMarron", totalMarron);
        i.putExtra("totalBlack", totalBlack);
        i.putExtra("subTotal", subTotal);
        startActivity(i);
    }


}


