import java.util.Scanner;

public class TesterAluno {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a matricula do aluno: ");
		String matricula = input.nextLine();
		System.out.print("Digite o nome do aluno: ");
		String nome = input.nextLine();
		System.out.print("Digite o curso do aluno: ");
		String curso = input.nextLine();
		
		
		Aluno aluno = new Aluno(matricula,nome,curso);
		
		aluno.listar();
	}
	
}
