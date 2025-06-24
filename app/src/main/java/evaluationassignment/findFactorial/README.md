
# Find Factorial of a Number

- This Java program calculates the **factorial** of a given non-negative integer entered by the user.
---
## 📘 What is a Factorial?

- The **factorial** of a number `n` (denoted as `n!`) is the product of all positive integers less than or equal to `n`.

### Examples:
- `5! = 5 × 4 × 3 × 2 × 1 = 120`
- `0! = 1` (by definition)
- Negative numbers do not have factorials (not defined)
---
## 📂 Package Structure

```

evaluationassignment
└── findFactorial
└── FindFactorialOfNumber.java

```
---
## 🚀 How It Works

- Prompts the user to enter a number.
- Validates that the number is non-negative.
- Calculates and prints the factorial.
- Throws an exception for negative input.
---
## 🧾 Sample Input/Output

```

Enter number:
5
120

Enter number:
0
1

Enter number:
-3
Error: Factorial is not defined for negative numbers

````
---
## 🧑‍💻 How to Run

1. Open your terminal or IDE.
2. Compile the program:
   ```bash
   javac FindFactorialOfNumber.java
   ```
3. Run the program:

   ```bash
   java evaluationassignment.findFactorial.FindFactorialOfNumber
   ```
---
