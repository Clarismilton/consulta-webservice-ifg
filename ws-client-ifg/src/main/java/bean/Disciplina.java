package bean;

public class Disciplina {

	private String codigo;
	private String nome;
	private String periodo;
	private Professor professores;
	private String matricula;
	private String cargaHoraria;

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		cargaHoraria = cargaHoraria.substring(0, cargaHoraria.length() - 2);
		this.cargaHoraria = cargaHoraria;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Professor getProfessores() {
		return professores;
	}

	public void setProfessores(Professor professores) {
		this.professores = professores;
	}

}
