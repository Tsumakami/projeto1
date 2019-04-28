package projeto1;

import java.util.Scanner;

public class Disciplina {
    private String codigo;
    private String nome;
    private String cargaHoraria;
    
    public String getCodigo() {
        return this.codigo;
    }

    public boolean setCodigo(String codigo) {
        if (codigo == null) {
            System.out.println("Codigo Inválido");
            return false;
        } else {
            this.codigo = codigo;
            return true;
        }
            
         
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if ("".equals(nome)) {
    	    System.out.println("Nome Invalido");
    	    return false;
         } else {
            this.nome = nome;
    	    return true;
         }
    }

    public String getCargaHoraria() {
        return this.cargaHoraria;
    }

    public boolean setCargaHoraria(String cargaHoraria) {
       if (cargaHoraria == null) {
            System.out.println("Carga Horaria Inválida");
            return false;
        } else {
            this.cargaHoraria = cargaHoraria;
            return true;
        }
                
    }
    
    public void lerDados() {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Codigo: ");
        } while (!setCodigo(sc.next()));
        
        do {
            System.out.print("Nome: ");
        } while (!setNome(sc.next()));
        
        do {
            System.out.print("Carga Horaria: ");
        } while (!setCargaHoraria(sc.next()));
    }

    public void mostrarDados() {

        System.out.println("Codigo: " + getCodigo() + "\n" +
                           "Nome: " + getNome() + "\n" +
                           "Carga Horaria: " + getCargaHoraria());
    }

}
