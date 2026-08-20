# Prototype Practice Notes

Reference: https://refactoring.guru/design-patterns/prototype

## Problem

The problem package has a reusable report template. The client tries to create a similar report by manually copying visible fields.

Run `PrototypeProblemDemo` and notice that:

- The copy misses audit tags.
- The copy shares the same chart settings object as the original.
- Changing the copy's chart currency also changes the original.
- The copy logic depends on knowing details of the concrete report class.

## Identify This Problem

Think about Prototype when:

- You need a new object that starts as a copy of an existing object.
- Manual copy logic is duplicated in client code.
- Some important state is private or easy to forget.
- The object contains nested mutable objects.
- Client code knows too much about the concrete class while copying.

Prototype is a strong fit when copying is part of the object's responsibility.

## Pattern That Solves It

Prototype solves this by letting objects copy themselves through a shared cloning/copying abstraction.

The pattern should:

- The prototype object knows how to copy itself.
- The client should not manually reconstruct every field.
- Deep copy versus shallow copy should be a conscious design decision.

## Your Solution Goal

Implement the solution package yourself.

Try to create:

- A prototype abstraction.
- Concrete objects that can copy themselves.
- A safe copy of nested mutable objects.
- A demo where changing the copy does not damage the original.
