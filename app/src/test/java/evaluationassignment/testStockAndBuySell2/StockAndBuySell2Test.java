package evaluationassignment.testStockAndBuySell2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.stockBuyAndSell2.StockBuyAndSell2;

public class StockAndBuySell2Test {

    @Test
    void testArrayGiven_thenReturnsProfit() {
        assertEquals(4, StockBuyAndSell2.maxProfit(new int[] { 1, 5, 4, 2, 1 }));
    }

    @Test
    void testGivenArrayNoProfit_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] { 6, 5, 4, 2, 1 }));
    }

    @Test
    void testGivenArrayIsSame_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] { 6, 6, 6, 6, 6, 6 }));
    }

    @Test
    void testSingleElement_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] { 10 }));
    }

    @Test
    void testEmptyArray_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] {}));
    }
}
