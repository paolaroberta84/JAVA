import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); 

        int Par = 0;
        int Impar = 0;
        int Positivo = 0;
        int Negativo = 0;
        int Valor;
        

        for (int contador=0; contador < 5; contador++){ 
            Valor = teclado.nextInt();
            if (Valor % 2 == 0) Par++;
            else Impar++;
            if (Valor > 0) Positivo++;
            else (Valor < 0) Negativo++;
        }
        System.out.println(Par + " valor(es) par(es)");
        System.out.println(Impar + " valor(es) imparer(es)");
        System.out.println(Positivo + " valor(es) positivo(s)");
        System.out.println(Negatiovo + " valor(es) negativo(s)");
    }
}