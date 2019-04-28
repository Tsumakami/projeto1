package projeto1;

import java.util.Scanner;

public class Professor extends Funcionarios {

    private String titulacao;
    private String areaPesquisa;
    private Disciplina[] disciplina;
    private String numeroHorasAula;
    private String valorHoraAula;

    public String getNumeroHorasAula() {
        return numeroHorasAula;
    }

    public boolean setNumeroHorasAula(String numeroHorasAula) {
        if (numeroHorasAula == null) {
            System.out.println("Horas Aula Inválida");
            return false;
        } else {
            this.numeroHorasAula = numeroHorasAula;
            return true;
        }  
        
    }

    public String getValorHoraAula() {
        return valorHoraAula;
    }

    public boolean setValorHoraAula(String valorHoraAula) {
         if (valorHoraAula == null) {
            System.out.println("Valor Horas Inválida");
            return false;
        } else {
            this.valorHoraAula = valorHoraAula;
            return true;
        }  
        
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public boolean setDisciplina(Disciplina[] disciplina) {
         if (disciplina == null) {
            System.out.println("Disciplina Inválida");
            return false;
        } else {
            this.disciplina = disciplina;
            return true;
        }  
        
    }

    
    public String getTitulacao() {
        return titulacao;
    }

    public boolean setTitulacao(String titulacao) {
        if ("".equals(titulacao)) {
            System.out.println("Titulacao Inválida");
            return false;
        } else {
            this.titulacao = titulacao;
            return true;
        }

    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public boolean setAreaPesquisa(String areaPesquisa) {
        if ("".equals(areaPesquisa)) {
            System.out.println("Area de Pesquisa Inválida");
            return false;
        } else {
            this.areaPesquisa = areaPesquisa;
            return true;
        }

    }

    public void lerDados() {
        super.lerDados();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Area de Pesquisa: ");
        } while (!setAreaPesquisa(sc.next()));

        do {
            System.out.print("Titulacao: ");
        } while (!setTitulacao(sc.next()));
        System.out.print("Informe o numero de disciplinas: ");
        String q = sc.next();
        int n = Integer.parseInt(q);
        Disciplina[] lista = new Disciplina[n];
        for(int i = 0; i < n; i++){
            Disciplina disci = new Disciplina();
            disci.lerDados();
            lista[i] = disci;
        }
        setDisciplina(lista);
        do{
            System.out.println("Hora de aula: ");
        }while(!setNumeroHorasAula(sc.next()));
        do {
            System.out.println("Valor da Hora: ");
        }while(!setValorHoraAula(sc.next()));
    }

    public void mostrarDados() {
        super.mostrarDados();
                System.out.println("Titulacao: " + getTitulacao() + "\n" 
                + "Area de Pesquisa: " + getAreaPesquisa() + "\n");
                
    }

    @Override
    public double calcularSalario() {
        double horas = Double.parseDouble(this.getNumeroHorasAula());
        double valor = Double.parseDouble(this.getValorHoraAula());
        
        return horas * valor;
    }

}
