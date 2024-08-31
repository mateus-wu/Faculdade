import java.util.Scanner;
public class IfElse6{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo de peso ideal");
        System.out.println("Diga sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Diga seu genero (M ou F): ");
        String gen = sc.next();
        double peso_ideal;

        if (gen.equals("M")){
            peso_ideal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f", peso_ideal);
        }
        else if (gen.equals("F")){
            peso_ideal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f", peso_ideal);
        }

    }
}