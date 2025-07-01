

# 📌 Java Console Programs Assignment
 
A collection of simple Java console applications solving various algorithmic and array/string problems.
 
---
 
## ⚙️ Requirements
 
* **Java 21** (Gradle project)

* **Terminal** or any Java-supported IDE (e.g., Eclipse, IntelliJ IDEA)
 
---
 
## 📂 Project Structure
 
```
└── app
 └── src/
  └── main/
    └── java/
        └── evaluationassignment/
          ├── addMinCharToMakePalindrome/
          ├── alternateMerge/
          ├── anagramString/
          ├── checkPalindromeNumber/
          ├── checkPalindromeString/
          ├── checkPrime/
          ├── checkSubsequence/
          ├── confusedPappu/
          ├── equilibriumPoint/
          ├── evenDistinctSubset/
          ├── fibonacciSeries/
          ├── findFactorial/
          ├── firstAndLastOccurenceOfX/
          ├── goodOrBadString/
          ├── immediateSmallerElement/
          ├── kthSmallestElement/
          ├── maxProductSubarray/
          ├── maximumAreaRectangle/
          ├── missingNumber/
          ├── nthFibonacciNumber/
          ├── pairsWithGivenSum/
          ├── secondLargestElement/
          ├── sievePrintPrime/
          ├── smallestAndSecondSmallest/
          ├── stockBuyAndSell/
          ├── stockBuyAndSell2/
          ├── thirdLargestElement/
          ├── uniqueNoOfOccurences/
          ├── uniqueSubset/
          └── zigzagArray/

```
 
---
 
## ✅ Program List and Descriptions
 
| 📁 Folder Name               | 📄 Program Description                                                                                   |
| ---------------------------- | -------------------------------------------------------------------------------------------------------- |
| `addMinCharToMakePalindrome` | Calculates the **minimum number of characters** to add at the beginning to form a palindrome.            |
| `alternateMerge`             | Merges two strings **alternatively**, character by character.                                            |
| `anagramString`              | Finds the **minimum number of character deletions** to make two strings anagrams.                        |
| `checkPalindromeNumber`      | Checks if a given number is a **palindrome**.                                                            |
| `checkPalindromeString`      | Checks if a given string is a **palindrome** (case-insensitive).                                         |
| `checkPrime`                 | Determines whether a number is **prime**.                                                                |
| `checkSubsequence`           | Checks if one string is a **subsequence** of another.                                                    |
| `confusedPappu`              | Calculates the **difference** between a number and a modified version where all 6s are replaced with 9s. |
| `equilibriumPoint`           | Finds the **equilibrium point** in an array where left and right sums are equal.                         |
| `evenDistinctSubset`         | Calculates the number of **distinct even subsets** in an array.                                          |
| `fibonacciSeries`            | Generates a **Fibonacci series** up to a given limit.                                                    |
| `findFactorial`              | Computes the **factorial** of a number.                                                                  |
| `firstAndLastOccurenceOfX`   | Finds the **first and last occurrence indices** of a value in an array.                                  |
| `goodOrBadString`            | Determines if a string is **Good or Bad** based on vowel/consonant patterns.                             |
| `immediateSmallerElement`    | Replaces each array element with the **next smaller element**, or `-1` if none exists.                   |
| `kthSmallestElement`         | Finds the **k-th smallest element** in an array.                                                         |
| `maxProductSubarray`         | Finds the **maximum product subarray** in a given array.                                                 |
| `maximumAreaRectangle`       | Finds the **maximum area** from an array of rectangles.                                                  |
| `missingNumber`              | Identifies the **missing number** from an array containing `n-1` out of `n` numbers.                     |
| `nthFibonacciNumber`         | Computes the **N-th Fibonacci number**.                                                                  |
| `pairsWithGivenSum`          | Counts **unique pairs** in an array whose sum equals a given value.                                      |
| `secondLargestElement`       | Finds the **second largest** element in an array.                                                        |
| `sievePrintPrime`            | Uses the **Sieve of Eratosthenes** algorithm to list all primes ≤ `n`.                                   |
| `smallestAndSecondSmallest`  | Finds the **smallest** and **second smallest** elements in an array.                                     |
| `stockBuyAndSell`            | Identifies the **days to buy and sell stocks** for maximum profit (multiple intervals).                  |
| `stockBuyAndSell2`           | Calculates the **maximum profit** from stock prices (unlimited transactions allowed).                    |
| `thirdLargestElement`        | Finds the **third largest** element in an array.                                                         |
| `uniqueNoOfOccurences`       | Checks if the **frequency of each element** in the array is **unique**.                                  |
| `uniqueSubset`               | Generates **all unique subsets** of an array.                                                            |
| `zigzagArray`                | Rearranges an array in **zig-zag fashion** (a < b > c < d...).                                           |

---
 
## ⚙️ How to Compile and Run
 
### 📍 Compile
 
From the project root (where `src` folder exists), run:
 
```bash

javac -d bin src/main/java/evaluationassignment/**/*.java

```
 
✅ All compiled `.class` files will be in the `bin` directory.
 
---
 
### 📍 Run
 
Example for running **AnagramString**:
 
```bash

java -cp bin evaluationassignment.anagramString.AnagramString

```
 
🔄 Replace `evaluationassignment.anagramString.AnagramString` with the full package and class name of the program you wish to run.
 
---
 
## 🧪 Additional Information
 
* **Java JDK 8 or higher** recommended

* All programs are standalone—you can compile and run each independently

* Input is console-based

* Basic validation included (e.g., negative sizes, invalid input)
 
---
 
✅ **Tip:** For best experience, open the project in IntelliJ IDEA or Eclipse and run classes directly from the IDE.
 
 
