import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     int NumOne;
     int NumTwo;
     int contador;
    int numeroA;
     int numeroB;

    contador = 0;
    NumOne = 40;
    NumTwo = 50;
    

    numeroA = -5;
     numeroB = 20;
      //Math.abs(var) sempre vai pegar um valor positivo
      int res2 = Math.abs(numeroA);
      //Math.pow(valo a : 10 valor b : 2) ele faz a 10 elevado a 2 
      int res = (int) Math.pow(10,2); //por padrao o Pow e double entao devemos converter para int
       //faz a raiz quadrada do numero passado como parametro
       int res3 = (int) Math.sqrt(4); //por padrao o Pow e double entao devemos converter para int
       //serve para arredondar um numero sendo ele por padrao double
       double res4 =Math.ceil(10.54);
       //arrendondar para baixo
       double res5 = Math.floor(10.50);
      //para pegar o valor meno entre dois numeros
       double res6 = Math.min(numeroA, numeroB);
       //para pegar o valor maior entre dois numeros
       double res7 = (int) Math.max(numeroA, numeroB);

     int resultado = NumOne - NumTwo;
     int resultado2 = NumOne + NumTwo;
     int resultado3 = NumOne * NumTwo;
     double resultado4 = (double) NumOne / NumTwo; // cast (tipo de dado)
     int resto = NumOne % NumTwo;
     
   
    JOptionPane.showMessageDialog(null, "Resultado do subtracao: "+resultado, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,  "Resultado do soma: "+resultado2, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Resultado do Multiplicacao: "+resultado3, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Resultado do divisao: "+resultado4, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Resultado: "+resto, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    contador += 10;
    JOptionPane.showMessageDialog(null, "Resultado: "+contador, "Contador" , JOptionPane.INFORMATION_MESSAGE);
    contador += 10;
    JOptionPane.showMessageDialog(null, "Resultado: "+contador, "Contador" , JOptionPane.INFORMATION_MESSAGE);
    contador++;
    JOptionPane.showMessageDialog(null, "Resultado: "+contador, "Contador" , JOptionPane.INFORMATION_MESSAGE);
    
    JOptionPane.showMessageDialog(null, "Resultado: "+res7, "teste Math.obs" , JOptionPane.INFORMATION_MESSAGE);


    }
}
