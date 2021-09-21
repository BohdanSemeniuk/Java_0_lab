package lab0;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
    @Test
    void test7() { assertEquals(5, Main.minmax(new int[]{1, 3, 4, 2, 1, 5, 6, 2, 6, 1})); }
    @Test
    void test8() { assertEquals(18, Main.arrayTask(new int[]{1, 3, 4, 2, 1, 5, 6, 2, 6, 1}, 3, 7)); }
    @Test
    void test9() { assertEquals("[5.0, 4.0, 4.0]", Arrays.toString(Main.matrix(new int[][]{
            {0, 5, 3, 8, 7, 9, 3},
            {4, 2, 5, 7, 2, 6, 5},
            {3, 1, 6, 3, 8, 4, 3},
            {7, 4, 3, 2, 7, 3, 8},
            {5, 2, 7, 3, 9, 2, 0}
    }, 5, 7))); }
}