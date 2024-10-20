import java.util.Scanner;
public class Arrays_Ex4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor_a = new int[5];
        int[] vetor_b = new int[5];

        System.out.println("Digite 5 números: ");
        for(int i = 0; i < vetor_a.length; i++){
            vetor_a[i] = sc.nextInt();
        }
        System.out.println("Multiplicados por 3: ");
        for (int i = 0; i < 5; i++) {
            vetor_b[i] = vetor_a[i] * 3;    
            System.out.println(vetor_b[i]);
        }
        
    }
}