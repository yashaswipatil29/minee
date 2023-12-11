package day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> allNumbers = Arrays.asList(32,54,89,54);
		//populating a stream on the top of collection allNumbers
	    Stream<Integer> intStream =allNumbers.stream();
	    
	    Consumer<Integer> intConsumer = num -> System.out.println(num);
	    intStream.forEach(intConsumer);

	}

}
