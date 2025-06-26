# Problem 1896A - Jagged Swaps

🔗 [Codeforces Link](https://codeforces.com/problemset/problem/1896/A)

## Problem Summary
You're given a permutation of integers from `1` to `n`.  
You can **swap `a[i]` and `a[i+1]`** **only if**:
- `2 ≤ i ≤ n−1`
- `a[i−1] < a[i] > a[i+1]` (i.e., `a[i]` is a local peak)

Your task is to check whether it's possible to sort the array in increasing order using such operations.

---

## Key Insight
If the **first element is `1`** or the **last element is `n`**, the answer is always **YES**.  
Otherwise, it's **NO**.

---

## Example

### ✅ Input:
2
5
1 3 2 5 4
3
3 1 2

shell
Copy
Edit

### 🟢 Output:
YES
NO

markdown
Copy
Edit

### 📝 Explanation:
- In the first case, `1` is at the start ⇒ always sortable.
- In the second case, `1` is in the middle and `3` is at the start ⇒ not sortable.

---

## Solution Info
- ✅ **Solved on**: 26/06/2025  
- 📚 **Difficulty**: 800  
- 💻 **Language**: Java