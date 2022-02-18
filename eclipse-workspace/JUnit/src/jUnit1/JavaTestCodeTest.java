package jUnit1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;

//<dependency>
//<groupId>org.junit.jupiter</groupId>
//<artifactId>junit-jupiter-engine</artifactId>
//<version>5.5.2</version>
//<scope>test</scope>
//</dependency>
//스프링부터 2.2이상에서는 이 의존성이 내장되어있다.

//JUnit4와 다르게 jupiter에서는 애너테이션에 속성을 선언하지 않아도된다. 이미 해당 기능들이 존재하기 때문.
// 예를들어 @test(expected = Exception.class)
//			void create() throws Exception { ... }
//가
// @Test
// void assertThrows() {
//    RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, () -> {
//        if (1 == 1) {
//            throw new RuntimeException("런타임익셉션..");
//        }
//    });
//    Assertions.assertEquals("런타임익셉션..", runtimeException.getMessage());
//	}
//로 대체되듯이.


public class JavaTestCodeTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}


	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("beforeEach");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("afterEach");
	}
	
	@Test
	@DisplayName("테스트1")		//원래는 default라고함
	void test1() {
		System.out.println("test1");
	}
	
	@Test
	@DisplayName("테스트2")
	void test2() {
		System.out.println("test2");
	}
	
	@Test
	@Disabled
	void disabled() {
		System.out.println("disabled");
	}
	
	//System.out.println은 실행시키는 거니까 test의 의미가 퇴색되지만
//보기편하게 써보았다.
	
	@Test
	void assertEquals() {
	    int actual = 1;
	    Assertions.assertEquals(1, actual);
	}
	
	@Test
	void assertNotNull() {
	    Integer actual = 1;
	    Assertions.assertNotNull(actual);
	}
	
	@Test
	void assertTrue() {
	    boolean b = 3 > 5;
	    Assertions.assertTrue(b);
	}
	
	@Test
	void assertThrows() {
	    RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, () -> {
	        if (1 == 1) {
	            throw new RuntimeException("런타임익셉션..");
	        }
	    });
	    Assertions.assertEquals("런타임익셉션..", runtimeException.getMessage());
	}
	
	@Test
	void assertTimeout() {
	    System.out.println("start");
	    Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
	    	System.out.println("good");
	        try {
	            TimeUnit.SECONDS.sleep(4);
	        } catch (Throwable e) { }
	    }); // 같은 스레드에서 실행됨.
	}
	
	
//	@RepeatedTest
//	반복 횟수와 반복 테스트 이름을 설정할 수 있다.
//	{displayName}
//	{currentRepetition}
//	{totalRepetitions}
//	RepetitionInfo 타입의 인자를 받을 수 있다.
//	
	
	
//	@ParameterizedTest
//	테스트에 여러 다른 매개변수를 대입해가며 반복 실행한다.
//	{displayName}
//	{index}
//	{arguments}
//	{0}, {1}, ...
//	
	
}






