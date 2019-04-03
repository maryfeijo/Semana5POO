
public class Aluno extends Pessoa {

	private String curso;
	private int mat;
	
public void cancelarMatricula() //metodo para cancelar matricula
{
	System.out.println("Log - Matricula Cancelada!!!");
}

public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}

@Override
public String toString() {
	return "Aluno [curso=" + curso + ", mat=" + mat + ", toString()=" + super.toString() + "]";
}



}

