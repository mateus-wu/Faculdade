import java.util.Scanner;
public class IfElse1{
    public static void main(String []args){

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 20){
            int calc = number / 2;
            System.out.println("A metade desse número é: " + calc);
        }
    }
}