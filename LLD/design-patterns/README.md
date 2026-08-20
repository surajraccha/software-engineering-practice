# Design Patterns

[Back to LLD](../README.md) | [Back to main project](../../README.md)

This module groups design pattern practice by pattern family.

## Pattern Families

| Family | Module | Purpose |
| --- | --- | --- |
| Creational | [creational-patterns](creational-patterns/README.md) | Object creation patterns and construction rules. |
| Structural | [structural-patterns](structural-patterns/README.md) | Object composition patterns and relationship management. |
| Behavioral | [behavioral-patterns](behavioral-patterns/README.md) | Communication, workflow, and responsibility patterns. |

## How To Document Each Pattern

For every pattern, add:

- Intent.
- Problem it solves.
- When to use it.
- When to avoid it.
- Main classes and responsibilities.
- Example flow.
- Pros and cons.
- Related patterns.

## Suggested Package Layout

```text
com.software.practice.patterns.creational.singleton
com.software.practice.patterns.structural.adapter
com.software.practice.patterns.behavioral.strategy
```

Each Java package should include a `PACKAGE.md` file.
