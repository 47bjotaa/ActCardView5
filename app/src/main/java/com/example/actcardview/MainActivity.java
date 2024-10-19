package com.example.actcardview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListadoDeElementos> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListadoDeElementos("#877657", "Ver Más", "Universidad de la Serena", "La serena"));
        elements.add(new ListadoDeElementos("#607D8B", "Ver Más", "Santo Tomas", "La serena"));
        elements.add(new ListadoDeElementos("#03a9f4", "Ver Más", "Inacap", "La serena"));
        elements.add(new ListadoDeElementos("#f44336", "Ver Más", "Ip Chile", "La serena"));
        elements.add(new ListadoDeElementos("#009688", "Ver Más", "Ucn", "Coquimbo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecycledView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);







    }
}