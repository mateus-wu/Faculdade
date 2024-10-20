import java.util.Scanner;
public class Method_Ex7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");

        double number = sc.nextDouble();
        double fatorial = calcularFatorial(number);
        System.out.println("O fatorial de " + number + " é: " + fatorial);
    }
    public static double calcularFatorial(double number){
        double fatorial = 1;
        for(double i = 1; i <= number; i++){
            fatorial *= i;
        }

        return fatorial;
    }
}
