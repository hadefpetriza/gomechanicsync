package com.example.gomechanic_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detail_order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_order);
    }

    public void menuju_home(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}