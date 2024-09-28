import java.util.Scanner;
public class WhileEx9 {

//Faça um algoritmo que leia o codigo, qnt e produto que o cliente quer comprar
//Perguntar se quer continuar comprando e calcule o total
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("______________________________________");
		System.out.println("Código  |  Produto         | Preço |  ");
		System.out.println(" 100    |  Cachorro Quente | 1,20  |  ");
		System.out.println(" 101    |  Bauru Simples   | 1,30  |  ");
		System.out.println(" 102    |  Bauru com Ovo   | 1,50  |  ");
		System.out.println(" 103    |  Hamburguer      | 1,20  |  ");
		System.out.println(" 104    |  Cheeseburger    | 1,30  |  ");
		System.out.println(" 105    |  Refrigerante    | 1,00  |  ");
		System.out.println("______________________________________");
		
		double total1 = 0;
		int continuar = 1;
		double total = 0;
	do{
	System.out.println("Digite o código do produto que deseja: ");
int escolha = sc.nextInt();
	System.out.println("Digite a quantidade que deseja: ");
int qnt = sc.nextInt();
		if (escolha == 100){
			total = 1.20 * qnt; }
		else if (escolha == 101){
			total = 1.30 * qnt;}
		else if (escolha == 102){
			total = 1.50 * qnt;}
		else if (escolha == 103){
			total = 1.20 * qnt; }
		else if (escolha == 104){
			total = 1.30 * qnt; }
		else if (escolha == 105){
			total = 1 * qnt; }
        else{
            System.out.println("Codigo invalido");	
        }
		System.out.println("Deseja continuar? (1/0)\n");
		continuar = sc.nextInt();
		
		total1 = total1 + total;
	}
	while(continuar == 1);
	System.out.println("Valor total: " + total1);
	}
}