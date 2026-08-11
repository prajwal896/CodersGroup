# CodersGroup

Basic Java practice programs covering user input, arrays, and simple date/time logic.

## Stack

- **Language:** Java
- **Tooling:** VS Code with the Java extension (see `.vscode/settings.json`)
- No external dependencies — plain `java.util` / `java.time` from the standard library.

## Structure

```
CodersGroup/
├── First.java    # Reads a name from the console and prints a greeting
├── second.java   # Reads name + age and prints them together
├── third.java    # Reads name + birth year, calculates current age
├── array.java    # Fills a 10-element int array from user input, then prints it
└── fourth.java   # Total cost calculation (items * price); also has a WIP
                   # Solution class for a LeetCode-style "count seniors" problem
```

## Running

Compile and run any file with the standard JDK tools:

```bash
javac First.java
java First
```

Each program prompts for input via `Scanner`, so run it directly in a terminal.

## Notes

- `fourth.java` also contains a `Solution` class sketching out a "count seniors" problem — this part doesn't compile yet (undeclared variables `i` and `number`), it's a work in progress.
- ⚠️ Earlier commits in this repo accidentally included a full portable Git-for-Windows install (~9,500 files, ~100MB) under a `Git/` folder. `.gitignore` now excludes `Git/` going forward, but the old files are still in git history, which bloats clone size. Worth squashing history or starting a fresh repo with just the `.java` files if you want a clean, fast-cloning repo.
