
# Alternate Merge of Two Strings

This Java program merges two strings by taking characters **alternately** from each.  
If one string is longer, the remaining characters are added at the end of the result.

---

## 📂 Project Structure

```

evaluationassignment/
└── alternateMerge/
├── AlternateMergeString.java
└── README.md

```

---

## 📘 Description

- Reads two strings from the user.
- Merges characters alternately from each string.
- Continues until the end of the longer string.

---

## ✅ Features

- Handles strings of **unequal lengths**
- Uses efficient `StringBuilder` for merging
- Keeps character order from both strings

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter two strings:
abc
xyz

Output:
axbycz

```

### Example 2:
```

Enter two strings:
hello
123

Output:
h1e2l3lo

```

### Example 3:
```

Enter two strings:
hi
world

Output:
hwiorld

````

---

## 🔍 Method Used

```java
public static String getAlternativeMergedString(String str1, String str2)
````

* **Input**: Two strings
* **Output**: Merged string with alternate characters

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `alternateMerge` directory.
2. Compile:

   ```bash
   javac AlternateMergeString.java
   ```
3. Run:

   ```bash
   java evaluationassignment.alternateMerge.AlternateMergeString
   ```
