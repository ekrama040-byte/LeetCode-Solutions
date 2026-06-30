# 🌀 Master of Recursion: LeetCode Solutions

Welcome to my advanced algorithmic tracking repository! This space serves as a dedicated showcase of my problem-solving journey in Java, focusing almost exclusively on **Recursion, Backtracking, and Deep Tree Traversals**. 

The primary objective of this repository is to demonstrate my ability to decompose complex global problems into elegant, self-contained recursive subproblems.

---

## 🎯 The Core Philosophy: Recursive Thinking
Every solution in this repository avoids basic iterative loops in favor of building structured recursive engines. By working through these problems, I am mastering:
* **Base Case Mapping:** Pinpointing exact stopping points to prevent stack overflow errors.
* **State Space Backtracking:** Tentatively modifying variable states, diving deeper into the recursion stack, and cleanly restoring states upon dead ends.
* **Pruning & Branch Optimization:** Short-circuiting bad recursive pathways early to achieve maximum efficiency.

---

## 🛠️ Repository Structural Index & Recursive Patterns

The codebase is systematically mapped out. Every folder below relies primarily on recursive logic:

```text
LeetCode-Solutions/
├── 🌀 22-generate-parentheses/                # Pruned Backtracking (Validating open/close balances)
├── 🌀 17-letter-combinations-of-a-phone-number/ # State Space DFS (Recursive combinations of map string matrices)
├── 🌀 78-subsets/                              # Power Set Recursion (The pick/don't-pick decision tree pattern)
├── 🌲 226-invert-binary-tree/                 # Divide and Conquer (Recursive post-order structural swapping)
├── 🌲 1005-univalued-binary-tree/             # Depth-First Search (Recursive leaf-node boolean evaluation)
├── 🔢 1013-fibonacci-number/                  # Pure Mathematical Induction (Simplifying mathematical recurrence relations)
└── 🧵 344-reverse-string/                     # Two-Pointer Recursion (Swapping outer characters recursively)
```

---

## 💡 Algorithmic Highlights & Deep-Dives

### 🪐 Combinatorial Backtracking & State Control
* **Sudoku Solver & Parentheses Engine:** Solved by executing structural trial-and-error routines. The engines systematically push characters onto the processing stack, recursively evaluate the board state, and clear memory frames using Java's `StringBuilder` when pathways collapse.

### 🌲 Recursive Graph & Tree Inversions
* **Tree Traversals:** Designed pointer mutations using recursive tree mechanics. Rather than maintaining tracking lists, the code relies natively on the execution call stack to climb down to individual leaf nodes and pass state transformations upward seamlessly.

---

## 🚀 Performance Rigor

Every recursive implementation is continuously scrutinized for:
1. **Call Stack Analysis:** Managing space complexity by tracking maximum recursion depth bounds ($\mathcal{O}(N)$ or $\mathcal{O}(\text{depth})$).
2. **Clean Branching:** Eliminating duplicate recursive paths through clear short-circuit conditional checks.
