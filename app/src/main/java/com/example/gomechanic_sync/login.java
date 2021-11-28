package com.example.gomechanic_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void menuju_registrasi(View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
    public void login(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}