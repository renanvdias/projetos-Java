package sistemaescolarpi;

public class Nota {
    private double valor;
    private Disciplina disciplina;
    private Aluno aluno;

    public Nota(double valor, Disciplina disciplina, Aluno aluno) {
        this.valor = valor;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}

