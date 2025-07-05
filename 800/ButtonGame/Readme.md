# ButtonGame

This Java program solves a combinatorial game problem where two players, Anna and Katie, press buttons in turns.

## Problem Statement

- Anna can press `a` buttons.
- Katie can press `b` buttons.
- Both can press `c` shared buttons.
- Anna starts first.
- A button can only be pressed once.
- A player loses if she cannot make a move.

## Input

- First line: `t` - number of test cases.
- Each of the next `t` lines: three integers `a`, `b`, `c`.

## Output

For each test case, print:
- `"First"` if Anna wins.
- `"Second"` if Katie wins.

## Logic

- Anna's moves = `a + (c + 1) / 2`
- Katie's moves = `b + c / 2`
- If Anna has more moves → Anna wins.

## How to Run

Compile and run the Java file:

```bash
javac Main.java
java Main
