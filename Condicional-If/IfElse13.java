import java.util.Scanner;
public class IfElse13{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora, digite a operacao (ex: 2 * 2)");
        int x = sc.nextInt();
        String op = sc.next();
        int z = sc.nextInt();
        int resultado;

        if(op.equals("+")){
            resultado = x + z;
            System.out.println("Soma: " + resultado);
        }
        else if(op.equals("-")){
            resultado = x - z;
            System.out.println("Subtracao: " + resultado);
        }
        else if(op.equals("*")){
            resultado = x * z;
            System.out.println("Multiplicacao: " + resultado);
        }
        else if(op.equals("/")){
            if(x <= z){
            System.out.println("Impossivel dividir");
            }
            resultado = x / z;
            System.out.println("Divisao: " + resultado);
        }
        else{
            System.out.println("Sinal invalido");
        }
   }
}