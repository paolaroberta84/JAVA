import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); 

        in N = teclado.nextInt();

        for (int num = 1; num <= N; num <= 1000){
            System.out.println(num + " " + (num*num) + " " + (num*num*num));

        }
    }
}

