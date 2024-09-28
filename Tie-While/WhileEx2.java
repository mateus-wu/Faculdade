import java.util.Scanner;
public class WhileEx2{
    //Escreva um algoritmo que leia 10 numeros inteiros e diga
    //quantos sao pares e quantos impares
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int cont = 1;

        while(cont <= 10){
            System.out.println("Digite um numero: ");
            int number = sc.nextInt();

            if(number % 2 == 0){
                par++;
            }else{
                impar++;
            }
            cont++;
        }
        System.out.println("O total de Numeros pares é: " + par);
        System.out.println("O total de Numeros impares é: " + impar);
        sc.close();
    }
}