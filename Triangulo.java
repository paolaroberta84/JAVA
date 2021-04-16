import java.util.Scanner;

public class Triangulo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Informe a base do triangulo");
        base = teclado.nextDouble();
        System.out.println("Informe a Altura do triangulo");
        altura = teclado.nextDouble();

        area = (base * altura)/ 2.0;

        System.out.printf("A area do triangulo de base %.2f e altura %.2f vale %2f/n" , base, altura, area);
        }
}