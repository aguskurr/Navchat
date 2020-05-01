package com.example.nav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class Login extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button buttonlog = findViewById(R.id.button3);


        buttonlog.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent log = new Intent(getApplicationContext(), MainActivity.class);
                // memulai activity baru sesuai yang diminta pada intent di atas
                startActivity(log);

            }
        });

    }

}