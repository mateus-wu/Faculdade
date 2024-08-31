import java.util.Scanner;
public class IfElse2{

    public static void main(String [] args){
        
        System.out.println("Diga sua idade: ");
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}