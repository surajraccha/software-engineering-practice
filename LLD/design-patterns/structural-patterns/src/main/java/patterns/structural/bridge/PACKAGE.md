# Bridge Practice Notes

Reference: https://refactoring.guru/design-patterns/bridge

## Problem

The problem package combines notification urgency and delivery channel in one conditional structure.

## Identify This Problem

Think about Bridge when:

- Two independent dimensions vary.
- Subclasses or conditionals grow as combinations multiply.
- One hierarchy should not be tightly bound to another.

## Pattern That Solves It

Bridge separates abstraction from implementation so both can change independently.

## Your Solution Goal

Create notification abstractions for urgency and separate sender implementations for channels.
