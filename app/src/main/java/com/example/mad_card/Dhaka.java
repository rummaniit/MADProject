package com.example.mad_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dhaka extends AppCompatActivity implements View.OnClickListener {

    public CardView dhakac, gazipur, narsingdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        dhakac = (CardView) findViewById(R.id.dhakac);
        gazipur = (CardView) findViewById(R.id.gazipur);
        narsingdi = (CardView) findViewById(R.id.narsingdi);

        dhakac.setOnClickListener(this);
        gazipur.setOnClickListener(this);
        narsingdi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.dhakac:
                i = new Intent(this, dhakac.class);
                startActivity(i);
                break;
            case R.id.gazipur:
                i = new Intent(this, gazipur.class);
                startActivity(i);
                break;
            case R.id.narsingdi:
                i = new Intent(this, narsingdi.class);
                startActivity(i);
                break;

        }

    }
}