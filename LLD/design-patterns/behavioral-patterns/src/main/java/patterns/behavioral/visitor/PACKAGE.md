# Visitor Practice Notes

Reference: https://refactoring.guru/design-patterns/visitor

## Problem

The problem package exports document nodes by checking each concrete node type.

## Identify This Problem

Think about Visitor when you need to add operations to a stable object structure without stuffing those operations into the element classes.

## Pattern That Solves It

Visitor moves operations into visitor objects and lets elements accept the visitor.

## Your Solution Goal

Create document elements with `accept` methods and visitors for operations such as Markdown export.
