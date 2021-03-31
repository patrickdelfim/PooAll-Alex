
public class Aluno {

	private String matricula;
	private String nome;
	private String curso;
	
	
	
	public Aluno(String matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		if(curso.equalsIgnoreCase("si")) {
			this.curso = "Sistema da informacao" ;
		}else {
		this.curso = curso;}
		
	}
	
	public void listar() {
		
		System.out.printf("\n Aluno: %s, matricula: %s, curso: %s",nome,matricula,curso);
		
	}
	
	
	
	
}
