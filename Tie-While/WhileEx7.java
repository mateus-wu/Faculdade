import java.util.Scanner;
public class WhileEx7{
    //Escreva um algoritmo que leia o peso e altura de 10 pessoas
    //Calcule o IMC e verifique quantas estao com o IMC entre 18,5 e 24,9 (considerado sem obesidade)
    public static void main(String [] args){ 

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int semobesidade = 0;
        do{
            System.out.println("Digite o peso: ");
                double peso = sc.nextDouble();
            System.out.println("Digite a altura: ");
                double altura = sc.nextDouble();

            double imc = peso / (altura * altura);

            if(imc >= 18.5 && imc <= 24.9){
                semobesidade++;
            }
            System.out.println(imc);
            i++;
        }   while(i <= 10);
        System.out.println("Há " + semobesidade + " pessoas com IMC entre 18,5 e 24,9");
        sc.close();
        
    }
}