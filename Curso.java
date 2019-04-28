package projeto1;

import java.util.Scanner;


public abstract class Curso {
  
    String codigo;
    String nomeCurso;
    String duracao;

    public String getCodigo() {
        return this.codigo;
    }

    public boolean setCodigo(String codigo) {
         if("".equals(codigo)){
            System.out.println("Codigo Invalido");
            return false;
        }
        this.codigo = codigo;
        return true;
        
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public boolean setNomeCurso(String nome) {
        if("".equals(nome)){
            System.out.println("Nome Invalido");
            return false;
        }
        this.nomeCurso = nome;
        return true;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public boolean setDuracao(String duracao) {
        if("".equals(duracao)){
            System.out.println("Duração Invalida");
            return false;
        }
        this.duracao = duracao;
        return true;
    }
    
    
    
    void lerDados(){
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Nome: ");
        }while(!setNomeCurso(entrada.nextLine()));
        do{
            System.out.print("Código do Curso: ");
        }while(!setCodigo(entrada.next()));
        do{
            System.out.print("Duração do curso: ");
        }while(!setDuracao(entrada.next()));
              
    }
    
    void mostrarDados(){
        System.out.println("Nome do curso: " + this.getNomeCurso() + "\n" +
                            "Codigo do Curso: " + this.getCodigo() + "\n"+
                            "Duração do Curso: " + this.getDuracao());
    }
}
