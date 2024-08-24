import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionExemplo {
    /*
    Representa uma função que aceira um argumento do tipo T e retorna um resultado do tipo R.
    é utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos
     */
    public static void main(String[] args) {
        //Lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar a Function com expressão LAMBDA para dobrar todos os numeros
        //Function<tipoDeEntrada, TipodeSaida>
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os numeros no Stream e armazenalos em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                //recebendo um integer e retornando outro integer ao dobro
                .map(n -> n * 2).toList();

        //imprimir
        numerosDobrados.forEach(System.out::println);
    }
}