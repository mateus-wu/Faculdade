import java.util.Scanner;
public class Method_Ex4{
    //O metodo deve receber um numero e retornar verdadeiro
    //se for par e falso se for impar
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números inteiros quer verificar?: ");
        int i = sc.nextInt();
        int x;

        for(x = 0; x < i; x++){
            System.out.println("Digite o(s) número(s): ");
            int numero = sc.nextInt();
            isPar(numero);
        }
    }
    public static void isPar(int numero){
        if(numero % 2 == 0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número impar");
        }
    }
}