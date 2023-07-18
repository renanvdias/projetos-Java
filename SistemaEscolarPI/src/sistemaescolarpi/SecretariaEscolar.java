package sistemaescolarpi;

import java.util.ArrayList;
import java.util.List;

public class SecretariaEscolar {
    private List<Aluno> alunos;
    private List<Professor> professores;

    public SecretariaEscolar() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarProf(Professor professor) {
        professores.add(professor);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public List<Professor> listarProf() {
        return professores;
    }
}
