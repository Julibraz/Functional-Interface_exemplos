import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos
 */
public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        //lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //uando o BinaryOperator com expressão lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //uando o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0,somar);
        //identy, seria como se fosse uma variavel temporaria. como se toda vez que passe
        // pelo elemento "somar" ele fizesse a somo do identy com o "somar"

        //impressão do resultado
        System.out.println("A soma dos numeros é: " + resultado);
    }
}