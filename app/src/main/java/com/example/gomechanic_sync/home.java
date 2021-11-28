package com.example.gomechanic_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    ImageButton imagebuttonorder;
    ImageButton imagebuttonprofil;
    ImageButton imagebuttonlist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imagebuttonprofil = (ImageButton) findViewById(R.id.imagemenujuprofile);
        imagebuttonprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, profil.class);
                startActivity(intent);
            }

        } );
        imagebuttonorder = (ImageButton) findViewById(R.id.imagemenujuorder);
        imagebuttonorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, addorder.class);
                startActivity(intent);
            }

        } );

        imagebuttonlist = (ImageButton) findViewById(R.id.imagemenujulist);
        imagebuttonlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, list_mechanic.class);
                startActivity(intent);
            }

        } );


    }
    }
