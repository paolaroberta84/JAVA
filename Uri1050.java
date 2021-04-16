import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int DDD;

        DDD = teclado.nextInt();

        if (DDD == 61){
        System.out.println(“Brasilia”);
        }
        else if (DDD == 71){
        System.out.println(“Salvador”);
        }
        else if (DDD == 11){
        System.out.println(“Sao Paulo”);
        }
        if (DDD == 21){
        else System.out.println(“Rio de Janeiro”);
        }
        if (DDD == 32){
        else System.out.println(“Juiz de Fora”);
        }
        else if (DDD == 19){
        System.out.println(“Campinas”);
        }
        else if (DDD == 27){
        System.out.println(“Vitoria”);
        }
        else if (DDD == 31){
        System.out.println(“Belo Horizonte”);
        }
        else {
        System.out.println(“DDD nao cadastrado”);
        }
    }
}