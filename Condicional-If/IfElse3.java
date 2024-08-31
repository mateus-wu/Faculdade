import java.util.Scanner;
public class IfElse3{

    public static void main(String []args){

        System.out.println("Diga dois números: ");
        Scanner sc = new Scanner(System.in);

        int diferenca;
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 == number2){
            System.out.print("Números iguais");
        }
        else if (number1 - number2 > 0){
            diferenca = number1 - number2;
            System.out.println("A diferenca do maior para o menor é: " + diferenca);
        }            
        else{
            diferenca = number2 - number1;
            System.out.println("A diferenca do maior para o menor é: " +  diferenca);
        }
    }
}