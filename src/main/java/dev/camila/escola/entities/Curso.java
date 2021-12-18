package dev.camila.escola.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private Long id;
	private String titulo;
    private int cargaHoraria;
	private Professor professor;
	private BigDecimal valorHoraAula;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
		
	public Curso() {
	}

	public Curso(String titulo, int cargaHoraria, Professor professor, BigDecimal valorHoraAula) {
		this.titulo = titulo;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		this.valorHoraAula = valorHoraAula;
	}
	
	private Curso(Long id, String titulo, int cargaHoraria, Professor professor, BigDecimal valorHoraAula) {
		this.id = id;
		this.titulo = titulo;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		this.valorHoraAula = valorHoraAula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public BigDecimal getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(BigDecimal valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result + cargaHoraria;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((valorHoraAula == null) ? 0 : valorHoraAula.hashCode());
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
		Curso other = (Curso) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (cargaHoraria != other.cargaHoraria)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (valorHoraAula == null) {
			if (other.valorHoraAula != null)
				return false;
		} else if (!valorHoraAula.equals(other.valorHoraAula))
			return false;
		return true;
	}	
		
}
