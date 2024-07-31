package com.abctreinamentos.siscapacit2;

public interface APICurso {
    public void adicionarCurso();
    public void listarCursos();
    public void listarCurso(int matricula);
    public void alterarCurso(Curso servidorAlterado);
    public void excluirCurso(int matricula);

    void listarCursosServidorPublico(int matricula);

    public void adicionarServidorCurso (int idcurso, int matricula);
    public void excluirServidorCurso( int idcurso, int matricula);
    public void listarServidorCurso(int idcurso);

    void listarServidoresCurso(int idcurso);
}
