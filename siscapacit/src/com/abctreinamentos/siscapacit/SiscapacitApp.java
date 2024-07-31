package com.abctreinamentos.siscapacit;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class SiscapacitApp {

    // Atributos
    List<ServidorPublico> servidores = new LinkedList<>();
    List<Curso> cursos = new LinkedList<>();

    // Metodos CRUD - Servidores Publicos
    public void adicionarServiodresPublicos() {
        int matricula = Integer.parseInt(showInputDialog("Digite a matricula"));
        String nome = showInputDialog("Digite o nome");
        String orgao = showInputDialog("Digite o orgão");
        String cargo = showInputDialog("Digite o cargo");
        String lotacao = showInputDialog("Digite a lotacao");
        String email = showInputDialog("Digite o email");
        Double salario = Double.parseDouble(showInputDialog("Digite o salário"));

        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);
        servidores.add(servidor);
    }

    public void listarServidoresPublicos() {
        for (ServidorPublico servidor : servidores) {
            System.out.println(servidor);
        }
    }

    public void listarServidorPublico(int matricula) {
        boolean encontrou = false;

        for (ServidorPublico servidor : servidores) {
            if (servidor.getMatricula() == matricula) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }

        if (!encontrou)
            System.out.println("Matricula informada não existe.");
    }

    public void alterarServidor(ServidorPublico servidorAlterado) {
        boolean encontrou = false;

        for (int i = 0; i < servidores.size(); i++) {
            if (servidores.get(i).getMatricula() == servidorAlterado.getMatricula()) {
                servidores.set(i, servidorAlterado);
                encontrou = true;
                break;
            }
        }

        if (!encontrou)
            System.out.println("Matricula informada não existe.");
        else
            System.out.println("Alteração do servidor com a matricula " + servidorAlterado.getMatricula()
                    + " realizada com sucesso!");
    }

    public void excluirServidorPublico(int matricula) {
        boolean encontrou = false;

        for (ServidorPublico servidor : servidores) {
            if (servidor.getMatricula() == matricula) {
                servidores.remove(servidor);
                encontrou = true;
                break;
            }
        }

        if (!encontrou)
            System.out.println("Matricula informada não existe.");
        else
            System.out.println("Exclusão do servidor com a matricula " + matricula + " realizada com sucesso!");
    }

    public void calcularFolhaServidoresPublicos() {
        double folhaSalarial = 0;
        for (ServidorPublico servidor : servidores)
            folhaSalarial = folhaSalarial + servidor.getSalario();
        System.out.println("A folha salarial é " + folhaSalarial);
    }

    // Metodos CRUD - Curso

    // Método para adicionar cursos
    public void adicionarCurso() {
        int idCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do curso"));
        String nome = JOptionPane.showInputDialog("Digite o nome do curso");
        String formaRealizacao = JOptionPane.showInputDialog("Digite a forma de realização");
        String ofertante = JOptionPane.showInputDialog("Digite o ofertante");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));

        Curso curso = new Curso(idCurso, ofertante, ofertante, ofertante, valor);
        curso.setIdCurso(idCurso);
        curso.setNome(nome);
        curso.setFormaRealizacao(formaRealizacao);
        curso.setOfertante(ofertante);
        curso.setValor(valor);
        cursos.add(curso);
    }

    // Método para listar todos os cursos
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    // Método para listar um curso específico pelo ID
    public void listarCurso(int idCurso) {
        boolean encontrou = false;

        for (Curso curso : cursos) {
            if (curso.getIdCurso() == idCurso) {
                System.out.println(curso);
                encontrou = true;
                break;
            }
        }

        if (!encontrou)
            System.out.println("ID do curso informado não existe.");
    }

    // Método para alterar os dados de um curso
    public void alterarCurso(Curso cursoAlterado) {
        boolean encontrou = false;

        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getIdCurso() == cursoAlterado.getIdCurso()) {
                cursos.set(i, cursoAlterado);
                encontrou = true;
                break;
            }
        }

        if (!encontrou)
            System.out.println("ID do curso informado não existe.");
        else
            System.out.println("Alteração do curso com ID " + cursoAlterado.getIdCurso() + " realizada com sucesso!");
    }

    // Método para excluir um curso pelo ID
    public void excluirCurso(int idCurso) {
        boolean encontrou = false;

        for (Curso curso : cursos) {
            if (curso.getIdCurso() == idCurso) {
                cursos.remove(curso);
                encontrou = true;
                break;
            }
        }

        if (!encontrou)
            System.out.println("ID do curso informado não existe.");
        else
            System.out.println("Exclusão do curso com ID " + idCurso + " realizada com sucesso!");
    }

    public static void main(String[] args) {
        SiscapacitApp sistema = new SiscapacitApp();
        /*
         * sistema.adicionarServiodresPublicos();
         * sistema.adicionarServiodresPublicos();
         * System.out.println("02 Servidores:");
         * sistema.listarServidoresPublicos();
         * // sistema.listarServidorPublico(1);
         * // sistema.listarServidorPublico(4);
         * // sistema.excluirServidorPublico(4);
         * ServidorPublico servidorAlterado = new ServidorPublico(4,
         * "Patrick A. Prestes", "RFB", "Auditor", "Brasília",
         * "patrick.a.prestes@rfb.gov.br", 30000);
         * sistema.alterarServidor(servidorAlterado);
         * System.out.println("02 Servidores:");
         * sistema.listarServidoresPublicos();
         * sistema.calcularFolhaServidoresPublicos();
         */

        sistema.adicionarCurso();
        sistema.adicionarCurso();
        System.out.println("02 Cursos:");
        sistema.listarCursos();
        sistema.listarCurso(1);
        Curso cursoAlterado = new Curso(0, null, null, null, 0);
        cursoAlterado.setIdCurso(1);
        cursoAlterado.setNome("Curso de Java Avançado");
        cursoAlterado.setFormaRealizacao("Online");
        cursoAlterado.setOfertante("ABC Treinamentos");
        cursoAlterado.setValor(500.00);
        sistema.alterarCurso(cursoAlterado);
        System.out.println("Após alteração, 02 Cursos:");
        sistema.listarCursos();
        sistema.excluirCurso(1);
        System.out.println("Após exclusão, 01 Curso:");
        sistema.listarCursos();
    }
}
