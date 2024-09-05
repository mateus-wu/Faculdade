import java.util.Scanner;
public class WhileDo {
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        double media = 0;
        double nota = 0;
        double contador = 0;

        while(contador < 5){
            System.out.println("Digite a nota de um aluno: ");
            nota = sc.nextDouble();
            media += nota;
            contador++;
        }
            System.out.println("Media dos cinco alunos: " + media / 5);
            sc.close();
        }
 }

