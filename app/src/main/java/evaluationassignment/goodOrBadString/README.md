
# 🔤 Good or Bad String Checker

This Java program checks whether a given string is **"Good"** or **"Bad"** based on certain rules for consecutive vowels and consonants.

---

## 📂 Project Structure

```

evaluationassignment/
└── goodOrBadString/
├── GoodOrBadString.java
└── README.md

````

---

## 📘 Description

A string is considered:

- **Bad** if it contains:
  - **More than 5 consecutive vowels**, or
  - **More than 3 consecutive consonants**
- Otherwise, it's a **Good String**

Special character `'?'` is treated as **either a vowel or a consonant**, and increases both counts.

---

## ✅ Features

* Case-insensitive string processing
* Handles wildcards (`?`) as both vowel and consonant
* Efficient linear traversal (`O(n)`)

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter a string:
aeioua

Output:
Bad String
Explanation: More than 5 vowels in a row
```

### Example 2:

```
Enter a string:
abcdfffgh

Output:
Bad String
Explanation: More than 3 consonants in a row
```

### Example 3:

```
Enter a string:
ab?c

Output:
Good String
```

---

## 🔧 Method

```java
public static String checkGoodOrBad(String str)
```

* **Input**: A string
* **Output**: `"Good String"` or `"Bad String"`

---

## 🧑‍💻 How to Compile and Run

1. Open terminal inside the `goodOrBadString` directory.
2. Compile:

   ```bash
   javac GoodOrBadString.java
   ```
3. Run:

   ```bash
   java evaluationassignment.goodOrBadString.GoodOrBadString
   ```
