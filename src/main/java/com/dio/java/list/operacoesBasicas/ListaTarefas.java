package com.dio.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();

        for (Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao))
                tarefasRemove.add(t);
        }

        tarefaList.removeAll(tarefasRemove);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    public void obterDescricao(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println(listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println(listaTarefa.obterNumeroTarefas());

        listaTarefa.obterDescricao();
    }
}
