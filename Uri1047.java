
import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);   

        int h1, m1, h2, m2, mt1, mt2, h24, result;

        h1 = teclado.nextInt();
        m1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m2 = teclado.nextInt();

        mt1 = (h1*60) + m1;
        mt2 = (h2*60) + m2;
        h24 = (24*60);
        result = 0;

        if(mt2>mt1){
            result = mt2-mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(result/60), (result%60));
        }else if(mt1>mt2){
            result = (h24-mt1)+(mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(result/60), (result%60));
        }else if(mt2==mt1){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
       
    }
}