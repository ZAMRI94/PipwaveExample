package com.example.pipwave.sdk.pipwaveexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.pipwave.sdk.android.pipwave.model.AddressInfo;


public class AddressActivity extends AppCompatActivity {

    EditText editName, editAddress1, editAddress2;
    EditText editCity, editState, editZip, editCountry;
    EditText editContact, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        editName = findViewById(R.id.editName);
        editAddress1 = findViewById(R.id.editAddress1);
        editAddress2 = findViewById(R.id.editAddress2);
        editCity = findViewById(R.id.editCity);
        editState = findViewById(R.id.editState);
        editZip = findViewById(R.id.editZip);
        editCountry = findViewById(R.id.editCountry);
        editContact = findViewById(R.id.editContact);
        editEmail = findViewById(R.id.editEmail);
    }

    public void cont(View view) {

        String name = editName.getText().toString();
        String address1 = editAddress1.getText().toString();
        String address2 = editAddress2.getText().toString();
        String city = editCity.getText().toString();
        String state = editState.getText().toString();
        String zip = editZip.getText().toString();
        String country = editCountry.getText().toString();
        String contact = editContact.getText().toString();
        String email = editEmail.getText().toString();

        AddressInfo addressInfo = new AddressInfo(name, address1, address2, city, state, zip,country,contact,email);
        Intent i = new Intent(AddressActivity.this, InfoActivity.class);

        Bundle bundles = getIntent().getExtras();
        if(bundles != null){
            //MainActivity
            i.putExtras(bundles);
            //AddressActivity
            i.putExtra("email", email);
            i.putExtra("address", addressInfo);
        }
        startActivity(i);
    }
}
