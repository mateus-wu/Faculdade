
import java.util.Scanner;
public class Method_Ex5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7");
		int numero = sc.nextInt();
		
		exibirDiaSemana(numero);
	}
	public static void exibirDiaSemana(int numero){
	    switch(numero){
	            case 1:
	       System.out.println("Domingo");
	    break;
	            case 2:
	       System.out.println("Segunda");
	    break;
	    	    case 3:
	       System.out.println("Terça");
	    break;
	    	    case 4:
	       System.out.println("Quarta");
	    break;
	    	    case 5:
	       System.out.println("Quinta");
	    break;
	    	    case 6:
	       System.out.println("Sexta");
	    break;
	    	    case 7:
	       System.out.println("Sábado");
	    break;
	    
	    default:
	    System.out.println("Dia da semana inválido");
		}
	}
}