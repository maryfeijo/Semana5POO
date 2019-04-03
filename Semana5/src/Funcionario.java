
public class Funcionario extends Pessoa {

	private String setor;
	private boolean trab;
	
	public Funcionario() //toda vez que eu instanciar a classe, entenderá como verdadeiro. Metodo construtor.
						//esse metodo nao precisa ser chamado, pois é construtor.
	{
		this.trab = true;
	}
	
	public void mudarTrab() //aqui eu mudo a flag de trabalhando para nao trabalhando
	{
		this.trab = !this.trab;
	}
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", trab=" + trab + ", toString()=" + super.toString() + "]";
	}
	
	}
