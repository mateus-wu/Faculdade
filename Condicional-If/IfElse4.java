import java.util.Scanner;
public class IfElse4{

    public static void main(String []args){

        System.out.println("Diga dois numeros: ");
        Scanner sc = new Scanner(System.in);

        float number1 = sc.nextFloat();
        float number2= sc.nextFloat();

            if (number1 > number2){
                System.out.println("Ordem decrescente: " + number1 + ", " + number2);
            }
            else if(number1 < number2){
                System.out.println("Ordem decrescente: " + number2 + ", " + number1);
            }
    }
}