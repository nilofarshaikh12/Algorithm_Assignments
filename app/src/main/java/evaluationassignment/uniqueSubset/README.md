
# Unique Subset Generator

- This Java program generates **all unique subsets** (the power set) of a given array, even if the array contains **duplicate elements**.
---
## 📘 What It Does

- Accepts an array of integers (may contain duplicates).
- Generates **all possible subsets** (including the empty set).
- Ensures **no duplicate subsets** are included in the output.
---
## 📂 Package Structure

```

evaluationassignment
└── uniqueSubset
└── UniqueSubset.java

```
---

## 🧠 How It Works

1. **Start with an empty subset**: `[]`
2. For each element in the array:
   - Clone all existing subsets and add the current element to them.
   - Only add the new subset if it doesn’t already exist (to prevent duplicates).
3. Return the list of all unique subsets.

⚠️ The array is **sorted before processing** to help with detecting duplicates.

---

## 🧾 Sample Input/Output

```

Enter size of array:
3
Enter elements in array:
1 2 2

Output:
[]
[1]
[2]
[1, 2]
[2, 2]
[1, 2, 2]

````
---

## 🧑‍💻 How to Run

1. Open your terminal or any Java IDE.
2. Compile the program:
   ```bash
   javac UniqueSubset.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.uniqueSubset.UniqueSubset
   ```
