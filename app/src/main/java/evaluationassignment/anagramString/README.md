
# Anagram String Character Deletion Counter

- This Java program determines the **minimum number of character deletions** required to make two input strings **anagrams** of each other.
---
## 📘 What is an Anagram?

Two strings are **anagrams** if they contain the same characters in the same frequencies, regardless of order.

### ✅ Example:
- `"listen"` and `"silent"` → ✅ Anagrams  
- `"hello"` and `"billion"` → ❌ Not Anagrams
---

## 🧠 What This Program Does

- Takes two input strings.
- Converts them to lowercase (case-insensitive comparison).
- Calculates how many characters must be deleted **from both strings combined** to make them anagrams.

---
## 📂 Package Structure

```

evaluationassignment
└── anagramString
└── AnagramString.java
```
---

## 🔍 Logic Overview

1. Count frequency of each character in `str1` using an integer array of size 26.
2. Decrease frequency using characters from `str2`.
3. Sum the **absolute differences** of the counts → this is the number of deletions required.

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter two strings:
abc
cde

Output:
4

```
**Explanation:** Remove 'a' and 'b' from "abc", 'd' and 'e' from "cde" → 4 deletions

### Example 2:
```

Enter two strings:
listen
silent

Output:
0

````
**Explanation:** Already anagrams, no deletions needed.

---

## 🧑‍💻 How to Run

1. Open terminal or IDE.
2. Compile the program:
   ```bash
   javac AnagramString.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.anagramString.AnagramString
   ```
