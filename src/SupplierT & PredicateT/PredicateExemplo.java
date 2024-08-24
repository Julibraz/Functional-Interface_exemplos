import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Representa uma função que aceita um argumento e retorna um valor boolean(true or false)
É comumente usada para filtrar os elementos do Stream com base em alguma condição
 */
public class PredicateExemplo {
    public static void main(String[] args) {
        //Lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "arroz", "feijao", "c", "python");

        //criando um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //usando o Stream para filtrar as palavras com mais de 5 caracteres e imprimindo em seguida
        //com lambda
        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}