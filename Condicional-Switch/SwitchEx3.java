import java.util.Scanner;
public class SwitchEx3{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o periodo que estuda: M, V ou N");
    String periodo = sc.next();

        switch(periodo){
            case "M":
                System.out.println("Bom dia");
                break;
            case "V":
                System.out.println("Boa tarde");
                break;
            case "N":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Incorreto!");
        }
            sc.close();
    }
}