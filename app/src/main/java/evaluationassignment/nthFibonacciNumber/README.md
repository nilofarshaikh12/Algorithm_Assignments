
# Nth Fibonacci Number

- This Java program calculates the **Nth Fibonacci number** based on the position (term) entered by the user.
---
## 📘 What is the Fibonacci Sequence?

- The **Fibonacci sequence** is a series of numbers where:
  - The first term (1st) is `0`
  - The second term (2nd) is `1`
  - Every term after that is the sum of the two preceding terms
---
### Example:
```

1st → 0
2nd → 1
3rd → 1
4th → 2
5th → 3
6th → 5
7th → 8
...

```
---
## 📂 Package Structure

```

evaluationassignment
└── nthFibonacciNumber
└── NthFibonacciNumber.java

```
---
## 🚀 How It Works

- Prompts the user to enter the position `n`
- Calculates the `n`th Fibonacci number using an iterative approach
- Returns:
  - The Fibonacci number at the `n`th position
  - `null` if input is `0` or negative
---
## 🧾 Sample Input/Output

```

Enter the place you want to find fibonacci number:
5
3

Enter the place you want to find fibonacci number:
1
0

Enter the place you want to find fibonacci number:
-2
null

````
---
## 🧑‍💻 How to Run

1. Open your terminal or IDE.
2. Compile the program:
   ```bash
   javac NthFibonacciNumber.java
   ```
3. Run the program:

   ```bash
   java evaluationassignment.nthFibonacciNumber.NthFibonacciNumber
   ```
---
## 🔍 Note

* Position `n` starts from 1 (i.e., `1 → 0`, `2 → 1`)
