import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, Perimetro, Trapezio;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if (A + B > C && A + C > B && B + C > A){

            Perimetro = A + B + C;

            System.out.printf("Perimetro = %.1f\n", Perimetro);
        }
        else{
            Trapezio = (A + B)*C/2;
            System.out.printf("Area = %.1f\n", Trapezio);
        }
    }
}