package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp(){
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	//요구사항 1
	//hashSet에는 중복 데이터 안들어가?? 4가 아닌 이유
	@Test
	void checkSize(){
		assertThat(numbers.size()).isEqualTo(3);
	}

	//요구사항 2
	@ParameterizedTest
	@ValueSource(ints ={1,2,3})
	void contains(int number){
		assertTrue(numbers.contains(number));
	}

	//요구사항 3
	@ParameterizedTest
	@CsvSource({"1,True","2,True","3,True","4,False","5,False"})
	void contains(int input, boolean expected){
		assertEquals(expected,numbers.contains(input));
	}
}
