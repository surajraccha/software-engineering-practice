# Chain Of Responsibility Practice Notes

Reference: https://refactoring.guru/design-patterns/chain-of-responsibility

## Problem

The problem package routes support issues through one conditional method that knows every team.

## Identify This Problem

Think about Chain of Responsibility when multiple handlers may process a request and the sender should not know which handler will do it.

## Pattern That Solves It

Chain of Responsibility links handlers together so each handler either processes the request or passes it forward.

## Your Solution Goal

Create handler abstractions and link help desk, billing, and security handlers in a chain.
