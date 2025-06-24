
# Even Distinct Subset Counter

- This Java program counts the number of **non-empty subsets** that can be formed using **distinct even elements** from a given array.
---
## 📘 What It Does

- Identifies all **even** numbers in the array.
- Filters out **duplicates** using a `Set`.
- Calculates the number of **non-empty subsets** using the formula:  
```

2^k - 1

```
- where `k` is the count of distinct even elements.
---
## 📂 Package Structure

```

evaluationassignment
└── evenDistinctSubset
└── EvenDistinctSubset.java

```
---
## ✅ Key Logic

- Uses a `HashSet` to store **distinct even elements**.
- Converts that set into a list.
- Applies the power set formula to compute number of non-empty subsets.
---
## 📌 Formula Used

If you have `k` distinct elements, then:
```

Number of non-empty subsets = 2^k - 1

```
---
## 🧾 Sample Input/Output

```

Enter size of array:
6
Enter elements in array:
2 4 6 4 2 3
Count of even subsets:7

````

💡 Explanation:  
Distinct even elements = [2, 4, 6] → k = 3  
`2^3 - 1 = 8 - 1 = 7` subsets

---
---
## 🧑‍💻 How to Run

1. Open a terminal or IDE.
2. Compile the program:
   ```bash
   javac EvenDistinctSubset.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.evenDistinctSubset.EvenDistinctSubset
   ```
