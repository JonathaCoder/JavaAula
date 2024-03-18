import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      //mostra uma caixa de entrada
      String texto = JOptionPane.showInputDialog(null, "digite seu numero");
      int numero = Integer.parseInt(texto);
      String filme = JOptionPane.showInputDialog(null, "qual seu fime preferido de 2021", "Filme favorito", JOptionPane.QUESTION_MESSAGE);
      System.out.println(filme);
      System.out.println(numero);
    }
}
