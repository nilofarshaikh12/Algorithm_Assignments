
# 🔢 Smallest and Second Smallest Element Finder

This Java program finds the **smallest** and **second smallest** distinct elements from a given array of integers.

---

## 📂 Project Structure

```

evaluationassignment/
└── smallestAndSecondSmallest/
├── SmallestAndSecondSmallest.java
└── README.md

````

---

## 📘 Description

Given an integer array, the program identifies the **smallest** and **second smallest** elements.  
If all elements are the same or only one element is present, it reports that the second smallest cannot be found.

---

## ✅ Features

- Handles edge cases like:
  - All elements being equal
  - Array with less than two elements
- Efficient single-pass solution (`O(n)` time complexity)
- Clearly formatted output

---

## 🔍 Method Signature

```java
public static String getSmallestAndSecondSmallest(int arr[], int n)
````

* **Parameters:**

  * `arr[]`: Array of integers
  * `n`: Size of the array
* **Returns:** A string message indicating the smallest and second smallest elements or an error message.

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter the size of an array:
5
Enter elements in array:
3 1 4 1 5

Output:
Smallest element: 1
Second smallest element: 3
```

### Example 2:

```
Enter the size of an array:
3
Enter elements in array:
2 2 2

Output:
No second smallest element found all elements might be equal
```

### Example 3:

```
Enter the size of an array:
1

Output:
Array must have at least two elements...
```

---

## 🧑‍💻 How to Compile and Run

1. Open terminal inside the `smallestAndSecondSmallest` folder.
2. Compile:

   ```bash
   javac SmallestAndSecondSmallest.java
   ```
3. Run:

   ```bash
   java evaluationassignment.smallestAndSecondSmallest.SmallestAndSecondSmallest
   ```

---

## ⚠️ Notes

* Input validation is included for size < 2.
* Logic avoids using sorting to ensure linear time performance.
* Second smallest is only valid if it's distinct from the smallest.

---
