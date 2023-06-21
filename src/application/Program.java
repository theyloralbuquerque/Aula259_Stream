package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); // Arrays.asList() cria uma nova Lista com os valores dentro dos parênteses.
		
		Stream<Integer> st1 = list.stream(); // .stream() a partir de uma Lista cria uma stream.
		System.out.println(Arrays.toString(st1.toArray())); // Arrays.toString() converte o array que está dentro dos parênteses em String.
															// .toArray() a partir de uma stream converte uma stream em um array.
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // Stream.of() permite criar uma stream com os elementos dentro dos parênteses.
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // Stream.iterate() permite criar uma stream com base em um começo e na iteração que esse começo irá receber.
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // .limit() corta/limita a execução da stream. 
		
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]); // Sequência de Fibonacci.
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
