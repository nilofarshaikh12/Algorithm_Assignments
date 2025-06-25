
# CheckSubsequence

This Java program checks whether one string is a **subsequence** of another string.

---

## 📘 What is a Subsequence?

A string `A` is a **subsequence** of string `B` if all characters of `A` appear in `B` in the **same order**, but not necessarily contiguously.

### ✅ Examples:
- `"abc"` is a subsequence of `"a1b2c3"` ✅
- `"abc"` is **not** a subsequence of `"acb"` ❌ (wrong order)

---

## 📂 Project Structure

```

evaluationassignment/
└── checkSubsequence/
├── CheckSubsequence.java
└── README.md

```

---

## ✅ Program Behavior

- Reads two strings from the user.
- Checks whether the **first string** is a subsequence of the **second string**.
- Prints `"yes"` if it is, `"no"` otherwise.

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter two strings:
abc
a1b2c3

Output:
yes

```

### Example 2:
```

Enter two strings:
abc
acb

Output:
no

````

---

## 🔍 Method Reference

```java
public static String checkForSubsequence(String str1, String str2)
````

* `str1`: Potential subsequence
* `str2`: Main string
* Returns `"yes"` if `str1` is a subsequence of `str2`, otherwise `"no"`

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `checkSubsequence` folder.
2. Compile:
   ```bash
   javac CheckSubsequence.java
   ```
3. Run:
   ```bash
   java evaluationassignment.checkSubsequence.CheckSubsequence
   ```
