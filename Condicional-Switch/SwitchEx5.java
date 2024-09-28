import java.util.Scanner;
public class SwitchEx5{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("Opcoes: M = calcula a media dos dois numeros");
        System.out.println("        S = calcula a diferenca do maior pelo menor");
        System.out.println("        P = produto entre os numeros");
        System.out.println("        D = divisao do primeiro pelo segundo");
        
        String option = sc.next();
        double diferenca;

        switch(option){
            case "M":
                double media = (n1 + n2) / 2;
                System.out.println("Resultado: " +  media);
                break;
            case "S":
                if(n1 > n2){
                   diferenca = n1 - n2;
                   System.out.println("Resultado: " + diferenca);
                }
                else{
                    diferenca = n2 - n1;
                    System.out.println("Resultado: " + diferenca);
                }
                break;
            case "P":
                
        }
    }
}