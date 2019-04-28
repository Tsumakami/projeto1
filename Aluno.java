package projeto1;

import java.util.Scanner;


public class Aluno extends Pessoa{
    
    private String email;
    private int codigo_aluno;
    private byte situacao;
    
    
    public String getEmail() {
        return this.email;
    }

    public boolean setEmail(String email) {
        if("".equals(email)){
            System.out.println("Email Invalido");
            return false;
        }
        this.email = email;
        return true;
        
    }

    public int getCodigo_aluno() {
        return this.codigo_aluno;
    }

    public boolean setCodigo_aluno(int codigo_aluno) {
        if("".equals(codigo_aluno)){
            System.out.println("codigo do aluno Invalido");
            return false;
        }
        this.codigo_aluno = codigo_aluno;
        return true;
        
    }
    
    public byte getSitucao(){
        return this.situacao;
    }
    
    public boolean setSituacao(char situacaoC){
        if("".equals(situacaoC)){
            System.out.println("Situação invalido");
            return false;
        }else if('M'== situacaoC){
            this.situacao = 1;
            return true;
        }else if('T'== situacaoC){
            this.situacao = 2;
            return true;
        }else if('D' == situacaoC){
            this.situacao = 3;
            return true;
        }else{
            System.out.println("Situação invalido");
            return false;
        }
        
    }
    
    
    public void lerDados(){
        super.lerDados();
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Email: ");
        }while(!setEmail(entrada.next()));
        do{
            System.out.print("Código do Aluno: ");
        }while(!setCodigo_aluno(entrada.nextInt()));
        do{
            System.out.print("Situação: ");
        }while(!setSituacao(entrada.next().charAt(0)));
                
    }
    
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
        
        System.out.println("Email: " + getEmail() + "\n"+
                           "Codigo do Aluno: " + getCodigo_aluno() + "\n" +
                           "Situação: " + situacaoS + "\n");
    }
    
}
