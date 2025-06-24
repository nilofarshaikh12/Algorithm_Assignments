
# Immediate Smaller Element

- This Java program replaces every element in an array with the **next immediate smaller element**.  
If no such element exists to the right, it replaces it with `-1`.
---
## 📘 Problem Explanation

For each element in the array, compare it with the **next element**:

- If the next element is **smaller**, replace the current element with it.
- If not, replace the current element with `-1`.
- The last element is always replaced with `-1`.

### 🔁 Example:

**Input:**
```

arr = \[4, 2, 1, 5, 3]

```

**Output:**
```

2	1	-1	3	-1

```
---
## 📂 Package Structure

```

evaluationassignment
└── immediateSmallerElement
└── ImmediateSmallerElement.java

```
---
## 🚀 How It Works

1. The user is prompted to enter the size of the array.
2. The user inputs the array elements.
3. The program processes the array and replaces each element according to the rule described.
4. The result is printed as tab-separated values.
---
## 🧾 Sample Input/Output

```

Enter the size:
5
Enter elements:
4 2 1 5 3

Output:
2	1	-1	3	-1

````
---
## 🧑‍💻 How to Run

1. Open terminal or any Java IDE.
2. Compile the program:
   ```bash
   javac ImmediateSmallerElement.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.immediateSmallerElement.ImmediateSmallerElement
   ```
