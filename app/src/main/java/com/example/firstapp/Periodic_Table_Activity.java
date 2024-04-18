package com.example.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class Periodic_Table_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table);
        initializeElements();
    }

    private void initializeElements() {
        List<Elements> elements = Arrays.asList(
                new Elements("Hydrogen", "H", 1),
                new Elements("Helium", "He", 2),
                new Elements("Lithium", "Li", 3),
                new Elements("Beryllium", "Be", 4),
                new Elements("Boron", "B", 5),
                new Elements("Carbon", "C", 6),
                new Elements("Nitrogen", "N", 7),
                new Elements("Oxygen", "O", 8),
                new Elements("Fluorine", "F", 9),
                new Elements("Neon", "Ne", 10),
                new Elements("Sodium", "Na", 11),
                new Elements("Magnesium", "Mg", 12),
                new Elements("Aluminum", "Al", 13),
                new Elements("Silicon", "Si", 14),
                new Elements("Phosphorus", "P", 15),
                new Elements("Sulfur", "S", 16),
                new Elements("Chlorine", "Cl", 17),
                new Elements("Argon", "Ar", 18),
                new Elements("Potassium", "K", 19),
                new Elements("Calcium", "Ca", 20),
                new Elements("Scandium", "Sc", 21),
                new Elements("Titanium", "Ti", 22),
                new Elements("Vanadium", "V", 23),
                new Elements("Chromium", "Cr", 24),
                new Elements("Manganese", "Mn", 25),
                new Elements("Iron", "Fe", 26),
                new Elements("Cobalt", "Co", 27),
                new Elements("Nickel", "Ni", 28),
                new Elements("Copper", "Cu", 29),
                new Elements("Zinc", "Zn", 30),
                new Elements("Gallium", "Ga", 31),
                new Elements("Germanium", "Ge", 32),
                new Elements("Arsenic", "As", 33),
                new Elements("Selenium", "Se", 34),
                new Elements("Bromine", "Br", 35),
                new Elements("Krypton", "Kr", 36),
                new Elements("Rubidium", "Rb", 37),
                new Elements("Strontium", "Sr", 38),
                new Elements("Yttrium", "Y", 39),
                new Elements("Zirconium", "Zr", 40),
                new Elements("Niobium", "Nb", 41),
                new Elements("Molybdenum", "Mo", 42),
                new Elements("Technetium", "Tc", 43),
                new Elements("Ruthenium", "Ru", 44),
                new Elements("Rhodium", "Rh", 45),
                new Elements("Palladium", "Pd", 46),
                new Elements("Silver", "Ag", 47),
                new Elements("Cadmium", "Cd", 48),
                new Elements("Indium", "In", 49),
                new Elements("Tin", "Sn", 50),
                new Elements("Antimony", "Sb", 51),
                new Elements("Tellurium", "Te", 52),
                new Elements("Iodine", "I", 53),
                new Elements("Xenon", "Xe", 54),
                new Elements("Cesium", "Cs", 55),
                new Elements("Barium", "Ba", 56),
                new Elements("Lanthanum", "La", 57),
                new Elements("Cerium", "Ce", 58),
                new Elements("Praseodymium", "Pr", 59),
                new Elements("Neodymium", "Nd", 60),
                new Elements("Promethium", "Pm", 61),
                new Elements("Samarium", "Sm", 62),
                new Elements("Europium", "Eu", 63),
                new Elements("Gadolinium", "Gd", 64),
                new Elements("Terbium", "Tb", 65),
                new Elements("Dysprosium", "Dy", 66),
                new Elements("Holmium", "Ho", 67),
                new Elements("Erbium", "Er", 68),
                new Elements("Thulium", "Tm", 69),
                new Elements("Ytterbium", "Yb", 70),
                new Elements("Lutetium", "Lu", 71),
                new Elements("Hafnium", "Hf", 72),
                new Elements("Tantalum", "Ta", 73),
                new Elements("Tungsten", "W", 74),
                new Elements("Rhenium", "Re", 75),
                new Elements("Osmium", "Os", 76),
                new Elements("Iridium", "Ir", 77),
                new Elements("Platinum", "Pt", 78),
                new Elements("Gold", "Au", 79),
                new Elements("Mercury", "Hg", 80),
                new Elements("Thallium", "Ti", 81),
                new Elements("Lead", "Pb", 82),
                new Elements("Bismuth", "Bi", 83),
                new Elements("Polonium", "Po", 84),
                new Elements("Astatine", "At", 85),
                new Elements("Radon", "Rn", 86),
                new Elements("Francium", "Fr", 87),
                new Elements("Radium", "Ra", 88),
                new Elements("Actinium", "Ac", 89),
                new Elements("Thorium", "Th", 90),
                new Elements("Protactinium", "Pa", 91),
                new Elements("Uranium", "U", 92),
                new Elements("Neptunium", "Np", 93),
                new Elements("Plutonium", "Pu", 94),
                new Elements("Americium", "Am", 95),
                new Elements("Curium", "Cm", 96),
                new Elements("Berkelium", "Bk", 97),
                new Elements("Californium", "Cf", 98),
                new Elements("Einsteinium", "Es", 99),
                new Elements("Fermium", "Fm", 100),
                new Elements("Mendelevium", "Md", 101),
                new Elements("Nobelium", "No", 102),
                new Elements("Lawrencium", "Lr", 103),
                new Elements("Rutherfordium", "Rf", 104),
                new Elements("Dubnium", "Db", 105),
                new Elements("Seaborgium", "Sg", 106),
                new Elements("Bohrium", "Bh", 107),
                new Elements("Hassium", "Hs", 108),
                new Elements("Meitnerium", "Mt", 109),
                new Elements("Darmstadtium", "Ds", 110),
                new Elements("Roentgenium", "Rg", 111),
                new Elements("Copernicium", "Cn", 112),
                new Elements("Nihonium", "Nh", 113),
                new Elements("Flerovium", "Fl", 114),
                new Elements("Moscovium", "Mc", 115),
                new Elements("Livermorium", "Lv", 116),
                new Elements("Tennessine", "Ts", 117),
                new Elements("Oganesson", "Og", 118)
        );

        GridLayout gridLayout = findViewById(R.id.gridLayout);

        for (Elements element : elements) {
            Button button = new Button(this);
            button.setText(element.getSymbol());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showToast("Name:" + element.getName()+" With Atomic Number:"+element.getAtomicNumber());
                }
            });
            gridLayout.addView(button);
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
