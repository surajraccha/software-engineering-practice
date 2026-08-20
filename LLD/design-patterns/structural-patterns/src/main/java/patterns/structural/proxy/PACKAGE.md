# Proxy Practice Notes

Reference: https://refactoring.guru/design-patterns/proxy

## Problem

The problem package creates the expensive report before checking whether the user can access it.

## Identify This Problem

Think about Proxy when:

- Access to another object needs control.
- Creation should be delayed until needed.
- You need logging, caching, permission checks, or lazy loading around a real object.

## Pattern That Solves It

Proxy provides a placeholder with the same interface and controls access to the real object.

## Your Solution Goal

Create a report interface, real report, and proxy that checks access before loading.
