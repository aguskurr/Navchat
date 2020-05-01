package com.example.nav;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Awal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);

        Button buttonawl = findViewById(R.id.button);
        buttonawl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity

                Intent iawl = new Intent(getApplicationContext(), Login.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(iawl);
            }
        });


    }

}

