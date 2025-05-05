# S01.08 - Java Lambdas & Functional Programming

---

# 🎯 Objectives

- Learn how to use **Java Lambdas** and **Streams**.
- Apply **functional programming** concepts in Java.
- Practice creating and using **Functional Interfaces**.
- Use lambdas and method references to manipulate and filter data.

---

## 🔹 Level 1

### 📘 Exercise 1 - Strings Containing 'o'

Given a list of strings, write a method that returns a list of all strings that contain the letter `'o'`. Print the result.

---

### 📘 Exercise 2 - Strings with 'o' and Length > 5

Modify the previous method to return only the strings that contain `'o'` **and** have more than 5 characters. Print the result.

---

### 📘 Exercise 3 - Print Months Using Lambda

Create a list with the names of the months of the year. Print all elements of the list using a **lambda expression**.

---

### 📘 Exercise 4 - Print Months Using Method Reference

Repeat the previous exercise, but now use a **method reference** to print each element.

---

### 📘 Exercise 5 - Functional Interface for Pi

Create a **Functional Interface** with a method named `getPiValue()` that returns a `double`. In the `main()` method of your `Principal` class, instantiate the interface and assign the value `3.1415`. Invoke `getPiValue()` and print the result.

---

### 📘 Exercise 6 - Sort Mixed List by String Length (Ascending)

Create a list containing both numbers and text strings. Sort the list by string length, from shortest to longest.

---

### 📘 Exercise 7 - Sort Mixed List by String Length (Descending)

Using the same list from the previous exercise, now sort it in **reverse order**, from longest to shortest string.

---

### 📘 Exercise 8 - Reverse String with Lambda

Create a **Functional Interface** with a method named `reverse()` that receives and returns a `String`. In the `main()` method, implement the body of the method using a **lambda** so that it returns the reversed string. Invoke the method and check the result.

---

## 🔹 Level 2

### 📘 Exercise 1 - Filter Names Starting with 'A'

Create a list of names. Write a method that returns a list of all names that **start with 'A'** (uppercase) and have exactly **3 letters**. Print the result.

---

### 📘 Exercise 2 - Tag Numbers by Parity

Write a method that returns a comma-separated string from a list of integers. Each element should be prefixed with:
- `"e"` if the number is even.
- `"o"` if the number is odd.

Example:
Input: `(3, 55, 44)`  
Output: `"o3, o55, e44"`

---

### 📘 Exercise 3 - Math Operations with Functional Interface

Create a **Functional Interface** with a method called `operation()` that returns a `float`. Implement it using a **lambda** for four basic operations: addition, subtraction, multiplication, and division.

---

### 📘 Exercise 4 - Manipulating Mixed Content List

Create a list that contains both strings and numbers. Perform the following operations:

1. Sort alphabetically by the **first character** (`charAt(0)`).
2. Place all strings that contain `"e"` **before** the others (write the condition inside the lambda).
3. Replace all occurrences of `'a'` with `'4'`.
4. Show only elements that are **numeric**, even if stored as strings.

---

## 🔹 Level 3

### 📘 Exercise 1 - Working with Students

Create a class `Student` with the attributes: `name`, `age`, `course`, and `grade`.

1. Fill a list with **10 students**.
2. Print each student's name and age.
3. Filter and store students whose names start with `'a'` in a new list, and print the new list.
4. Filter and print students who have a **grade >= 5**.
5. Filter and print students who have **grade >= 5** and are **not enrolled in PHP**.
6. Show all students who study **JAVA** and are **adults** (age >= 18).

---

# 🛠️ Technologies Used

- Java 21
- Java 8+ Lambdas and Streams API
- Functional Interfaces
- Maven

---

## ⚙️ Installation & Execution

### 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- Maven
- Eclipse or IntelliJ IDEA
- Git

---

### 🛠️ Installation

1. Make sure **JDK 21** or higher is installed.
2. Clone this repository:
   ```sh
   git clone <👉 https://github.com/DiegoBalaguer/S0108-Lambdas.git>
   ```
3. Open the project with your preferred IDE (Eclipse or IntelliJ).
4. Build the project with Maven:
   ```sh
   mvn clean install
   ```

---

### ▶️ Execution

1. From your IDE:
   - Open the `main()` method in the `Principal` class or any exercise class.
   - Run the file directly using your IDE's run configuration.

2. (Optional) From the command line:
   ```sh
   mvn exec:java -Dexec.mainClass="package.name.Principal"
   ```

---

# 🌐 Deployment

This project is for **educational purposes** and is intended for **local development only**. No deployment or external environment is required.

---

## 📦 Repository

You can find the full source code on GitHub:
🔗 👉 https://github.com/DiegoBalaguer/S0108-Lambdas.git

---

## ✅ Author Notes

These exercises are designed to give you practical experience with Java annotations, inheritance, and reflection, while integrating real-world tools like Jackson for serialization.

Feel free to explore, modify, and expand upon the base code!

Happy coding! 🚀
