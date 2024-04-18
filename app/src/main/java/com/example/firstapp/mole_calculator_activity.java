package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Locale;

public class mole_calculator_activity extends AppCompatActivity {
    private EditText editMass;
    private EditText editMolarMass;
    private TextView textResult;
    private Button btnCalculate;
    private ListView listHistory;
    private ArrayAdapter<String> historyAdapter;
    private ArrayList<String> calculationHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mole_calculator);

       Hoks();

        calculationHistory = new ArrayList<>();
        historyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, calculationHistory);
        listHistory.setAdapter(historyAdapter);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateMoles();
            }
        });
    }

    private void Hoks() {
        editMass = findViewById(R.id.editMass);
        editMolarMass = findViewById(R.id.editMolarMass);
        textResult = findViewById(R.id.textResult);
        btnCalculate = findViewById(R.id.btnCalculate);
        listHistory = findViewById(R.id.listHistory);
    }

    private void calculateMoles() {
        String massString = editMass.getText().toString();
        String molarMassString = editMolarMass.getText().toString();

        if (!massString.isEmpty() && !molarMassString.isEmpty()) {
            try {
                double mass = Double.parseDouble(massString);
                double molarMass = Double.parseDouble(molarMassString);
                double moles = mass / molarMass;

                String resultText = String.format(Locale.getDefault(), "Moles: %.2f", moles);
                textResult.setText(resultText);

                String historyEntry = massString + " g / " + molarMassString + " g/mol = " + resultText;
                calculationHistory.add(historyEntry);
                historyAdapter.notifyDataSetChanged();
            } catch (NumberFormatException e) {
                textResult.setText("Please enter valid numbers.");
            }
        } else {
            textResult.setText("Please enter mass and molar mass.");
        }
    }
}