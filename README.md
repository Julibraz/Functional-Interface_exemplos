# Metodos interessantes para treinar mais 
Operações Intermediárias: são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. 
 1. `filter(Predicate<T> predicate)`
Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado.
<br>Exemplo:
stream.filter(n -> n > 5);


2. `map(Function<T, R> mapper):` Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes. <br>Exemplo: <br>stream.map(s -> s.toUpperCase())

3. `sorted():` Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido. <br>Exemplo: <br>stream.sorted()

4. `distinct():` Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação. <br>Exemplo: <br>stream.distinct()

5. `limit(long maxSize):` Limita o número de elementos da Stream aos maxSize primeiros elementos <br>Exemplo: <br>stream.limit(10)

6. `skip(long n):` Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles. <br>Exemplo: <br>stream.skip(5)


# Metodos Terminais
Operações Terminais: são aquelas que encerram o pipeline e produzem um resultado final. São elas:
1. `forEach(Consumer<T> action):` Executa uma ação para cada elemento da Stream. <br>Exemplo: <br>stream.forEach(System.out::println)

2. `toArray():` Converte a Stream em um array contendo os elementos da Stream. <br>Exemplo: <br>stream.toArray()

3. `collect(Collector<T, A, R> collector):` Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa. <br>Exemplo: <br>stream.collect(Collectors.toList())

4. `count():` Retorna o número de elementos na Stream. <br>Exemplo: <br>stream.count()

5. `anyMatch(Predicate<T> predicate):` Verifica se algum elemento da Stream atende ao predicado especificado. <br>Exemplo: <br>stream.anyMatch(s -> s.startsWith("A"))

6. `allMatch(Predicate<T> predicate):` Verifica se todos os elementos da Stream atendem ao predicado especificado. <br>Exemplo: <br>stream.allMatch(n -> n > 0)

7. `noneMatch(Predicate<T> predicate):` Verifica se nenhum elemento da Stream atende ao predicado especificado. <br>Exemplo: <br>stream.noneMatch(s -> s.isEmpty())

8. `min(Comparator<T> comparator) e max(Comparator<T> comparator):` Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido. <br>Exemplo: <br>stream.min(Comparator.naturalOrder()) ou stream.max(Comparator.naturalOrder())

9. `reduce(T identity, BinaryOperator<T> accumulator):` Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final.<br>Exemplo: <br>stream.reduce(0, (a, b) -> a + b)
