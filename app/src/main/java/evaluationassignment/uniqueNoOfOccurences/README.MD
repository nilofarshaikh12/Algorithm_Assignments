
# 🔢 Unique Number of Occurrences

This Java program checks if the **frequency of each number in an array is unique**. That is, no two numbers in the array should occur the same number of times.

---

## 📁 Package Structure

```

evaluationassignment/
└── uniqueNoOfOccurences/
└── UniqueNoOfOccurences.java
└── README.md

```

---

## 📌 Problem Statement

Given an array of integers, determine if the **count of each unique number's occurrence is distinct**.

### ✅ Example:
- Input: `[1, 2, 2, 1, 1, 3]`
- Frequencies: `1 → 3`, `2 → 2`, `3 → 1`
- Output: `true` (All frequencies are unique)

- Input: `[1, 2, 2, 1, 3, 3]`
- Frequencies: `1 → 2`, `2 → 2`, `3 → 2`
- Output: `false` (All frequencies are same)

---

## 🧠 Logic Explanation

1. Count the frequency of each element using a `Map`.
2. Store all the frequencies in a `Set`.
3. If the size of the frequency map is the same as the size of the set, then all frequencies are unique.

---

## 🖥 Sample Input & Output

### ✅ Input:
```

Enter size of array:
6
Enter elements in an array:
1 2 2 1 1 3

```

### ✅ Output:
```

true

````

---

## 🔍 Method Description

### `public static boolean isFrequencyUnique(int[] arr, int n)`
- **Input:** Array of integers and its size.
- **Output:** `true` if all frequencies are unique, otherwise `false`.

---

## ▶️ How to Run

1. **Compile the code:**
   ```bash
   javac src/evaluationassignment/uniqueNoOfOccurences/UniqueNoOfOccurences.java
````

2. **Run the program:**

   ```bash
   java evaluationassignment.uniqueNoOfOccurences.UniqueNoOfOccurences
   ```

---
