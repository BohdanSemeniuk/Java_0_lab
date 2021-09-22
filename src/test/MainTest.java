package test;

import lab0.Main;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    @DataProvider (name = "IntegerProvider")
    public Object[][] dpInteger(){
        return new Object[][] {{876, 36}, {602, 2}, {53648, 8}};
    }

    @Test(dataProvider = "IntegerProvider")
    public void testInteger(int n, int expected) {
        assertEquals(Main.integer(n), expected);
    }

    @DataProvider (name = "BooleanProvider")
    public Object[][] dpBooleanExpressions(){
        return new Object[][] {{369, true}, {447, false}, {548, false}};
    }

    @Test(dataProvider = "BooleanProvider")
    public void testBooleanExpressions(int a, boolean expected) {
        assertEquals(Main.bool(a), expected);
    }

    @DataProvider (name = "ConditionalOperatorProvider")
    public Object[][] dpConditionalOperator(){
        return new Object[][] {{3, 0, 2}, {3, 6, 3}, {0, 0, 0}, {0, 4.3f, 1}};
    }

    @Test(dataProvider = "ConditionalOperatorProvider")
    public void testConditionalOperator(float x, float y, int expected) {
        assertEquals(Main.cond(x, y), expected);
    }

    @DataProvider (name = "SelectionOperatorProvider")
    public Object[][] dpSelectionOperator(){
        return new Object[][] {{1, "Monday"}, {4, "Thursday"},
                {3, "Wednesday"}, {7, "Sunday"}, {5, "Friday"}};
    }

    @Test(dataProvider = "SelectionOperatorProvider")
    public void testSelectionOperator(int n, String expected) {
        assertEquals(Main.caseSw(n), expected);
    }

    @DataProvider (name = "LoopWithParameterProvider")
    public Object[][] dpForLoop(){
        return new Object[][] {{1, 2.0}};
    }

    @Test(dataProvider = "LoopWithParameterProvider")
    public void testForLoop(int n, double expected) {
        assertEquals(Main.forLoop(n), expected);
    }

    @DataProvider (name = "ConditionalLoopProvider")
    public Object[][] dpConditionalLoop(){
        return new Object[][] {{144, true}, {404, false}, {425, true}};
    }

    @Test(dataProvider = "ConditionalLoopProvider")
    public void testConditionalLoop(int n, boolean expected) {
        assertEquals(Main.whileLoop(n), expected);
    }

    @DataProvider (name = "MaxElementsProvider")
    public Object[][] dpMinMax(){
        return new Object[][] {{new int[]{1, 3, 4, 2, 1, 5, 6, 2, 6, 1}, 5}, {new int[] {1, 2, 3, 4}, 2},
                {new int[]{3, 5, 3, 7, 4, 6, 4}, 3}};
    }

    @Test(dataProvider = "MaxElementsProvider")
    public void testMinMax(int[] arr, int expected) {
        assertEquals(Main.minmax(arr), expected);
    }

    @DataProvider (name = "ArrayElementsProvider")
    public Object[][] dpArrayTask(){
        return new Object[][] {{new int[]{1, 3, 4, 2, 1, 5, 6, 2, 6, 1}, 3, 7, 18}, {
                new int[]{4, 6, 5, 7, 7, 5, 6, 8, 9, 5}, 1, 6, 34}, {
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, 6, 9, 30}};
    }

    @Test(dataProvider = "ArrayElementsProvider")
    public void testArrayTask(int[] arr, int k, int l, int expected) {
        assertEquals(Main.arrayTask(arr, k, l), expected);
    }

    @DataProvider (name = "MatrixProductsProvider")
    public Object[][] dpMatrixProducts(){
        return new Object[][] {{new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 3, 3, new double[]{2, 8}},
                {new int[][]{{0, 5, 3, 8, 7, 9, 3}, {4, 2, 5, 7, 2, 6, 5}, {3, 1, 6, 3, 8, 4, 3},
                        {7, 4, 3, 2, 7, 3, 8}, {5, 2, 7, 3, 9, 2, 0}}, 5, 7, new double[]{5, 4, 4}}};
    }

    @Test(dataProvider = "MatrixProductsProvider")
    public void testMatrixProducts(int[][] arr, int n, int m, double[] expected) {
        assertEquals(Main.matrix(arr, n, m), expected);
    }
}