/*Leia 5 nomes de pessoas e armazene-os em um vetor.
(a) imprima os nomes do último para o primeiro.
(b) imprima o primeiro e o último nome armazenado */
import java.util.Scanner;
public class Arrays_Ex3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite 5 nomes: ");
            nomes[i] = sc.next();
        }
        for(int i = 4; i >= 0; i--){
            System.out.println(nomes[i]);
        }
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Último nome: " +  nomes[4]);
    }
}