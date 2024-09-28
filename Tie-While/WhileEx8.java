import java.util.Scanner;
public class WhileEx8{

//Crie um algoritmo que leia duas notas de 5 alunos
//Mostre a média de cada um deles
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		double media = 0;
		double nota = 0;
		double nota1 = 0;

		do{
		System.out.println("Digite duas notas de 5 alunos: ");
			nota = sc.nextDouble();
			nota1 = sc.nextDouble();			
                if (nota <= 0 || nota > 10 && nota1 <= 0 || nota1 > 10){
			        System.out.println("Nota inválida");
		    }
		    media = (nota + nota1) / 2;
		    System.out.println("Média desse aluno: " + media);
		i++;
		}
		while(i <= 5);
	}
}
