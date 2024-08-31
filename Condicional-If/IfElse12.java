import java.util.Scanner;
public class IfElse12{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salario: ");
        double salario = sc.nextDouble();
        double desconto;

        if(salario <= 600){
            System.out.println("Isento");
        }
        else if(salario > 600 && salario <= 1200){
            desconto = salario * 0.20;
            System.out.println("Desconto do INSS: "+ desconto);
        }
        else if(salario > 1200 && salario <= 2000){
            desconto = salario * 0.25;
            System.out.println("Desconto do INSS: "+ desconto);
        }
        else if(salario <= 2000){
            desconto = salario * 0.30;
            System.out.println("Desconto do INSS: "+ desconto);
        }
    }
}