package dev.camila.escola.entities;

import java.math.BigDecimal;

import dev.camila.escola.enums.Turno;

public class Matricula {
	
	private final Long id;
	private Turno turno;
	private final Aluno aluno;
	private final Curso curso;
	private BigDecimal valorMatricula;
	
	public Matricula(Long id, Turno turno, Aluno aluno, Curso curso) {
		this.id = id;
		this.turno = turno;
		this.aluno = aluno;
		this.curso = curso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public BigDecimal getValorCurso() {
		return valorMatricula;
	}

	public void setValorCurso(BigDecimal valorCurso) {
		this.valorMatricula = valorCurso;
	}

	public Long getId() {
		return id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		result = prime * result + ((valorMatricula == null) ? 0 : valorMatricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (turno != other.turno)
			return false;
		if (valorMatricula == null) {
			if (other.valorMatricula != null)
				return false;
		} else if (!valorMatricula.equals(other.valorMatricula))
			return false;
		return true;
	}
	
	
}
