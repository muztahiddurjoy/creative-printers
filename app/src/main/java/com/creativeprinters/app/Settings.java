package com.creativeprinters.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Settings extends AppCompatActivity {

    TextInputEditText a2Paper,a3Paper,a4Paper,a5Paper, coated_paper, gloss, satin, matte, dull;
    Button save_settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        a2Paper = findViewById(R.id.a2paper_cost);
        a3Paper = findViewById(R.id.a3_paper_cost);
        a4Paper = findViewById(R.id.a4_paper_cost);
        a5Paper = findViewById(R.id.a5_paper_size);

        coated_paper = findViewById(R.id.coated_paper_edit);
        gloss = findViewById(R.id.gloss_paper_edit);
        satin = findViewById(R.id.satin_edit);
        matte = findViewById(R.id.matte_edit);
        dull = findViewById(R.id.dull_edit);


        save_settings = findViewById(R.id.changes_button);
    }
}