
# Second Largest Element in an Array

This Java program finds the **second largest distinct element** in an array of integers.

---

## 📂 Project Structure

```

evaluationassignment/
└── secondLargestElement/
├── SecondLargestElement.java
└── README.md

```

---

## 📘 Description

- Takes an array of integers as input.
- Finds the **second largest** unique elements.
- If a second largest element doesn't exist (e.g., all elements are equal or array size < 2), returns `-1`.

---

## ✅ Features

- Handles negative numbers and duplicate values.
- Efficient: uses a single loop (`O(n)` time).
- Returns meaningful output even for edge cases.

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter size of array:
6
Enter elements in array:
10 20 4 45 99 45

Output:
45

```

### Example 2:
```

Enter size of array:
4
Enter elements in array:
1 1 1 1

Output:
-1

````

---

## 🔍 Method Used

```java
public static int findSecondLargest(int[] arr, int n)
````

* **Input**: `arr` = integer array, `n` = number of elements
* **Returns**: Second largest element, or `-1` if not found

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `secondLargestElement` directory.
2. Compile:

   ```bash
   javac SecondLargestElement.java
   ```
3. Run:

   ```bash
   java evaluationassignment.secondLargestElement.SecondLargestElement
   ```

---

## ⚠️ Edge Case Handling

* If array size < 2 → prints `-1`
* If all elements are the same → prints `-1`
* Supports negative values

---
