package com.example.jimmyestudo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterAlunos extends RecyclerView.Adapter<AdapterAlunos.ViewHolder> {

    private List<Aluno> listAlunos;

    public AdapterAlunos(List<Aluno> listAlunos) {
        this.listAlunos = listAlunos;
    }

    //conecta com nosso item do recycler
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent,false);
        return new ViewHolder(view);
    }


    //multiplicar a classe modelo
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Aluno aluno = listAlunos.get(position);
        holder.bind(aluno);
    }

    //pegar o tamanho total da lista
    @Override
    public int getItemCount() {
        return listAlunos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView nomeAluno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeAluno = itemView.findViewById(R.id.txt_titulo);
        }

        public void bind(Aluno aluno){
            nomeAluno.setText(aluno.getNome());
        }

    }
}
