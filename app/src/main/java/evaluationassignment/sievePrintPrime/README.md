
# SievePrintPrime

This Java program prints all prime numbers up to a given limit using the **Sieve of Eratosthenes** algorithm — an efficient way to find primes.

---

## 📂 File Structure

```

evaluationassignment/
└── sievePrintPrime/
├── SievePrintPrime.java
└── README.md

```

---

## 📘 Description

- The program accepts an integer input `n`.
- It prints all prime numbers less than or equal to `n`.
- Internally, it uses a boolean array to eliminate non-prime numbers.

---

## 🧾 Sample Input/Output

### Input:
```

Enter limit:
30

```

### Output:
```

2	3	5	7	11	13	17	19	23	29

````

---

## 🔍 Algorithm: Sieve of Eratosthenes

1. Assume all numbers from `2` to `n` are prime.
2. Starting from the first prime `2`, mark all its multiples as non-prime.
3. Repeat for next unmarked number.
4. The remaining marked numbers are primes.

---

## 🧑‍💻 How to Run

1. Open terminal in the `sievePrintPrime` folder.
2. Compile the code:
   ```bash
   javac SievePrintPrime.java
   ```
3. Run the program:
   ```bash
   java evaluationassignment.sievePrintPrime.SievePrintPrime
   ```
---

## ⚠️ Validations

* If `n <= 1`:

  ```
  There is no prime number for given limit
  ```
