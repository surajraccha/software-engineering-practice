# Iterator Practice Notes

Reference: https://refactoring.guru/design-patterns/iterator

## Problem

The problem package makes callers traverse the playlist by index.

## Identify This Problem

Think about Iterator when clients need to traverse a collection without knowing its internal representation.

## Pattern That Solves It

Iterator moves traversal rules into a separate object with a consistent next/has-next style interface.

## Your Solution Goal

Create a playlist iterator that hides whether songs are stored in a list, array, tree, or another structure.
