
# Add Minimum Characters to Make a String Palindrome

This Java program calculates the **minimum number of characters** that need to be **added at the front** of a given string to make it a **palindrome**.

---

## 📂 Project Structure

```

evaluationassignment/
└── addMinCharToMakePalindrome/
├── AddMinCharToMakePalindrome.java
└── README.md

```

---

## 📘 Description

A palindrome is a string that reads the same backward as forward.  
This program checks how many characters need to be inserted at the **beginning** of the input string to turn it into a palindrome.

### ✔️ Example:
```

Input:  "abc"
Output: 2
Explanation: Add "cb" at front → "cbabc"

````

---

## ✅ Features

- Handles both uppercase and lowercase inputs (case-insensitive).
- Uses a helper method to check palindromes.
- Efficient linear checking without reversing the string.

---

## 🔍 Method Used

```java
public static int addMinChar(String str)
````

* **Input**: A string
* **Output**: Minimum number of characters to add at front to make it a palindrome

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter string: 
abc

Output:
2
```

### Example 2:

```
Enter string:
aba

Output:
0
```

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `addMinCharToMakePalindrome` directory.
2. Compile:

   ```bash
   javac AddMinCharToMakePalindrome.java
   ```
3. Run:

   ```bash
   java evaluationassignment.addMinCharToMakePalindrome.AddMinCharToMakePalindrome
   ```

---

## ⚠️ Edge Case Handling

* Works for empty strings (returns 0)
* Treats input as case-insensitive
* Does not add characters in output — just returns the count
