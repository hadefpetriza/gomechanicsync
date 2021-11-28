package com.example.gomechanic_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class addorder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addorder);
    }
    public void menuju_detail_order(View view) {
        Intent intent = new Intent(this, detail_order.class);
        startActivity(intent);
    }
}