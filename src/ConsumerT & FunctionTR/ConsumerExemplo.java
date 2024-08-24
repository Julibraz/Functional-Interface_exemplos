import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
É utilizada principalmente para realizar ações, o efeitos colaterais nos elemntos do Stream sem modificar,
ou retornar um valor
*/
public class ConsumerExemplo {
    public static void main(String[] args) {
        //lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,7, 8);

        //usando o Consumer com expresão lambda para impprimir números pares
        //
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero + " é um numero par");
            }
        };

        //utilizando o consumer para imprimir numeros pares no Stream
        //numeros.stream().forEach(imprimirNumeroPar);
        //Consumer mais simplificado com lambda, diferente dos anteriores
        numeros.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
