import java.util.Scanner;
public class Method_Ex3{

    public static void main(String [] args){
        //Crie um metodo que retorne o maior valor entre dois parametros

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
            int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
            int num2 = sc.nextInt();

        System.out.println("O maior numero entre eles é: ");
        encontrarMax(num1, num2);
    }
    public static void encontrarMax(int num1, int num2){
        if(num1 > num2){
            System.out.println("O primeiro número é maior: " + num1 + " > " + num2);
        }
        else{
            System.out.println("O segundo número é maior: " + num2 + " > " + num1);
        }
    }
}