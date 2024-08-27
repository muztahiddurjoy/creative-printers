package com.creativeprinters.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class MainOperation extends AppCompatActivity {

    //paper size dropdown
    TextInputLayout paperSize, finishLay;
    AutoCompleteTextView paper_autoComplete, finish_autocomplete;

    TextInputEditText page_number;
    MaterialCheckBox single, doubleSide;

    //finish type dropdown
    ArrayList<String> dropArray, dropFinish;
    ArrayAdapter<String> dropdownArrayAdapter, dropdownFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_operation);
        paperSize = findViewById(R.id.drop_paper);
        finishLay = findViewById(R.id.drop_finish_layout);

        paper_autoComplete = findViewById(R.id.autocomplete_drop);
        finish_autocomplete = findViewById(R.id.finish_drop);

        single = findViewById(R.id.single_check);
        doubleSide = findViewById(R.id.double_check);
        page_number = findViewById(R.id.page_num);


        //paper size dropdown
        dropArray = new ArrayList<>();
        dropArray.add("A2\t420 x 594 mm\t16.5 x 23.4 in");
        dropArray.add("A3\t297 x 420 mm\t11.7 x 16.5 in");
        dropArray.add("A4\t210 x 297 mm\t8.3 x 11.7 in");
        dropArray.add("A5\t148 x 210 mm\t5.8 x 8.3 in");


        //finish type dropdown
        dropFinish = new ArrayList<String>();
        dropFinish.add("Coated Paper");
        dropFinish.add("Gloss");
        dropFinish.add("Satin");
        dropFinish.add("Matte");
        dropFinish.add("Dull");
        dropdownFinish = new ArrayAdapter<String>( getApplicationContext(), R.layout.support_simple_spinner_dropdown_item,dropFinish);
        finish_autocomplete.setAdapter(dropdownFinish);
        finish_autocomplete.setThreshold(1);
        dropdownArrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, dropArray);
        paper_autoComplete.setAdapter(dropdownArrayAdapter);
        paper_autoComplete.setThreshold(1);
    }
}