package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;

    private String titulo, descricao;

    public abstract double calculaXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
