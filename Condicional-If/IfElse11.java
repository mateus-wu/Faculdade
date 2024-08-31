import java.util.Scanner;
public class IfElse11{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade do nadador: ");
        int idade = sc.nextInt();

        if(idade >= 5 &&  idade <= 7){
            System.out.println("Categoria: infantilA");
        }
        else if(idade >= 8 &&  idade <= 10){
            System.out.println("Categoria: infantilB");
        }
        else if(idade >= 11 &&  idade <= 13){
            System.out.println("Categoria: juvenilA");
        }
        else if(idade >= 14 &&  idade <= 17){
            System.out.println("Categoria: juvenilB");
        }
        else if(idade >= 18){
            System.out.println("Categoria: Senior");
        }
    }
}