
public class Professor extends Pessoa {
	
	private String espec;
	private float sal;
	
	public void receberAumento(float valor)
	{
		this.sal+=valor; //acrescentei um valor ao salario
	}
	
	public String getEspec() {
		return espec;
	}
	public void setEspec(String espec) {
		this.espec = espec;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Professor [espec=" + espec + ", sal=" + sal + ", toString()=" + super.toString() + "]";
	}
	
	

}
