
# 🔢 Missing Number Finder

This Java program identifies the **missing number** from a sequence of the first `n` natural numbers given an array of size `n-1`.

---

## 📂 Project Structure

```

evaluationassignment/
└── missingNumber/
├── MissingNumber.java
└── README.md

```

---

## 📘 Description

Given a number `n`, the program expects an array of `n-1` elements that should contain all numbers from `1` to `n` **except one missing number**.

It uses the formula for the sum of the first `n` natural numbers:
```

Sum = n \* (n + 1) / 2

````
Then subtracts the actual sum of the input array to find the missing number.

---

## 🔍 Method Signature

```java
public static int findMissingNumber(int arr[], int n)
````

* `arr`: Array of integers of length `n-1`
* `n`: Limit of the full range (1 to `n`)
* **Returns**: The single missing number

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter Limit of an array:
5
Enter 4 elements in array:
1 2 3 5

Output:
Missing number: 4
```

### Example 2:

```
Enter Limit of an array:
1

Output:
Invalid limit
```

---

## 🧑‍💻 How to Compile and Run

1. Open terminal inside the `missingNumber` folder.
2. Compile the Java file:

   ```bash
   javac MissingNumber.java
   ```
3. Run the program:

   ```bash
   java evaluationassignment.missingNumber.MissingNumber
   ```

---

## ⚠️ Notes

* This assumes only **one number is missing** in the range from 1 to `n`.
* Array must contain distinct integers from the sequence.
