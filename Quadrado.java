import java.util.Scanner;

public class Quadrado{
    public static void main(String args[]){
        Scanner imput = new Scanner(System.in);

        float lado, area;

        System.out.println("Digite o valor do lado do quadrado");
        lado = imput.nextFloat();

        area = lado * lado;

        System.out.printf("O Valor da area do quadrado vale %.3f\n", area);

    }
}
