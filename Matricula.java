package projeto1;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Disciplina disciplina;
    private Professor professor;

    Matricula(
            Aluno aluno,
            Curso curso,
            Disciplina disciplina,
            Professor professor
    ) {
        this.aluno = aluno;
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    
   void mostrarDados() {
        System.out.println("Aluno: " + this.getAluno() + "\n" +
                            "Curso: " + this.getCurso() + "\n"+
                            "Disciplina: " + this.getDisciplina() + "\n"+
                            "Professor: " + this.getProfessor());
    } 
   
}

