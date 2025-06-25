
# Smallest and Second Smallest Element Finder

- This Java program finds the **smallest** and **second smallest** distinct elements in a given integer array.
---

## 📘 Problem Statement

- You are given an array of integers.
- The program should return:
  - The **smallest** element
  - The **second smallest** distinct element
- If no second smallest is found (i.e., all elements are the same), a proper message is displayed.
---
## 📂 Package Structure

```

evaluationassignment
└── smallestAndSecondSmallest
└── SmallestAndSecondSmallest.java

```
---

## ✅ Logic Used

1. Initialize two variables `smallest` and `secondSmallest` to `Integer.MAX_VALUE`.
2. Traverse the array:
   - If current element < smallest → update both smallest and secondSmallest
   - Else if current element < secondSmallest and not equal to smallest → update secondSmallest
3. After traversal:
   - If secondSmallest is unchanged, return a message indicating all elements are equal.

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter the size of an array:
6
Enter elements in array:
3 1 4 1 5 9

Output:
Smallest element: 1
Second smallest element: 3

```

### Example 2:
```

Enter the size of an array:
4
Enter elements in array:
7 7 7 7

Output:
No second smallest element found all elements might be equal

````
---

## 🧑‍💻 How to Run

1. Open your terminal or Java IDE.
2. Compile the program:
   ```bash
   javac SmallestAndSecondSmallest.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.smallestAndSecondSmallest.SmallestAndSecondSmallest
   ```
