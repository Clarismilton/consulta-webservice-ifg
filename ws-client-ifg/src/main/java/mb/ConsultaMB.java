package mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import bean.Disciplina;
import controle.ws.CursoWS;

@ManagedBean(name= "ConsultaMB")
public class ConsultaMB {
	
	private List<Disciplina> list = new ArrayList<Disciplina>();
	private CursoWS controle = new CursoWS();
	private String codigo;
	
	public void init() {
		this.list = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getList() {
		return list;
	}

	public void setList(List<Disciplina> list) {
		this.list = list;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
		
	}

	public void consulta() {
		this.list = controle.buscarWs(this.codigo);
		for (Disciplina disciplina : list ) {
			System.out.println(disciplina.getNome());
		}	
	}

}
