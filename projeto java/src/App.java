import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
     int numero;
     float numeroTwo;
     String jogo;

     //Configurando (define que os separadores é \r ou \n)
     ler.useDelimiter("[\r\n]+");

     System.out.println("digite um numero: ");
     numero = ler.nextInt();
     System.out.println("digite um numero em float: ");
     numeroTwo = ler.nextFloat();

     System.out.println("qual seu jogo favorito: ");
     jogo = ler.next();
     

     System.out.println("seu numero é : " + numero);
     System.out.println("seu numero em float e : " + numeroTwo);
     System.out.println("o seu jogo e: " + jogo);


     //converçoes
   //Intenger.parseInt(var) , Float.parseFloat(vat) , parseDouble(var)

    }
}
