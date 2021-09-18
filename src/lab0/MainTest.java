package lab0;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void test1() {
        assertEquals(36, Main.integer(876));
    }
    @Test
    void test2() {
        assertTrue(Main.bool(369));
    }
    @Test
    void test3() {
        assertEquals(2, Main.cond(3, 0));
    }
    @Test
    void test4() { assertEquals("Friday", Main.caseSw(5)); }
    @Test
    void test5() {
        assertEquals(2.0, Main.forLoop(1));
    }
    @Test
    void test6() { assertTrue(Main.whileLoop(278)); }
}