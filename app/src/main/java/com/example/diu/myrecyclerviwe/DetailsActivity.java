package com.example.diu.myrecyclerviwe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView name,email,address,gender;
    String contactName, contactEmail, contactAddress, contactGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = findViewById(R.id.descname);
        email = findViewById(R.id.descemail);
        address = findViewById(R.id.descaddress);
        gender = findViewById(R.id.descgender);


        contactName = getIntent().getStringExtra("name");
        contactEmail = getIntent().getStringExtra("email");
        contactAddress = getIntent().getStringExtra("address");
        contactGender = getIntent().getStringExtra("gender");

        name.setText(contactName);
        email.setText(contactEmail);
        address.setText(contactAddress);
        gender.setText(contactGender);
    }
}
