
# First and Last Occurrence of a Number in an Array

This Java program finds the **first** and **last** index positions of a given number in an array.

---

## 📂 File Structure

```

evaluationassignment/
└── firstAndLastOccurenceOfX/
├── FirstAndLastOccurenceOfX.java
└── README.md

```

---

## 📘 Description

- Accepts an array of integers from the user.
- Takes a specific value to search.
- Outputs the **index of the first** and **last occurrence** of that value in the array.
- If the value is not found, returns `-1`.

---

## ✅ Features

- Handles arrays with multiple, single, or no occurrences of the target value.
- Uses `List<Integer>` to return both first and last index positions.
- Properly validates input array size.

---

## 🧾 Sample Input/Output

### Example 1:
```

enter size of array:
7
Enter elements in array:
1 2 2 5 7 8 9
Enter element to find frequency:
2

Output:
Fisrt occurence index:1
Last occurence index:2

```

### Example 2:
```

enter size of array:
5
Enter elements in array:
10 20 30 40 50
Enter element to find frequency:
60

Output:
Value 60 not found in array

````

---

## 🔍 Method Reference

```java
public static List<Integer> firstAndLastOccIndex(int[] arr, int n, int value)
````

* **Input**:

  * `arr`: Integer array
  * `n`: Size of array
  * `value`: Number to find
* **Returns**:

  * A list with two elements: `[firstIndex, lastIndex]`
  * Or `[-1]` if the number is not found

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `firstAndLastOccurenceOfX` folder.
2. Compile:

   ```bash
   javac FirstAndLastOccurenceOfX.java
   ```
3. Run:

   ```bash
   java evaluationassignment.firstAndLastOccurenceOfX.FirstAndLastOccurenceOfX
   ```
