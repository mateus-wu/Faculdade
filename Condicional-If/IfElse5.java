import java.util.Scanner;
public class IfElse5{

    public static void main(String []args){

        System.out.println("Diga um número: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number >= 50 && number <= 100){
            System.out.println("Pertence ao intervalo");
        }
        else{
            System.out.println("Não pertence ao intervalo");
        }
    }
}