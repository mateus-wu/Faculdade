public class WhileEx5 {
    //Escreva um algoritmo que imprima a tabuada do 5
    public static void main(String [] args){

        int result = 0;
        int numero = 5;
        int mult = 1;
        int i = 0;

        do { 
            result = numero * mult;
            System.out.println(numero + " x " + mult + " = " + result);
            mult++;
            i++;
        } while (i < 10);
    }
}