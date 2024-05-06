package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assetThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean exceptException) {
		if(!exceptException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		}
		assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
	}
	
	static Stream<Object> argumentsForAddPositive(){
		return Stream.of();
	}
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(-40,50)).isEqualTo(90);
	}
	
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
	}
	
	/**
	 * This is my test to to see if a summed number is even or odd
	 * 
	 */
	@Test
	void assertThatParisOfEvenOrOdd() {
		assertThat(testDemo.myMethod(15,10)).isEqualTo(25);
		assertThat(testDemo.myMethod(40,50)).isEqualTo(90);
		assertThat(testDemo.myMethod(50,50)).isEqualTo(100);
	}

}
