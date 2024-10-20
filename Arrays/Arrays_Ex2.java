
import java.util.Scanner;

public class Arrays_Ex2{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Pares: ");
            for(int i = 0; i < 10; i++){
                if(numeros[i] % 2 == 0){
                    System.out.println(numeros[i]);
            }
        }
        System.out.println("Impares: ");
            for(int i = 0; i < 10; i++){
                if(numeros[i] % 2 != 0){
                    System.out.println(numeros[i]);
         }
        }
    }
}