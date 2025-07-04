# Problem A - United We Stand

[Link to Problem](https://codeforces.com/problemset/problem/1656/A)

## Problem Statement

Given an array `a` of length `n`, split it into two **non-empty** arrays `b` and `c` such that:

- For all elements `bi` in `b` and `cj` in `c`, `cj` does **not divide** `bi`.

If no such split exists, output `-1`.

## Input

- Number of test cases `t` (1 ≤ t ≤ 500)
- For each test case:
  - Integer `n` (2 ≤ n ≤ 100)
  - Array `a` of `n` integers (1 ≤ ai ≤ 10^9)

## Output

- `-1` if no valid partition exists.
- Otherwise:
  - First line: sizes `lb lc`
  - Second line: array `b`
  - Third line: array `c`

#