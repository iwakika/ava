package br.furb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "pessoas")
@XmlRootElement
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private int idpessoa;

	@Column(name = "ds_nome")
	private String nome;

	@Column(name = "ds_sobrenome")
	private String sobrenome;

	@Column(name = "ds_login")
	private String login;

	@Column(name = "ds_senha")
	private String senha;

	@Column(name = "ds_skype")
	private String skype;

	@Column(name = "ds_twitter")
	private String twitter;

	@Column(name = "ds_facebook")
	private String facebook;

	@Column(name = "ds_email")
	private String email;

	@Column(name = "ds_homepage")
	private String homepage;

	@ManyToMany
	@JoinTable(name = "pessoa_has_disciplinas")
	private List<Disciplina> disciplinas;

	public Pessoa() {
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSkype() {
		return skype;
	}

	public String getTwitter() {
		return twitter;
	}

	public String getFacebook() {
		return facebook;
	}

	public int getIdpessoa() {
		return idpessoa;
	}

	public String getEmail() {
		return email;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
