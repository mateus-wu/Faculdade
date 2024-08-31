import java.util.Scanner;
public class IfElse9{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o salario bruto: ");
        double salario = sc.nextDouble();

        System.out.println("Insira o valor da prestacao: ");
        double prestacao = sc.nextDouble();
        
        if(prestacao >= salario * 0.30){
            System.out.println("Emprestimo nao pode ser concedido!");
        }
        else{
            System.out.println("Emprestimo pode ser concedido!");
        }
    }
}