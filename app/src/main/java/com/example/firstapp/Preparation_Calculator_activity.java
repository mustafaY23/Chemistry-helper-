package com.example.firstapp;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Preparation_Calculator_activity extends AppCompatActivity {

    private EditText volumeInput;
    private EditText molarityInput;
    private EditText molarMassInput;
    private TextView resultText;
    private Button calculateButton;

    private ListView historyListView;
    private ArrayAdapter<String> historyAdapter;
    private List<String> historyList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparation_calculator);
        Hoks();

        historyListView = findViewById(R.id.listHistory);
        historyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historyList);
        historyListView.setAdapter(historyAdapter);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSoluteMass();
            }
        });
    }

    private void Hoks() {
        volumeInput = findViewById(R.id.volumeInput);
        molarityInput = findViewById(R.id.molarityInput);
        molarMassInput = findViewById(R.id.molarMassInput);
        resultText = findViewById(R.id.resultText);
        calculateButton = findViewById(R.id.calculateButton);
    }


    private void calculateSoluteMass() {
        String volumeStr = volumeInput.getText().toString();
        String molarityStr = molarityInput.getText().toString();
        String molarMassStr = molarMassInput.getText().toString();

        if (volumeStr.isEmpty() || molarityStr.isEmpty() || molarMassStr.isEmpty()) {
            resultText.setText("Please fill all the fields.");
            return;
        }

        try {
            double volume = Double.parseDouble(volumeStr);
            double molarity = Double.parseDouble(molarityStr);
            double molarMass = Double.parseDouble(molarMassStr);

            double mass = volume * molarity * molarMass;
            String result = String.format(Locale.getDefault(), "Mass of solute needed: %.2f g", mass);
            resultText.setText(result);

            String historyEntry = "Volume: " + volumeStr + " L, Molarity: " + molarityStr + " M, Molar Mass: " + molarMassStr + " g/mol -> " + result;
            historyList.add(0, historyEntry);
            historyAdapter.notifyDataSetChanged();
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers.");
        }
    }

}