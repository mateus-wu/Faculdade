import java.util.Scanner;
public class IfElse7{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Quantos anos está na empresa? ");
        int anos = sc.nextInt();

        if (anos >= 5){
            double bonus = 0.20 * salario;
            System.out.println("Seu bonus sera de: " +  bonus);
        }
        else{
            double bonus = 0.10 * salario;
            System.out.println("Seu bonus sera de: " +  bonus);
        }
        
    }
}