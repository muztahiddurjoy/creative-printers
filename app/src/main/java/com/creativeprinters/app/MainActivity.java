package com.creativeprinters.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    MaterialCardView cardViewDigital,cardOffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardViewDigital = findViewById(R.id.digital_button);
        cardOffset = findViewById(R.id.card_offset);

        cardViewDigital.setOnClickListener((v)->{
            Intent intent = new Intent(this,MainOperation.class);
            intent.putExtra("option","digital");
            startActivity(intent);
        });

        cardOffset.setOnClickListener((v)->{
            Intent intent = new Intent(this,MainOperation.class);
            intent.putExtra("option","offset");
            startActivity(intent);
        });
    }
}