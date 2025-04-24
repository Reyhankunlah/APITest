package com.example.apitest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testingapi.MainActivity;
import com.example.testingapi.R;

public class MenuUtama extends AppCompatActivity {

    private Button btnPrLg;
    private Button btnLalg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnPrLg = findViewById(R.id.btnPrLg);
        btnLalg = findViewById(R.id.btnLaLg);

        btnPrLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnLalg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, LaLigaActivity.class);
                startActivity(intent);
            }
        });
    }
}
