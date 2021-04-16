import java.util.Scanner;

public class Salario{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int Nfunc, Nhoras;
        double Vhora, Salario;

        Nfunc = teclado.nextInt();
        Nhoras = teclado.nextInt();
        Vhora = teclado.nextDouble();

        Salario = Nhoras * Vhora;

        System.out.println("NUMBER = " + Nfunc);
        System.out.printf("SALARY = U$ %.2f\n" , Salario);
    }
}
