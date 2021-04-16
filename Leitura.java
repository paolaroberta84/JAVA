import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int     a;
        float   b;
        double  c;

        System.out.println("Digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Voce digitou o valor = " + a);
        System.out.println("Agora digite um numero real");
        b = teclado.nextfloat();
        System.out.println("Voce digitou o valor = " + b);
        System.out.println("Finalmente digite outro numero real");
        c = teclado.nextDouble();
        System.out.println("Voce digitou o valor = " + c);

        System.out.printf("Voce digitou %d %.2f %.4f\n", a,b,c);
}
}