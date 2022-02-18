package jUnit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//JavaTestCodeTest파일은 클래스파일 생성 후 import추가해주었고, 이 파일은 처음 생성할 때 junit test case로 생성했다.
//차이가 잇을까.

class JavaTestCodeTest0 {
	    int value = 1;

	    @FastTest
	    @DisplayName("FastTest")
	    void create_new_study() {
	        System.out.println(this);
	        System.out.println(value++);
	    }

	    @SlowTest
	    @DisplayName("SlowTest")
	    void create_new_study_again() {
	        System.out.println(this);
	        System.out.println(value++);
	    }
	    //기본 전략
//	    테스트 메서드마다 클래스 인스턴스를 새로 만듦
//	    this 값 다름 -> 다른 인스턴스
//	    value 값은 항상 1로 출력됨( 테스트 간의 의존성을 없애기 위해서)
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StudyTest {
    int value = 1;

    @Test
    @DisplayName("FastTest")
    void create_new_study() {
        System.out.println(this);
        System.out.println(value++);
    }

    @Test
    @DisplayName("SlowTest")
    void create_new_study_again() {
        System.out.println(this);
        System.out.println(value++);
    }

    @BeforeAll
    void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    void afterAll() {
        System.out.println("after all");
    }
}

