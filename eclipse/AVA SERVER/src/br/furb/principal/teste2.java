package br.furb.principal;
import java.util.List;

import br.furb.control.DisciplinaControl;
import br.furb.control.PessoaControl;
import br.furb.model.Disciplina;
import br.furb.model.Pessoa;

public class teste2 {
	public static void main(String[] args) {
		PessoaControl pessoaControl = new PessoaControl();

		for (Pessoa p : pessoaControl.listarTodos()) {
			System.out.println(p.getNome());
		}

		DisciplinaControl disciplinaControl = new DisciplinaControl();

		for (Disciplina dc : disciplinaControl.listarTodos()) {
			System.out.println(dc.getDescricao());
		}
	}
}
