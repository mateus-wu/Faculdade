import java.util.Scanner;
public class Method_Ex6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int [] vetor = new int[tamanho];
        int maior = 0;

        System.out.println("Digite os números: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        int maiorValor = encontrarMaior(vetor);
        System.out.println("O maior valor do vetor é: " + maiorValor);

        int menorValor = encontrarMenor(vetor);
        System.out.println("O menor valor do vetor é: " + menorValor);

        int mediaValor = media(maiorValor, menorValor);
        System.out.println("A média do maior e menor valor é: " + mediaValor);
    }
    //funcao a
    public static int encontrarMaior(int[] vetor){
        int maior = vetor[0];
        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
    //funcao b
    public static int encontrarMenor(int [] vetor){
        int menor = vetor[0];
        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }
    //funcao c
    public static int media(int maior, int menor){
        int media = maior + menor / 2;
        return media;
    }

}