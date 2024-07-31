package com.abctreinamentos.siscapacit;

public class Curso {
    // Atributos da classe Curso
    private int idCurso;
    private String nome;
    private String formaRealizacao;
    private String ofertante;
    private double valor;

    // Construtor da classe Curso
    public Curso(int idCurso, String nome, String formaRealizacao, String ofertante, double valor) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.formaRealizacao = formaRealizacao;
        this.ofertante = ofertante;
        this.valor = valor;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaRealizacao() {
        return formaRealizacao;
    }

    public void setFormaRealizacao(String formaRealizacao) {
        this.formaRealizacao = formaRealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nome='" + nome + '\'' +
                ", formaRealizacao='" + formaRealizacao + '\'' +
                ", ofertante='" + ofertante + '\'' +
                ", valor=" + valor +
                '}';
    }
}
