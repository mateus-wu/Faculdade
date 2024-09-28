import java.util.Scanner;
public class SwitchEx1{
public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Incorreto. Digite de 1 a 7.");
        }
        sc.close();
    }
}