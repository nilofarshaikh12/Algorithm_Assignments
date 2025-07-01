
# 📈 Stock Buy and Sell II

This Java program calculates the **maximum profit** that can be earned by buying and selling stocks any number of times. It assumes that **you can sell and buy on the same day**.

---

## 📁 Package Structure

```

evaluationassignment/
└── stockBuyAndSell2/
└── StockBuyAndSell2.java
└── README.md
```

---


## 💡 Logic

- **Buy low, sell high** on every upward price movement.
- Add profit for each such increase:  
  If `price[i] > price[i-1]`,  
  then `profit += price[i] - price[i-1]`.

---

## 🖥 Sample Input & Output

### ✅ Input:
```

Enter size:
6
Enter the values:
7 1 5 3 6 4

```

### ✅ Output:
```

Maximum Profit: 7

````

**Explanation:**  
- Buy at 1, sell at 5 → Profit = 4  
- Buy at 3, sell at 6 → Profit = 3  
- Total = 4 + 3 = 7

---

## 🔧 Method Description

### `public static int maxProfit(int[] prices)`
- **Input:** Integer array of prices.
- **Output:** Maximum total profit.

---

## ▶️ How to Run

1. **Compile:**
   ```bash
   javac src/evaluationassignment/stockBuyAndSell2/StockBuyAndSell2.java
   ```
2. **Run:**
   ```bash
   java evaluationassignment.stockBuyAndSell2.StockBuyAndSell2
   ```

---
