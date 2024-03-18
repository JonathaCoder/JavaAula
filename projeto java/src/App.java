import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      //mostra uma caixa de entrada interface grafica com input 
      String texto = JOptionPane.showInputDialog(null, "digite seu numero");
      int numero = Integer.parseInt(texto);
       //mostra uma caixa de entrada interface grafica com input
      String filme = JOptionPane.showInputDialog(null, "qual seu fime preferido de 2021", "Filme favorito", JOptionPane.QUESTION_MESSAGE);

       //mostra uma interface grafica com a mensagem ao qual colocamos no imput
      JOptionPane.showMessageDialog(null, "seu filme favorito: "+filme);

      //imprimi no console
      System.out.println(filme);
      System.out.println(numero);
    }
}
