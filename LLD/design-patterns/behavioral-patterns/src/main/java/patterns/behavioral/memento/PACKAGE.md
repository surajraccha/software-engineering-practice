# Memento Practice Notes

Reference: https://refactoring.guru/design-patterns/memento

## Problem

The problem package exposes editor backup state as plain text that outside code can replace incorrectly.

## Identify This Problem

Think about Memento when object state must be saved and restored without exposing internal details.

## Pattern That Solves It

Memento stores snapshots owned by the originator and managed by a caretaker.

## Your Solution Goal

Create an editor snapshot object and undo history without exposing editable internal state.
