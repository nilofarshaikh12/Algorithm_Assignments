
# Third Largest Element Finder

- This Java program finds the **third largest distinct element** in an array of integers.
---
## 📘 Problem Description

- Given an array of integers (which may include duplicates), the task is to find the **third largest distinct element**.
- If fewer than three distinct elements exist, return `-1`.

---

## 📂 Package Structure

```

evaluationassignment
└── thirdLargestElement
└── ThirdLargestElement.java

```
---

## 🚀 How It Works

1. Uses a `TreeSet` with **reverse order** to automatically sort and remove duplicates.
2. If the set has fewer than 3 elements, returns `-1`.
3. Otherwise, iterates to retrieve the third distinct largest element.

---

## 📌 Rules

- Duplicates are ignored.
- If fewer than 3 unique elements exist, output an error message.

---

## 🧾 Sample Input/Output

### Example 1:
```

Enter size of array:
6
Enter elements in array:
10 20 20 30 40 50

Output:
Third largest element is:30

```

### Example 2:
```

Enter size of array:
4
Enter elements in array:
5 5 5 5

Output:
Not enough distinct elements to determine the third largest

```
---

## 🧑‍💻 How to Run

1. Open your terminal or IDE.
2. Compile the program:
   ```bash
   javac ThirdLargestElement.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.thirdLargestElement.ThirdLargestElement
   ```
