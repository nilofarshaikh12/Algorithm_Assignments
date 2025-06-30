
# 🔢 Kth Smallest Element in an Array

This Java program finds the **k-th smallest element** in a given array of distinct integers.

---

## 📂 Project Structure

```

evaluationassignment/
└── kthSmallestElement/
├── KthSmallestElement.java
└── README.md

````

---

## 📘 Description

Given an array of `n` distinct integers and an integer `k`, this program returns the **k-th smallest** element in the array.

- The array is first **sorted in ascending order**, and then the `(k-1)`-th index is returned (since indexing starts at 0).

---

## ✅ Features

- Handles invalid `k` values gracefully
- Ensures array has distinct elements
---

## 🔍 Method

```java
public static String findKthSmallestElement(int[] arr, int n, int k)
````

* **Parameters**:

  * `arr`: The input array of integers
  * `n`: Size of the array
  * `k`: The index (1-based) for which we want the smallest element
* **Returns**:

  * A string with the `k`-th smallest element or an error message

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter size of an array:
5
Enter distinct values in array:
7 10 4 3 20
Enter value of k:
3

Output:
3th smallest element:7
```

### Example 2:

```
Enter size of an array:
7
Enter distinct values in array:
10 15 5 8
Enter value of k:
0

Output:
Invalid value of k
```

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `kthSmallestElement` directory.
2. Compile:

   ```bash
   javac KthSmallestElement.java
   ```
3. Run:

   ```bash
   java evaluationassignment.kthSmallestElement.KthSmallestElement
   ```

---

## ⚠️ Notes

* The program assumes **distinct elements** in the array.
* `k` must be between 1 and `n` inclusive.
* Output is in **ascending sorted order**.
