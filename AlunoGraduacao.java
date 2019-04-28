/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;


public class AlunoGraduacao extends Aluno {
    private String instituicao;
    private CursoGraduacao curso;
    
    public String getInstituicao() {
        return this.instituicao;
    }

    public boolean setInstituicao(String instituicao) {
        if("".equals(instituicao)){
            System.out.println("Instituicao Invalida");
            return false;
        }
        this.instituicao = instituicao;
        return true;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public boolean setCurso(CursoGraduacao curso) {
        if(curso == null){
            System.out.println("Curso Invalido");
            return false;
        }
        this.curso = curso;
        return true;
    
    }
    
    @Override
    public void lerDados(){
        super.lerDados();
        
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Instituição: ");
        }while(!setInstituicao(entrada.nextLine()));
        CursoGraduacao c = null;
        do{
            System.out.print("Curso --> ");
            c = new CursoGraduacao();
            c.lerDados();
        }while(!setCurso(c));
                
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
       
        byte situacaoB = getSitucao();
        String situacaoS;
        byte matriculado = 1;
        byte trancado = 2;
        byte desligado = 3;
        if(matriculado == situacaoB){
           situacaoS = "Matriculado"; 
        }else if(trancado == situacaoB ){
            situacaoS = "Trancado";
        }else{
            situacaoS = "Desligado";
        }
        
        System.out.println("Instituicao: " + getInstituicao() + "\n" + 
                            "Curso: " + getCurso()+ "\n");
    }
}
