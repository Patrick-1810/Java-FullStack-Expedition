package com.abctreinamentos.siscapacit2;

public interface APIServidorPublico {

    public void adicionarServidorPublico();
    public void listarServidoresPublico();
    public void listarServidorPublico(int matricula);
    public void alterarServidorPublico(ServidorPublico servidorAlterado);
    public void excluirServidorPublico(int matricula);
    public void caulcularFolhaServidoresPublicos();
    public void adicionarCursoServidorPublico ( int matricula, int idcurso);
    public void excluirCursoServidorPublico(int matricula, int idcurso);
    public void listarCursoServidorPublico(int matricula);

}
