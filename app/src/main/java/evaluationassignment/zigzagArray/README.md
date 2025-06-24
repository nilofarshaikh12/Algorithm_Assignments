
# Zigzag Array Transformation

- This Java program rearranges a given array into **zigzag fashion** by modifying its elements **in-place**.
---
## 📘 What is a Zigzag Array?

A **zigzag array** is a sequence where the elements follow the pattern:
```

a[0] < a[1] > a[2] < a[3] > a[4] ...

```

In other words:
- At **even indices (0, 2, 4, ...)**, the element should be **less than** the next one.
- At **odd indices (1, 3, 5, ...)**, the element should be **greater than** the next one.

### 🔁 Example:

**Input:**
```

[4, 3, 7, 8, 6, 2, 1]

```

**Output (zigzag form):**
```

3	7	4	8	2	6	1

```
---
## 📂 Package Structure

```

evaluationassignment
└── zigzagArray
└── ZigzagArray.java

```
---
## 🚀 How It Works

1. The user inputs the array size and elements.
2. The program iterates through the array:
   - Swaps elements at even indices if `arr[i] > arr[i+1]`
   - Swaps elements at odd indices if `arr[i] < arr[i+1]`
3. Prints the modified array in zigzag form.
---
## 🧾 Sample Input/Output

```

Enter size of array:
7
Enter elements into array:
4 3 7 8 6 2 1

Output:
3	7	4	8	2	6	1

```
---

## 🧑‍💻 How to Run

1. Open your terminal or IDE.
2. Compile the program:
   ```bash
   javac ZigzagArray.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.zigzagArray.ZigzagArray
   ```
