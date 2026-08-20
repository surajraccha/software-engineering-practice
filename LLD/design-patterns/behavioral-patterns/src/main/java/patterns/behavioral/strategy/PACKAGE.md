# Strategy Practice Notes

Reference: https://refactoring.guru/design-patterns/strategy

## Problem

The problem package selects shipping cost algorithms through a conditional.

## Identify This Problem

Think about Strategy when several algorithms do the same job and should be interchangeable.

## Pattern That Solves It

Strategy puts each algorithm in its own class behind a common interface.

## Your Solution Goal

Create shipping strategies for standard, express, and pickup cost calculation.
