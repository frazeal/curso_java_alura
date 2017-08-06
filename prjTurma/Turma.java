public class Turma {
    Aluno[] alunos;

    void imprimirNotas() {
	for(int i = 0; i < this.alunos.length; i++) {
	    if (alunos[i] != null) {
		System.out.println(this.alunos[i].nota);
	    } else {
		continue;
	    }
	}
    }
}
