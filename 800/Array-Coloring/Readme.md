# 🎨 Parity Coloring Problem

This Java program solves the **Parity Coloring** problem from competitive programming. The goal is to determine if an array can be split into two non-empty groups (colored) such that the **sum of each group has the same parity** (even/odd).

## ✅ Problem Statement

Given an array of `n` integers, determine if it is possible to:
- Split elements into two colors (non-empty each),
- Ensure the **sum of elements of both colors has the same parity** (both even or both odd).

## 🧠 Approach

To make two groups have the **same parity**, you need:
- At least **one odd and one even number** in the array.

### Rules
- Only **odd + odd** or **even + even** produce even.
- **odd + even = odd**, i.e., different parities.

### ✔️ Condition

- If the array contains **both odd and even**, answer is `YES`
- Otherwise, answer is `NO`


