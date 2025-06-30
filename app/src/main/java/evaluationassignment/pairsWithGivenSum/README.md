
# ➕ Pairs with Given Sum

This Java program counts the number of **unique pairs** in an array whose sum equals a given value.

---

## 📂 Project Structure

```

evaluationassignment/
└── pairsWithGivenSum/
├── PairsWithGivenSum.java
└── README.md

```

---

## 📘 Description

The program finds how many **distinct index pairs** `(i, j)` exist in an integer array such that:

```

arr[i] + arr[j] == given_sum

````
- Returns `-1` if no such pair exists

---

## ✅ Features

- Handles any array size and target sum
- Works even with negative numbers and zero
- Outputs `-1` when no valid pair is found

---

## 🔍 Method Signature

```java
public static int getPairCount(int arr[], int n, int given)
````

* **Parameters:**

  * `arr[]`: Input array of integers
  * `n`: Size of the array
  * `given`: Target sum to check against
* **Returns:**

  * Count of valid pairs, or `-1` if none found

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter size of array:
6
Enter given sum:
9
Enter elements in array:
1 5 8 -1 5 4

Output:
3
Explanation: Pairs (1, 8), (5, 4), (5, 4) → total 3 pairs
```

### Example 2:

```
Enter size of array:
4
Enter given sum:
10
Enter elements in array:
1 2 3 4

Output:
-1
Explanation: No pair sums to 10
```

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `pairsWithGivenSum` directory.
2. Compile the Java file:

   ```bash
   javac PairsWithGivenSum.java
   ```
3. Run the program:

   ```bash
   java evaluationassignment.pairsWithGivenSum.PairsWithGivenSum
   ```
