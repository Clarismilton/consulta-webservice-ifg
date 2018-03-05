package util;

import java.util.List;

import bean.Disciplina;
import controle.ws.CursoWS;

public class Start {
	public static void main(String[] args) {
		CursoWS lws = new CursoWS();

		//lws.insert();
		List<Disciplina> l = lws.buscarWs("609");
		for (Disciplina disciplina : l) {
			System.out.println(disciplina.getNome());
		}
	}
}
