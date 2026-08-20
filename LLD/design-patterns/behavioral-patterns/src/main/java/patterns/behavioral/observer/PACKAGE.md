# Observer Practice Notes

Reference: https://refactoring.guru/design-patterns/observer

## Problem

The problem package hard-codes email, inventory, and analytics side effects inside order placement.

## Identify This Problem

Think about Observer when one event should notify many interested objects without the subject knowing all of them.

## Pattern That Solves It

Observer lets listeners subscribe to events and be notified when the subject changes.

## Your Solution Goal

Create an order subject and observers for email, inventory, and analytics.
