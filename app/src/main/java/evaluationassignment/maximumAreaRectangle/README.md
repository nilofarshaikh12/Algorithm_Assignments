
# Maximum Area of Rectangles

This Java program calculates the **maximum area** among a list of rectangles using object-oriented principles.  
It is composed of two classes: `Rectangle` and `MaximumAreaRectangle`.

---

## 📂 Files

```

evaluationassignment/
└── maximumAreaRectangle/
├── Rectangle.java
└── MaximumAreaRectangle.java

```
---

## 📘 Description

- Each rectangle is defined by a **length** and a **breadth**.
- The program:
  - Accepts multiple rectangles as input.
  - Calculates area for each rectangle.
  - Returns the **maximum area** among them.

---

## ✅ Sample Input/Output

```

Enter number of rectangle:
3
Enter length and breadth of rectangle 1 :
4 5
Enter length and breadth of rectangle 2 :
6 2
Enter length and breadth of rectangle 3 :
3 7

Maximum Area:20

````
---

## 🧱 Class Details

### 🔹 Rectangle.java

Represents a rectangle and provides an `area()` method.

---

### 🔹 MaximumAreaRectangle.java

```java
public static int calculateArea(Rectangle[] rect, int n)
```

* Iterates through the array of rectangles.
* Finds the maximum area.

---

## 🧑‍💻 How to Compile & Run

1. Open terminal inside `maximumAreaRectangle` folder.
2. Compile both files:
   ```bash
   javac Rectangle.java MaximumAreaRectangle.java
   ```
3. Run the program:
   ```bash
   java MaximumAreaRectangle
   ```
