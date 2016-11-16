package br.furb.view;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.furb.control.DisciplinaControl;
import br.furb.control.PessoaControl;
import br.furb.model.Disciplina;
import br.furb.model.Pessoa;

@Path("pessoas")
public class PessoasService {
	
	PessoaControl pessoaControl = new PessoaControl();
	DisciplinaControl disciplinaControl = new DisciplinaControl();

	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinaControl.listarTodos();
	}*/

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa getPessoa(@PathParam("id") int id) {
		return pessoaControl.buscar(id);
	}

	@Path("{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String setDadosPessoa(Pessoa p, @PathParam("id") int id) {

		if (pessoaControl.alterarDados(id, p.getEmail(), p.getFacebook(), p.getHomepage(), p.getSkype(),
				p.getTwitter()))
			return p.getNome() + " atualizada com sucesso.";

		return "Nao foi possível atualizar " + p.getNome() + ".";
	}
}
