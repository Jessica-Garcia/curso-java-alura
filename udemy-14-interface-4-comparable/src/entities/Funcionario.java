package entities;

public class Funcionario implements Comparable<Funcionario> {

	private String name;
	private Double salary;
	
	public Funcionario(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//para ordenar por ordem decrescente � s� colocar um - na frente do salary por exemplo
	@Override
	public int compareTo(Funcionario other) {
		return salary.compareTo(other.getSalary());
	}
	
	
}
