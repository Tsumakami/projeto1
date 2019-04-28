package projeto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Funcionarios extends Pessoa{
    private String endereco;
    private String CPF;
    private String numeroCTPS;
    private String salario;

    public String getEndereco() {
        return this.endereco;
    }

    public boolean setEndereco(String endereco) {
        if("".equals(endereco)){
            System.out.println("Endereço Invalido");
            return false;
        }
        this.endereco = endereco;
        return true;
        
    }

    
    public String getCPF() {
        return this.CPF;
    }

    public boolean setCPF(String CPF) {
         if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11)){
             System.out.println("CPF Invalido");
             return(false);
         }
                       
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0         
        // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
          
        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
          
        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))){
               return(true); 
            }else{
                System.out.println("CPF Invalido");
                return(false);
            }
                } catch (InputMismatchException erro) {
                System.out.println("CPF Invalido");    
                return(false);
            }
        }

    public String getNumeroCTPS() {
        return this.numeroCTPS;
    }

    public boolean setNumeroCTPS(String numeroCTPS) {
        if("".equals(numeroCTPS)){
            System.out.println("CTPS Invalido");
            return false;
        }
        this.numeroCTPS = numeroCTPS;
        return true;
        
    }

    public String getSalario() {
        return this.salario;
    }

    public boolean setSalario(String salario) {
        if("".equals(salario)){
            System.out.println("Salario Invalido");
            return false;
        }
        this.salario = salario;
        return true;
    }
    
    public abstract double calcularSalario();   
    
    
    @Override
    public void lerDados(){
        super.lerDados();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Endereco: ");  
        }while(!setEndereco(sc.nextLine()));
        do{
            System.out.print("CPF: ");   
        }while(!setCPF(sc.nextLine()));
        do{
          System.out.print("Numero CTPS: ");  
        }while(!setNumeroCTPS(sc.nextLine()));
        do{
          System.out.print("Salario: "); 
        }while(!setSalario(sc.next()));
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Endereco: " + this.getEndereco() + "\n" +
                           "CPF: " + this.getCPF() + "\n" +
                           "Numero CTPS: "+ this.getNumeroCTPS() + "\n" +
                           "Salario: R$ " + this.calcularSalario() + "\n");
    }
    
    
}
