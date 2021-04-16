import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Tviagem, Vmedia;
        double Qlitros;

        Tviagem = teclado.nextInt();
        Vmedia = teclado.nextInt();

        Qlitros = Tviagem * Vmedia /12.0;

        System.out.printf("%.3f\n" , Qlitros);
    }
}
      