package dev.camila.escola.entities;

import java.time.LocalDate;

public class Professor extends Pessoa {

	private String cnpj;

	public Professor() {
	}

	public Professor(String nome, LocalDate dataDeNascimento, String cnpj) {
		super(nome, dataDeNascimento);
		this.cnpj = cnpj;
	}

	public Professor(Long id, String nome, LocalDate dataNascimento, String cnpj) {
		super(id, nome, dataNascimento);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Professor other = (Professor) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}
	
	

}
