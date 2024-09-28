public class WhileEx4{

//Escreva um algoritmo que imprima a metade de cada numero de 10 a 20
    public static void main(String []args){
        
        double half = 0;
        double numbers = 10;
        int i = 0;
        do{
            half = numbers / 2;
            i++;
            numbers++;
            System.out.println(half);
        }while(i <= 10);
        
     }
}
