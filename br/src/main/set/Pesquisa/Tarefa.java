package br.src.main.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
    
    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", tarefaConcluida=" + tarefaConcluida + "]";
    }
    
    
}
