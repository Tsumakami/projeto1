/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
    private String  nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if("".equals(nome)){
            System.out.println("Nome Invalido");
            return false;
        }
        this.nome = nome;
        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean setTelefone(String telefone) {
        if("".equals(telefone)){
            System.out.println("Telefone Invalido");
            return false;
        }
        this.telefone = telefone;
        return true;
    }
   
    public void lerDados(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nome: ");
        }while(!setNome(sc.nextLine()));
        do{
            System.out.print("Telefone: ");   
        }while(!setTelefone(sc.nextLine()));
        
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + this.getNome() + "\n" +
                           "Telefone: " + this.getTelefone() + "\n");
    }
    
}
