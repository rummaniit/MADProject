package com.example.mad_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView dhaka,khulna,chattagram,maymanshingh,sylhet,barishal,rangpur,rajsahi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhaka=(CardView) findViewById(R.id.dhaka);
        khulna=(CardView) findViewById(R.id.khulna);
        chattagram=(CardView) findViewById(R.id.chattagram);
        maymanshingh=(CardView) findViewById(R.id.maymanshingh);
        sylhet=(CardView) findViewById(R.id.sylhet);
        barishal=(CardView) findViewById(R.id.barishal);
        rangpur=(CardView) findViewById(R.id.rangpur);
        rajsahi=(CardView) findViewById(R.id.rajsahi);

        dhaka.setOnClickListener(this);
        khulna.setOnClickListener(this);
        chattagram.setOnClickListener(this);
        maymanshingh.setOnClickListener(this);
        sylhet.setOnClickListener(this);
        barishal.setOnClickListener(this);
        rangpur.setOnClickListener(this);
        rajsahi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.dhaka:
                i=new Intent(this,Dhaka.class);
                startActivity(i);
                break;
            case R.id.khulna:
                i=new Intent(this,khulna.class);
                startActivity(i);
                break;
            case R.id.chattagram:
                i=new Intent(this,chattagram.class);
                startActivity(i);
                break;
            case R.id.maymanshingh:
                i=new Intent(this,maymanshingh.class);
                startActivity(i);
                break;
            case R.id.sylhet:
                i=new Intent(this,sylhet.class);
                startActivity(i);
                break;
            case R.id.barishal:
                i=new Intent(this,barishal.class);
                startActivity(i);
                break;
            case R.id.rangpur:
                i=new Intent(this,rangpur.class);
                startActivity(i);
                break;
            case R.id.rajsahi:
                i=new Intent(this,rajsahi.class);
                startActivity(i);
                break;

        }

    }
}