# Functional Programming Foundations in Java (with jqwik)

Welcome to my **Java Functional Programming (FP) Exploration Repository**. This project bridges the gap between object-oriented Java and pure functional paradigms. I developed and uploaded this codebase to demonstrate my active learning journey, algorithmic thinking, and structural problem-solving with advanced functional design patterns.

---

## 💡 The Philosophy: Active Learning & Structural Paradigm Shifts

* **An Active Learning Journey:** This repository represents a personal deep dive into thinking declaratively within a traditionally imperative language. It is a playground for continuous growth.
* **Intentionally Work-in-Progress:** The focus here is on grasping deep computational paradigms (like currying and custom recursion mechanisms) from scratch. Some sections reflect evolutionary steps of my learning curve rather than hyper-optimized production code.
* **Property-Based Testing Focus:** Rather than just writing basic unit tests, this repository leverages **jqwik** to stress-test mathematical and recursive edge cases using property-based verification.

---

## 📂 Repository Structure & Key Components

The codebase is organized into highly focused packages within `src/main/java/` and thoroughly validated under `src/test/java/`:

### 🧩 Currying & Function Design (`main/.../currying`)
* **`Composition`** – Exploring function pipelines, chaining behavioral transformations, and building complex operations by combining pure, smaller functions.
* **`Function` & `Functions`** – Custom structural abstractions mimicking functional-first signatures, studying how methods behave when treated as first-class citizens.
* **`Operators`** – Implementing functional operators to bypass rigid imperative structures.
* **`Examples`** – Real-world applications and sandboxes for demonstrating functional code flow in daily scenarios.

### 🔄 Advanced Recursion (`main/.../recursion`)
* **`Methods`** – Moving completely away from imperative loops (`for`, `while`) toward pure structural recursion, tail calls, and state accumulation patterns.

### 🧪 Property-Based & Unit Testing (`test/...`)
* **`currying/`** – Validation suites ensuring mathematical consistency across curried function spaces.
* **`recursion/`** – A robust battery of recursive algorithm test cases, including:
  * **`AddTest`** – Recursive addition paradigms.
  * **`BinomTest`** – Computing binomial coefficients over structural layers.
  * **`CollatzTest`** – Testing convergence properties of the 3n+1 sequence.
  * **`FactTest` / `FibTest`** – Classic factorial and Fibonacci benchmarks under functional evaluation.
  * **`GgtTest`** – Determining the Greatest Common Divisor (GCD / Größter gemeinsamer Teiler) through recursive steps.

---

## 🧠 Core Paradigms & Engineering Principles Demonstrated

By building out this template, I have trained myself to think outside standard imperative patterns:

1. **Currying & Partial Application:** Breaking down multi-argument functions into single-argument chains, enabling highly reusable API design and delayed configuration injection.
2. **Elimination of Loop States:** Replacing mutable index loops with pure recursion, ensuring code leaves zero room for off-by-one errors or side effects.
3. **Property-Based Validation:** Using modern testing frameworks (`jqwik`) to auto-generate a massive matrix of variable inputs, exposing logical edge cases that traditional static unit tests easily miss.

---

*Feel free to browse through the implementation and test suites to see how I approach declarative engineering principles within a Java ecosystem!*
