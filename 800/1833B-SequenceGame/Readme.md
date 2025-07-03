# 1833B - Sequence Game

Given a sequence `b` derived using a specific rule from an original sequence `a`, construct any valid sequence `a` that Vika could have used.

## Problem Rule

From sequence `a`, sequence `b` is built as:
- b[0] = a[0]
- For i > 0, b[i] is included only if a[i] >= a[i-1]

You are given `b` and must construct a possible `a`, with length between `n` and `2n`.

Constraints:
- 1 ≤ t ≤ 10^4
- 1 ≤ n ≤ 2×10^5 (sum of n across test cases ≤ 2×10^5)
- 1 ≤ b[i] ≤ 10^9
