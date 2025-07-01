
# 💥 Max Product Subarray

This Java program finds the **maximum product** of a contiguous subarray within a given array of integers. It handles positive, negative, and zero values.

---

## 📁 Directory Structure

```

evaluationassignment/
└── maxProductSubarray/
├── MaxProductSubarray.java
└── README.md

```

---

## 📌 Problem Statement

Given an array of integers, the task is to find the **maximum product** of a subarray (a contiguous segment of the array).

Example:
```

Input: [2, 3, -2, 4]
Output: 6  (product of subarray [2,3])

````

---

## 🔍 Function Details

```java
public static int maxProduct(int arr[], int n)
````

* **Parameters:**

  * `arr[]` - input integer array
  * `n` - size of the array
* **Returns:**

  * The maximum product of a subarray

---

## 🚀 Sample Input/Output

### ✅ Example 1:

```
Enter size:
4
Enter values in array:
2 3 -2 4

Output:
6
```

### ✅ Example 2:

```
Enter size:
5
Enter values in array:
6 -3 -10 0 2

Output:
180
```

---

## ⚙️ How It Works

The program uses **Dynamic Programming** with two variables `max` and `min`:

* `max` tracks the **maximum product** ending at current index
* `min` tracks the **minimum product** (important for negative values)

---

## 🧠 Algorithm

1. Initialize:

   * `max = arr[0]`
   * `min = arr[0]`
   * `maxProd = arr[0]`

2. For each element from index 1 to end:

   * Compute current value, product with previous max, and product with previous min
   * Update `max`, `min` accordingly
   * Update `maxProd` if `max` is greater

---

## 🛠 How to Run

1. Open terminal in the `maxProductSubarray` folder
2. Compile:

   ```bash
   javac MaxProductSubarray.java
   ```
3. Run:

   ```bash
   java evaluationassignment.maxProductSubarray.MaxProductSubarray
   ```

---
