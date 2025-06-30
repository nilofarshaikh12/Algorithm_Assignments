
# Confused Pappu 

This Java program helps "Pappu" find out how much more money he *thinks* he has when he **mistakenly reads the digit '6' as '9'** in a number.

---

## 📂 Project Structure

```

evaluationassignment/
└── confusedPappu/
├── ConfusedPappu.java
└── README.md

````

---

## 📘 Problem Description

Pappu is confused and reads every `6` as a `9`.  
Given an amount, this program:

- Converts all `6`s in the number to `9`s
- Calculates the **difference** between Pappu’s mistaken amount and the original amount

---

## ✅ Features

* Simple string replacement logic
* Returns difference only (not mistaken amount)
* Handles multi-digit amounts with multiple 6s

---

## 🧾 Sample Input/Output

### Example 1:

```
Enter amount:
966

Output:
33
Explanation: Pappu reads it as 999. So, 999 - 966 = 33
```

### Example 2:

```
Enter amount:
123

Output:
0
Explanation: No 6s to confuse, so no difference.
```

---

## 🧑‍💻 How to Compile and Run

1. Open terminal in the `confusedPappu` directory.
2. Compile:

   ```bash
   javac ConfusedPappu.java
   ```
3. Run:

   ```bash
   java evaluationassignment.confusedPappu.ConfusedPappu
   ```

---

## ⚠️ Notes

* Only works with positive integers
* Does not validate non-integer input
