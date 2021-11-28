package com.example.gomechanic_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void menuju_editprofile(View view) {
        Intent intent = new Intent(this, editprofile.class);
        startActivity(intent);
    }
    public void menuju_editpassword(View view) {
        Intent intent = new Intent(this, editpassword.class);
        startActivity(intent);
    }
}