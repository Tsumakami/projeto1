/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;

/**
 *
 * @author joao
 */
public class TecnicoAdministrativo extends Funcionarios {
    private String valorHoraExtra;
    private String quantidadeHoraExtra;

    public String getValorHoraExtra() {
        return valorHoraExtra;
    }

    public boolean setValorHoraExtra(String valorHoraExtra) {
        if (valorHoraExtra == null) {
            System.out.println("Valor da hora extra Inválida");
            return false;
        } else {
            this.valorHoraExtra = valorHoraExtra;
            return true;
        }  
        
    }

    public String getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }

    public boolean setQuantidadeHoraExtra(String quantidadeHoraExtra) {
        if (quantidadeHoraExtra == null) {
            System.out.println("Quantidade de horas extra Inválida");
            return false;
        } else {
            this.quantidadeHoraExtra = quantidadeHoraExtra;
            return true;
        }
        
    }
    
    @Override
    public double calcularSalario() {
        double salari = Double.parseDouble(this.getSalario());
        double valorHora = Double.parseDouble(this.getValorHoraExtra());
        int qHoras = Integer.parseInt(this.getQuantidadeHoraExtra());
        
        double s = salari + (valorHora * qHoras);
        return s;
    }
    
    @Override
    public void lerDados() {
        super.lerDados();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Valor da Hora Extra: ");
        } while (!setValorHoraExtra(sc.next()));

        do {
            System.out.print("Quantidade de Horas Extra: ");
        } while (!setQuantidadeHoraExtra(sc.next()));
        
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Valor da Hora Extra: " + getValorHoraExtra() + "\n" 
            + "Horas Extra: " + getQuantidadeHoraExtra() + "\n");
                
    }
    
}
