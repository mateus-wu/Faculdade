import java.util.Scanner;
public class IfElse8{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a senha: ");
        String senha = sc.next();

        if(senha.equals("R10p5")){
            System.out.println("acesso concedido");
        }
        else{
            System.out.println("acesso negado");
        }
    }
}