# Codeforces Problem: Doremy's Paint

**Problem Link:** [https://codeforces.com/problemset/problem/1886/B](https://codeforces.com/problemset/problem/1886/B)

---

## 🧠 Problem Statement:

You are given a sequence `a` of `n` integers.

In one move, you can choose any **continuous prefix** of the array (possibly the whole array), and **add 1 to each element in the prefix**. You can perform this operation any number of times (possibly 0).

Can you make the array **non-decreasing** after performing some operations?

---

## 📝 Input

- The first line contains a single integer `t` (1 ≤ t ≤ 1000) — the number of test cases.
- The first line of each test case contains an integer `n` (1 ≤ n ≤ 100) — the size of the array.
- The second line contains `n` integers `a_1, a_2, ..., a_n` (0 ≤ a_i ≤ 100).

---

## 📤 Output

For each test case, output **"YES"** if you can make the array non-decreasing, and **"NO"** otherwise.

You may print each letter in any case (for example, "Yes", "yes", "YES", etc.).

---

## 📚 Example

### Input:
3
3
1 2 1
2
2 2
4
1 2 3 2

shell
Copy
Edit

### Output:
YES
YES
NO

yaml
Copy
Edit

---

## ✅ Tags

- Greedy
- Implementation
- Prefix operation

---

## 🛠️ Solution Outline (Write your logic in Java file)

- You may observe that prefix increment doesn't disturb the non-decreasing part.
- Think in terms of **"when will it become impossible to fix?"**
