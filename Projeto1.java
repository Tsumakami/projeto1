/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

/**
 *
 * @author joao
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlunoPosGraduacao au1 = new AlunoPosGraduacao();
        Professor p1 = new Professor();
        Curso c1 = new Curso();
        Disciplina d1 = new Disciplina();
        Aluno a1 = new Aluno();
        
        System.out.println("----------------------- CADASTROS -----------------------------");
        
//        System.out.println("Cadastro Aluno de Pós-graduação");
//        au1.lerDados();
        System.out.println("Cadastro de Professor");
        p1.lerDados();
//        System.out.println("Cadastro de Curso");
//        c1.lerDados();
//        System.out.println("Cadastro de Disciplina"); 
//        d1.lerDados();
//        System.out.println("cadastro de Aluno");
//        a1.lerDados();
        
        System.out.println("----------------------- MOSTRANDO DADOS -----------------------");
               
//        c1.mostrarDados();
//        d1.mostrarDados();
//        a1.mostrarDados();
//        au1.mostrarDados();
          p1.mostrarDados();
    }
    
}
