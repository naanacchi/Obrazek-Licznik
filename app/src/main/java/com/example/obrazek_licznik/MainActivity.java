package com.example.obrazek_licznik;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button polubBTN = findViewById(R.id.polubBtn);
        Button usunBTN = findViewById(R.id.usunBtn);
        TextView licznikTV=findViewById(R.id.licznikTV);
        polubBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String licznikString = licznikTV.getText().toString();
            int licznikInt = Integer.parseInt(licznikString);
            licznikInt++;
            licznikString=Integer.toString(licznikInt);
            licznikTV.setText(licznikString);
            }
        });
        usunBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String licznikString = licznikTV.getText().toString();
                int licznikInt = Integer.parseInt(licznikString);
                if (licznikInt>0) {
                    licznikInt--;
                    licznikString = Integer.toString(licznikInt);
                    licznikTV.setText(licznikString);
                }
            }
        });
    }
}