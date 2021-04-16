import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); 

        int qtde = 0;
        double numero;
        double soma = 0;
        double media;

        for (int contador=1; contador <=6; contador = contador + 1){ 
            numero = teclado.nextDouble();
            if (numero > 0){
                qtde = qtde +1;
                soma = soma + numero;
            }
        }
        media = soma / qtde;
        System.out.println(qtde+ "valores positivos");
        System.out.printf ("%.1f\n", media);
    }
}