
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Aluno aluno = new Aluno();
		aluno.setNome("Maryana");
		aluno.setSexo("F");
		aluno.setIdade(31);
		aluno.setCurso("SI");
		aluno.setMat(005);
		
		System.out.println(aluno.toString()); //apos criar em Pessoa o toString, chamei aqui.
		aluno.cancelarMatricula();
		
		Professor prof = new Professor();
		prof.setNome("Prof Alex");
		prof.setSal(5000);
		prof.setEspec("POO");
		
		System.out.println(prof.toString()); //apos criar em Professor o toString, chamei aqui.
		prof.receberAumento(500f);
		System.out.println(prof.toString());
		
		
		Funcionario func = new Funcionario();
		func.setNome("Mario Joao");
		System.out.println(func.toString()); //Apos criar em Funcionario o toString, chamei aqui.
		func.setSetor("TI");
		func.mudarTrab(); //vai aparecer como trab = false pq inseri no programa que inicia com true.
		System.out.println(func.toString());
	}
	
}
