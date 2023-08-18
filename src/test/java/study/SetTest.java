package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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

	//hashSet에는 중복 데이터 안들어가?? 4가 아닌 이유
	@Test
	void checkSize(){
		assertThat(numbers.size()).isEqualTo(3);
	}

	@ParameterizedTest
	@ValueSource(ints ={1,2,3})
	void contains(int number){
		assertTrue(numbers.contains(number));
	}
}
