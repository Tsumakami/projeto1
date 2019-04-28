package projeto1;

import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno {
    private String graduacao;
    private String instituicao;
    private String ano_inicio;
    private String ano_conclusao;
    private Curso curso;
    
    
    public String getGraduacao() {
        return this.graduacao;
    }

    public boolean setGraduacao(String graduacao) {
        if("".equals(graduacao)){
            System.out.println("Graduacao Invalida");
            return false;
        }
        this.graduacao = graduacao;
        return true;
    }
    
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
    
    public String getAno_inicio() {
        return this.ano_inicio;
    }

    public boolean setAno_inicio(String ano_inicio) {
        if("".equals(ano_inicio)){
            System.out.println("Ano Invalido");
            return false;
        }
        this.ano_inicio = ano_inicio;
        return true;
    }
    
    public String getAno_conclusao() {
        return this.ano_conclusao;
    }

    public boolean setAno_conclusao(String ano_conclusao) {
        if("".equals(ano_conclusao)){
            System.out.println("Ano Invalido");
            return false;
        }
        this.ano_conclusao = ano_conclusao;
        return true;
    }

    public Curso getCurso() {
        return curso;
    }

    public boolean setCurso(Curso curso) {
        if(curso == null){
            System.out.println("Curso Invalido");
            return false;
        }
        this.curso = curso;
        return true;
    
    }
    
    
    
    public void lerDados(){
        super.lerDados();
        
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Graduação: ");
        }while(!setGraduacao(entrada.nextLine()));
        do{
            System.out.print("Instituição: ");
        }while(!setInstituicao(entrada.nextLine()));
        do{
            System.out.print("Ano de inicio: ");
        }while(!setAno_inicio(entrada.next()));
        do{
            System.out.print("Ano de Conclusao: ");
        }while(!setAno_conclusao(entrada.next()));
        Curso c = null;
        do{
            System.out.print("Curso --> ");
            c = new Curso();
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
        
        System.out.println("Graduacao: " + getGraduacao() + "\n" +
                            "Instituicao: " + getInstituicao() + "\n" + 
                            "Ano de Inicio: " + getAno_inicio() + "\n" + 
                            "Ano de Conclusao: " + getAno_conclusao() + "\n" +
                            "Curso: " + getCurso()+ "\n"
                            );
    }
     
    
}
