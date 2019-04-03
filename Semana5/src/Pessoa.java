//clicar em cima da classe > source > generate getters and setters

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario()
	{
		this.idade++; //acrescentei um ano à idade
		System.out.println("Log - Nova idade = " + this.idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	//source > generate toString > Seleciona os metodos
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", toString()=" + super.toString()
				+ "]";
	}

}
