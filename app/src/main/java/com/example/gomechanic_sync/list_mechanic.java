package com.example.gomechanic_sync;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class list_mechanic extends AppCompatActivity {

    RecyclerView rvList;
    MechanicAdapter mechanicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mechanic);

        mechanicAdapter = new MechanicAdapter();
        mechanicAdapter.setListMechanic(getDataMechanic());

        rvList = findViewById(R.id.rvList);
        rvList.setAdapter(mechanicAdapter);
        LinearLayoutManager linearManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(linearManager);
    }

    public ArrayList<Mechanic> getDataMechanic(){
    ArrayList<Mechanic> list = new ArrayList<>();
    list.add(new Mechanic("profile", "Ari", "+62 811 1111 1111"));
    list.add(new Mechanic("profile", "Bukyt", "+62 822 2222 2222"));
    list.add(new Mechanic("profile", "Hadef", "+62 833 3333 3333"));
    list.add(new Mechanic("profile", "Shinta", "+62 844 4444 4444"));

    return list;
    }
}