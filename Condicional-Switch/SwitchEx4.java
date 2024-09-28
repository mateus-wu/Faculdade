import java.util.Scanner;
public class SwitchEx4{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite o plano de trabalho (A, B ou C): ");
            String plano = sc.next();

        System.out.println("Digite o salario de um funcionario: ");
            double salario = sc.nextDouble();

        switch(plano){
            case "A":
                double aumento = salario + (salario * 0.10);
                System.out.println("Novo salario: " + aumento);
                break;
             case "B":
                aumento = salario + (salario * 0.15);
                System.out.println("Novo salario: " + aumento);
                break;
             case "C":
                aumento = salario + (salario * 0.20);
                System.out.println("Novo salario: " + aumento);
                break;
            default:
                System.out.println("Digite entre as três opcoes");
        }
    }
}