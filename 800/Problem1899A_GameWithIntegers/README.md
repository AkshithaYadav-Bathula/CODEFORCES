# Problem 1899A - Game with Integers

📄 [Link to Problem](https://codeforces.com/problemset/problem/1899/A)

## Problem Statement
Vanya and Vova play a game. Starting from a number `n`, each can add or subtract 1 on their turn...

✅ Vanya wins if the number is divisible by 3 after **his move**  
❌ If 10 moves pass and that doesn't happen, Vova wins.

## Solution
- If `n % 3 == 0` → Vova wins ("Second")
- Else → Vanya wins ("First")

## Code
See `Problem1899A_GameWithIntegers.java`
