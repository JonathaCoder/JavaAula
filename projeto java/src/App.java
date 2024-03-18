public class App {
    public static void main(String[] args) throws Exception {
    String nome; // %s
    float peso; // %f
    char letra; //c
    String filme; 
    int idade; // %d


   nome = "jonatha";
   peso = 20.2f;
   filme = "velozes e furiosos";
   idade = 21;
   letra = 'J';

//concatenaçoes

   System.out.println("ola seja bem vindo "+ nome);
   System.out.println("seu peso atual e : "+ peso);
   System.out.println("seu filme favorito e : "+ filme);

 //O filme tem <Variavel> utilizando format

 System.out.format("Ola %s seja bem vindo, vimos que hoje seu peso e : %f e tambem vimos que seu filme favorito e %s , sua idade e de : %d e a primeira letra do seu nome e : %c ",nome,peso,filme,idade,letra);

 //formatar para String :String.formar(dado)

 String texto = String.format("Ola %s seja bem vindo, vimos que hoje seu peso e : %f e tambem vimos que seu filme favorito e %s , sua idade e de : %d e a primeira letra do seu nome e : %c ",nome,peso,filme,idade,letra);


 System.out.println(texto);
    }
}
