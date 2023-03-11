package com.example_Iqbal_Febtien.mylogin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // inisialisasi TextView dan Button pada layout
        TextView usernameTextView = findViewById(R.id.usernameTextView);
        Button homeButton = findViewById(R.id.homeButton);

        // mendapatkan data username dari Intent yang dikirim dari MainActivity
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        // menampilkan username pada TextView
        usernameTextView.setText("Selamat datang " + username);

        // menambahkan listener pada tombol untuk  berpindah ke halaman MainActivity
        homeButton.setOnClickListener(v -> {
            Intent i = new Intent(Dashboard.this, MainActivity.class);
            startActivity(i);
        });
    }
}