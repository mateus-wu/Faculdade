import java.util.Scanner;
public class WhileEx3{
    //construa um algoritmo que leia um numeor inteiro e imprima a sequencia
    //1, 2, 4, 8, ... 1024
    //enquanto o valor da sequencia for menor ou igual o numero lido
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i = i * 2;
        }
    sc.close();   
    }
}