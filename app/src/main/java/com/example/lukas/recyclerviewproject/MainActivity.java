package com.example.lukas.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private RecyclerView mRecyclerView;
private RecyclerView.Adapter mAdapter;
// "bridge between the arraylist and the recycler view". Lädt die Items der Reihe nach in die RecyclerView

private RecyclerView.LayoutManager mLayoutManager;

/* Recyclerview und LayoutManager sind schon vorgefertigt.
Wir brauchen nur noch eine Klasse für den Adapter*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//---------------------------ArrayList erstellen und die Items einfügen--------------------
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.mipmap.punkt3, "11.10.2018 - 11.11.2018", "Ultraschalluntersuchung"));  //Line 1 und Line 2 sind dann Datum und Untersuchung
        exampleList.add(new ExampleItem(R.mipmap.punkt3, "18.1.2019 - 4.3.2019", "Hüftuntersuchung"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize((true));
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
