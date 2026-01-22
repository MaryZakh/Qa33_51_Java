package lesson2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArgsIntroTest {

    @BeforeAll
    static void preCondition() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("Test1");
    }

    @Test
    void test2() {
        System.out.println("Test2");
    }

    @Test
    void test3() {
        System.out.println("Test3");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void postCondition(){
        System.out.println("AfterAll");

    }
}