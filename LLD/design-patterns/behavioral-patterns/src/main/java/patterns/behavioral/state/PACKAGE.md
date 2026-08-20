# State Practice Notes

Reference: https://refactoring.guru/design-patterns/state

## Problem

The problem package changes document behavior using state strings and conditionals.

## Identify This Problem

Think about State when an object's behavior changes based on internal state and conditionals keep growing.

## Pattern That Solves It

State moves state-specific behavior into separate state objects.

## Your Solution Goal

Create document state objects for draft, moderation, and published behavior.
