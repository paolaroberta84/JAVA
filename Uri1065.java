import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); 

        int qtde = 0;
        int numero;
        

        for (int contador=0; contador < 5; contador++){ 
            numero = teclado.nextInt();
            if (numero % 2 == 0) qtde++;
        }
        System.out.println(qtde + " valores pares");
    }
}