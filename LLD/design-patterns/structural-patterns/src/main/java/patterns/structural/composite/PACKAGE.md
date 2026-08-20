# Composite Practice Notes

Reference: https://refactoring.guru/design-patterns/composite

## Problem

The problem package calculates file tree size by checking whether each node is a file or folder.

## Identify This Problem

Think about Composite when:

- Objects form a tree.
- Leaf and group objects should be used through one abstraction.
- Client code has repeated type checks for single item versus collection.

## Pattern That Solves It

Composite lets clients treat individual objects and groups uniformly.

## Your Solution Goal

Create one file-system component abstraction implemented by both files and folders.
