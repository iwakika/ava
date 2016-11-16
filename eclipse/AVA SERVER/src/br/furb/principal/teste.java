package br.furb.principal;
import java.util.ArrayList;
import java.util.List;

import br.furb.conection.DatabaseConection;
import br.furb.control.DisciplinaControl;
import br.furb.control.PessoaControl;
import br.furb.model.Disciplina;
import br.furb.model.Pessoa;

public class teste {

	public static void main(String[] args) {
		PessoaControl pessoaControl = new PessoaControl();
		Pessoa p = new Pessoa();
		p.setNome("Guilherme");
		p.setSobrenome("Ramos");
		p.setEmail("ghr.ramos@gmail.com");
		p.setFacebook("ghr");
		p.setSkype("ghr");
		p.setTwitter("ghr");
		p.setHomepage("ghr");

		 pessoaControl.inserir(p);

		DisciplinaControl disciplinaControl = new DisciplinaControl();
		Disciplina dc1 = new Disciplina();
		dc1.setCurso("BCC");
		dc1.setDescricao("Desenvolvimento para Web");
		dc1.setNome("CMP.103.0.1");
		dc1.setProfessor("Luciana");
		Disciplina dc2 = new Disciplina();
		dc2.setCurso("BCC");
		dc2.setDescricao("Linguagens de Programação");
		dc2.setNome("CMP.93.0.1");
		dc2.setProfessor("Luciana");
		Disciplina dc3 = new Disciplina();
		dc3.setCurso("BCC");
		dc3.setDescricao("Processo de Software II");
		dc3.setNome("SIS.82.2.1");
		dc3.setProfessor("Luciana");
		Disciplina dc4 = new Disciplina();
		dc4.setCurso("BCC");
		dc4.setDescricao("Teoria dos Grafos");
		dc4.setNome("CMP.151.0.3");
		dc4.setProfessor("Luciana");

		disciplinaControl.inserir(dc1);
		disciplinaControl.inserir(dc2);
		disciplinaControl.inserir(dc3);
		disciplinaControl.inserir(dc4);

		List<Disciplina> dcs = new ArrayList<Disciplina>();
		dcs.add(dc1);
		dcs.add(dc2);
		dcs.add(dc3);
		dcs.add(dc4);

		p.setDisciplinas(dcs);

		// pessoaControl.alterar(p);

	}

}
