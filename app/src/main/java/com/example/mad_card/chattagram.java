package com.example.mad_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chattagram extends AppCompatActivity implements View.OnClickListener {

    public CardView chattag, coxs, chandpur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattagram);

        chattag = (CardView) findViewById(R.id.chattag);
        coxs = (CardView) findViewById(R.id.coxs);
        chandpur = (CardView) findViewById(R.id.chandpur);

        chattag.setOnClickListener(this);
        coxs.setOnClickListener(this);
        chandpur.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.chattag:
                i = new Intent(this, chattag.class);
                startActivity(i);
                break;
            case R.id.coxs:
                i = new Intent(this, coxs.class);
                startActivity(i);
                break;
            case R.id.chandpur:
                i = new Intent(this, chandpur.class);
                startActivity(i);
                break;

        }

    }
}