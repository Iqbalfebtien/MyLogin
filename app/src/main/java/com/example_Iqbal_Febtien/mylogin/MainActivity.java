package com.example_Iqbal_Febtien.mylogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private EditText mUsernameEditText, mPasswordEditText;
    private Button mLoginButton, mRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsernameEditText = findViewById(R.id.Username);
        mPasswordEditText = findViewById(R.id.etpassword);
        mLoginButton = findViewById(R.id.btnLogin);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Syarat login harus input username dan password (contoh diset default loginnya sebagai admin)
                String username = mUsernameEditText.getText().toString().trim();
                String password = mPasswordEditText.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon lengkapi semua field!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Berhasil!", Toast.LENGTH_SHORT).show();
                    // jika berhasil login, pindah ke halaman LoginSuccess
                    Intent i = new Intent(MainActivity.this, Dashboard.class);
                    i.putExtra("username", username);
                    startActivity(i);
                }


            }
        });
    }
}