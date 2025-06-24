
# Check Palindrome String

- This Java program checks whether a given **string** is a **palindrome** or not.
---
## 📘 What is a Palindrome?

- A **palindrome** is a word, phrase, or sequence that reads the same backward as forward.

### Examples:
- Palindromes: `madam`, `level`, `noon`
- Not Palindromes: `hello`, `world`
---
## 📂 Package Structure

```

evaluationassignment
└── checkPalindromeString
└── CheckPalindromeString.java

```
---
## 🚀 How It Works

- Prompts the user to enter a string.
- Converts the string to lowercase for case-insensitive comparison.
- Compares characters from both ends moving toward the center.
- Returns:
  - `1` if the string is a palindrome
  - `0` if it is not
---
## 🧾 Sample Input/Output

```

Enter a string:
Madam
1

Enter a string:
Hello
0

````
---
## 🧑‍💻 How to Run

1. Open your terminal or IDE.
2. Compile the program:
   ```bash
   javac CheckPalindromeString.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.checkPalindromeString.CheckPalindromeString
   ```
---
## 📌 Note

* The function only checks for exact character match; it does **not** ignore spaces or special characters.

  * Example: `"A man a plan a canal Panama"` would return `0`
