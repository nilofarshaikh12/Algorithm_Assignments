
# 📈 Stock Buy and Sell

This Java program identifies days to buy and sell stocks in order to maximize profit. It reads daily stock prices from the user and returns pairs of days where buying and selling would result in profit.

---

## 📂 Package Structure

```

evaluationassignment/
└── stockBuyAndSell/
└── StockBuyAndSell.java
└── README.md

```

---

## 🧠 Problem Statement

For example:
```

Input: [100, 180, 260, 310, 40, 535, 695]
Output: (0 3) (4 6)

```
Explanation:
- Buy on day 0 (price = 100), sell on day 3 (price = 310)
- Buy on day 4 (price = 40), sell on day 6 (price = 695)

---

## 🔧 Method Details

### `public static List<int[]> stockBuySell(int[] arr)`

- **Input:** Integer array representing stock prices on each day.
- **Output:** List of integer arrays where each array has 2 elements `[buyDay, sellDay]`.

---

## 🖥 Sample Input & Output

### ✅ Example 1:
```

Enter size:
7
Enter values in array:
100 180 260 310 40 535 695

Output:
(0 3)
(4 6)

```

### ✅ Example 2:
```

Enter size:
5
Enter values in array:
5 4 3 2 1

Output:
No Profit

````

---

## 🛠 How It Works

- Traverse the price array.
- Track an increasing sequence.
- Whenever the price drops (i.e., local maximum), record the buy (start) and sell (current index).
- Continue checking until the end.
- Ensure each suggested trade has actual profit.

---

## ⚙️ How to Run

1. Compile the code:
   ```bash
   javac StockBuyAndSell.java
  ```
2. Run the program:
   ```bash
   java evaluationassignment.stockBuyAndSell.StockBuyAndSell
   ```
---
