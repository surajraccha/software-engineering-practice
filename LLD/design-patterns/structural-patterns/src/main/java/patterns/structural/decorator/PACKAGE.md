# Decorator Practice Notes

Reference: https://refactoring.guru/design-patterns/decorator

## Problem

The problem package adds tax, discount, and HTML formatting through flags inside one method.

## Identify This Problem

Think about Decorator when:

- Behavior should be added dynamically.
- Many optional combinations create flag-heavy code.
- You want to wrap an object without changing its class.

## Pattern That Solves It

Decorator places extra behavior in wrapper objects that share the same abstraction.

## Your Solution Goal

Create an invoice abstraction and decorators for tax, discount, and formatting.
