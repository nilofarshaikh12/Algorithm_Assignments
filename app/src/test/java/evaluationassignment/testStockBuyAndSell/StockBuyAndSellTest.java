package evaluationassignment.testStockBuyAndSell;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import evaluationassignment.stockBuyAndSell.StockBuyAndSell;

public class StockBuyAndSellTest {

    @Test
    void testProfitInArray_theReturnIndexOfDays() {
        int arr[] = new int[] { 1, 6 };
        int array[] = StockBuyAndSell.stockBuySell(new int[] { 25, 5, 6, 7, 8, 9, 200, 198 }).get(0);
        assertArrayEquals(arr, array);
    }

    @Test
    void testNoProfitInArray_theReturnNoProfit() {
        List<int[]> stockBuySell = StockBuyAndSell.stockBuySell(new int[] { 200, 140, 100, 50 });
        assertEquals(true, stockBuySell.isEmpty());
    }

    @Test
    void testMultipleProfits_theReturnMultipleIntervals() {
        int[][] expected = new int[][] {
                { 0, 2 },
                { 3, 5 }
        };
        List<int[]> actual = StockBuyAndSell.stockBuySell(new int[] { 100, 180, 260, 40, 535, 695 });

        assertEquals(expected.length, actual.size());
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual.get(i));
        }
    }

    @Test
    void testFlatPrices_theReturnNoProfit() {
        List<int[]> result = StockBuyAndSell.stockBuySell(new int[] { 50, 50, 50, 50 });
        assertEquals(true, result.isEmpty());
    }
}
