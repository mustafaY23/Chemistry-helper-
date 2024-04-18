package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button MoleCalculator;
    Button PreparationCalculator;
    Button PeriodicTable;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Hoks();
        MoleCalculator = (Button) findViewById(R.id.MoleCalculator);
        MoleCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentForMoleCalc = new Intent(MainActivity.this, mole_calculator_activity.class);
                startActivity(intentForMoleCalc);
            }
        });

        PreparationCalculator = (Button) findViewById(R.id.PreparationCalculator);
        PreparationCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentForCompoundExplorer = new Intent(MainActivity.this, Preparation_Calculator_activity.class);
                startActivity(intentForCompoundExplorer);
            }
        });

        PeriodicTable = (Button) findViewById(R.id.PeriodicTable);
        PeriodicTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentForPeriodicTable = new Intent(MainActivity.this,Periodic_Table_Activity.class);
                startActivity(intentForPeriodicTable);
            }
        });


    }

    private void Hoks() {
        MoleCalculator=findViewById(R.id.MoleCalculator);
        PreparationCalculator=findViewById(R.id.PreparationCalculator);
        PeriodicTable=findViewById(R.id.PeriodicTable);

    }





}