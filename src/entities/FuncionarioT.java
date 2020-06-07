package entities;

public class FuncionarioT extends Funcionario {

	private Double Tbonus;

	public FuncionarioT() {
		super();
	}
	
	public FuncionarioT(String nome, Integer horas, Double valorPorHoras, Double bonus) {
		super(nome, horas, valorPorHoras);
		this.Tbonus = bonus;
	}

	public Double getBonus() {
		return Tbonus;
	}

	public void setBonus(Double bonus) {
		this.Tbonus = bonus;
	}
	
	@Override
	public double pagamentos() {
		return super.pagamentos() +  Tbonus * 1.1;
	}
	
	
}
