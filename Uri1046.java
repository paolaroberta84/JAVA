import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Horai, Horaf;

        Horai = teclado.nextInt();
        Horaf = teclado.nextInt();

        if ( Horai == Horaf)
        System.out.printf("O Jogo durou 24 Horas");
    }
}