package dev.camila.escola.entities;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	
	private String cpf;

	public Aluno() {
	}
	
	public Aluno(String nome, LocalDate dataDeNascimento, String cpf) {
		super(nome, dataDeNascimento);
		this.cpf = cpf;
	}
	
	public Aluno(Long id, String nome, LocalDate dataDeNascimento, String cpf) {
		super(id, nome, dataDeNascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
		
}
