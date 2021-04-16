import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Segundos, horas, minutos, d;

        Segundos = teclado.nextInt();

        horas = Segundos / 3600;
        minutos = (Segundos % 3600) / 60;
        d = Segundos % 60;

        System.out.printf("%d:%d:%d\n" , horas, minutos, d);

    }
}

