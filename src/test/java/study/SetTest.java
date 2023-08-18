package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.HashSet;
import java.util.Set;

import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import jdk.internal.joptsimple.internal.Strings;

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
	@ValueSource(ints ={1,2,3} )
	void contains(int number){
		Assertions.assertTrue();
	}
}
