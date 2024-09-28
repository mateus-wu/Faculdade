import java.util.Scanner;
public class WhileEx6 {
    //Escreva um algoritmo que leia 10 numeros inteiros e positivos e mostre o menor
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int i = 1;
        do{
            System.out.println("Digite um numero: ");
            int number = sc.nextInt();
            if(number < 0){
                break;
            }
            i++;    

            if(number < menor){
                menor = number;
            }
            //Se o numero digitado for menor que o maior valor, o menor valor passa a ser o numero digitado
        } while(i <= 10);
        System.out.println("Menor: " + menor);
        sc.close(); 
    }
}