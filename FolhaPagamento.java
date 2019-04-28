/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.List;

/**
 *
 * @author porti
 */
public class FolhaPagamento {
     
    
    public static void folhaPagamento (List<Funcionarios> funcionario){
        double totalFolha = 0;
        for(int i=0; i<funcionario.size(); i++){
            
            totalFolha = totalFolha + (funcionario.get(i).calcularSalario());
            System.out.println("");
            System.out.println("Nome: " + funcionario.get(i).getNome());
            System.out.println("Classe: " + funcionario.get(i).getClass());
            System.out.printf("Salario: %.2f \n", funcionario.get(i).calcularSalario());
        }
            System.out.println("");
            System.out.printf("Total da folha de pagamento: %.2f \n", totalFolha);
            System.out.printf("Total de Encargos: %.2f \n", totalEncargos(totalFolha));
            
     
     }   
     public static double totalEncargos(double totalFolha) {
         double encargoFGTS = (totalFolha * 8) / 100;
         double encargoINSS = (totalFolha * 8) / 100;
         double totalEncargos = encargoFGTS + encargoINSS ;
         return totalEncargos;
     }
     
  
    public double calculaIRRF(Funcionarios f){
        double irrf = 0;
        if(f.calcularSalario() <= 1903.98){
            return irrf;
        }else if(f.calcularSalario() <= 2826.65){
            irrf = (f.calcularSalario() * 7.5) / 100;
            return irrf;
        }else if(f.calcularSalario() <= 3751.05){
            irrf = (f.calcularSalario() * 15) / 100;
            return irrf;
        }else if(f.calcularSalario() <= 4664.68){
            irrf = (f.calcularSalario() * 22.5) / 100;
            return irrf;
        }else{
            irrf = (f.calcularSalario() * 27.5) / 100;
            return irrf;
        }
    }
}

