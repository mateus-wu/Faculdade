import java.util.Scanner;
public class Arrays_Ex1{
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o numero " +  (i+1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.println((i+1)+ "* " + "Numero: " + numeros[i]);
        }

    }
}