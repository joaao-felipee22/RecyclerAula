package com.example.jimmyestudo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Aluno> listAlunos;
    private RecyclerView recyclerView;
    private AdapterAlunos adapterAlunos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_home);
        adapterAlunos = new AdapterAlunos(getList());
        recyclerView.setAdapter(adapterAlunos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

    }

    public List getList(){
        listAlunos = new ArrayList<>();
        listAlunos.add(new Aluno("Joao"));
        listAlunos.add(new Aluno("Jimmy"));
        listAlunos.add(new Aluno("Cesar"));
        listAlunos.add(new Aluno("Jonas"));
        listAlunos.add(new Aluno("Leo"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));
        listAlunos.add(new Aluno("Abraao"));

        return listAlunos;
    }


}
