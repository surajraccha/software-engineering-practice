# Flyweight Practice Notes

Reference: https://refactoring.guru/design-patterns/flyweight

## Problem

The problem package creates many map markers that repeat the same type, icon, and color.

## Identify This Problem

Think about Flyweight when:

- Many objects repeat the same immutable data.
- Memory cost grows because every object stores duplicated state.
- You can separate shared intrinsic state from unique extrinsic state.

## Pattern That Solves It

Flyweight shares common state between many lightweight objects.

## Your Solution Goal

Create shared marker style objects and keep only coordinates on each marker.
