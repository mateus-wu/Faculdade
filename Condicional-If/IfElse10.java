import java.util.Scanner;
public class IfElse10{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 numeros: ");
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if(number == number2 && number == number3 && number2 == number3){
            System.out.println("Os numeros sao iguais");
        }
        else if(number > number2 && number > number3){
                System.out.println("O maior numero é o: " + number);
        }
        else if(number3 > number2 && number3 > number){
                System.out.println("O maior numero é o: " + number3);
        }
        else if(number2 > number && number2 > number3){
                System.out.println("O maior numero é o: " + number2);
        }
    }
}