import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     int NumOne;
     int NumTwo;

    NumOne = 10;
    NumTwo = 5;

     int resultado = NumOne - NumTwo;
     int resultado2 = NumOne + NumTwo;
     int resultado3 = NumOne * NumTwo;
     float resultado4 = NumOne / NumTwo;
     
   
    JOptionPane.showMessageDialog(null, "Resultado do subtracao: "+resultado, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,  "Resultado do soma: "+resultado2, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Resultado do Multiplicacao: "+resultado3, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Resultado do divisao: "+resultado4, "Matematica" , JOptionPane.INFORMATION_MESSAGE);
    }
}
