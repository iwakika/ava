package br.furb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "disciplinas")

public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "iddisciplina")
	private int id;

	@Column(name = "ds_nome")
	private String nome;

	@Column(name = "ds_descricao")
	private String descricao;

	@Column(name = "ds_curso")
	private String curso;

	@Column(name = "ds_professor")
	private String professor;

	@ManyToMany(mappedBy = "disciplinas")
	private List<Pessoa> pessoas;

	public Disciplina() {

	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCurso() {
		return curso;
	}

	public String getProfessor() {
		return professor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public void adicionarPessoa(Pessoa p) {
		pessoas.add(p);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
