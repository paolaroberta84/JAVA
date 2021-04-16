import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); 

        int entrada = teclado.nextInt();

        int Valor = 0;
        
        while (Valor < 6) {
            if ( entrada % 2 == 1){
                System.out.println(entrada);
                Valor++;
            }
                entrada++;
        }    
    }
}