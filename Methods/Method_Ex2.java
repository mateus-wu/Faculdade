import java.util.Scanner;
public class Method_Ex2{
    //Faca uma funcao chamada imprimeNovaMensagem que recebe um parametro diferente
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um parametro: ");
            String parametro = sc.next();
            imprimeNovaMensagem(parametro);

            System.out.println("Digite outro parametro: ");
            String parametro1 = sc.next();
            imprimeNovaMensagem(parametro1);

            System.out.println("Digite mais um parametro: ");
            String parametro2 = sc.next();
            imprimeNovaMensagem(parametro2);

    }
    public static void imprimeNovaMensagem(String parametro){
        System.out.println("Meu primeiro programa com funcoes e parametro: " + parametro);
    }
}