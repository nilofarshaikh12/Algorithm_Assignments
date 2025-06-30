
# 🔁 Equilibrium Point in an Array

This Java program finds the **equilibrium point** in an array — an index such that the **sum of elements before it is equal to the sum of elements after it**.

---

## 📂 Project Structure

```

evaluationassignment/
└── equilibriumPoint/
├── EquilibriumPoint.java
└── README.md

```

---

## 📘 Description

An **equilibrium point** in an array is an index `i` such that:

```

arr[0] + arr[1] + ... + arr[i-1] == arr[i+1] + ... + arr[n-1]

```

- Index is **1-based** in output.
- If no such point exists, the program returns `-1`.

---

## ✅ Features

- Works for arrays of any length ≥ 1
- Returns the **1-based index** of the equilibrium point
- Efficient sum calculation using helper method

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter size:
5
Enter values in array:
1 2 4 3 0

Output:
3
Explanation: 1+2 = 3, and 3+0 = 3 → equilibrium at index 3 (1-based)

```

### Example 2:
```

Enter size:
2
Enter values in array:
1 2

Output:
-1

````

---

## 🔍 Method Signature

```java
public static int equilibriumPoint(Integer[] arr, int size)
````

* **Input**:

  * `arr`: Array of integers
  * `size`: Length of the array
* **Output**:

  * 1-based index of equilibrium point or `-1` if not found

---

## 🧑‍💻 How to Compile and Run

1. Navigate to the `equilibriumPoint` folder.
2. Compile:

   ```bash
   javac EquilibriumPoint.java
   ```
3. Run:

   ```bash
   java evaluationassignment.equilibriumPoint.EquilibriumPoint
   ```

---

## ⚠️ Edge Case Handling

* For `size == 1`: returns `1` (trivially equilibrium)
* For `size == 2`: returns `-1` (no element in the middle)
* Handles arrays with zeros, negative numbers, and duplicates
