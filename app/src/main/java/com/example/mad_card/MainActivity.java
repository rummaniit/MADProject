package com.example.mad_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView dhaka,khulna,chattagram,maymanshingh,sylhet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhaka=(CardView) findViewById(R.id.dhaka);
        khulna=(CardView) findViewById(R.id.khulna);
        chattagram=(CardView) findViewById(R.id.chattagram);
        maymanshingh=(CardView) findViewById(R.id.maymanshingh);
        sylhet=(CardView) findViewById(R.id.sylhet);

        dhaka.setOnClickListener(this);
        khulna.setOnClickListener(this);
        chattagram.setOnClickListener(this);
        maymanshingh.setOnClickListener(this);
        sylhet.setOnClickListener(this);
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

        }

    }
}