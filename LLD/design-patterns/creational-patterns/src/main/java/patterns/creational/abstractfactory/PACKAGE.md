# Abstract Factory Practice Notes

Reference: https://refactoring.guru/design-patterns/abstract-factory

## Problem

The problem package uses separate factory-style methods:

- `createButton(platform)`
- `createCheckbox(platform)`
- `createMenu(platform)`

Each method can create one product type. That looks similar to Factory Method practice, but there is a bigger problem here: a screen needs a family of related products that all match the same platform.

Run `AbstractFactoryProblemDemo` and notice that:

- The button can be Mac style.
- The checkbox can be Windows style.
- The menu can be Web style.
- Every object is valid by itself.
- Together, the UI is inconsistent.

## Identify This Problem

Think about Abstract Factory when:

- You need to create multiple related product types.
- Those products must belong to the same variant or family.
- Separate factory methods can still accidentally mix incompatible products.
- Adding a new family should not force changes throughout client code.
- The client should work with abstractions, not concrete family classes.

Factory Method is not enough here because it usually chooses one product type at a time. Abstract Factory groups several factory methods behind one family-level factory.

## Pattern That Solves It

Abstract Factory solves this by giving the client one factory object for a complete family.

The pattern should:

- Declare abstract product types, such as button, checkbox, and menu.
- Declare one factory abstraction that creates all related product types.
- Provide one concrete factory per product family.
- Ensure all products created by that factory match each other.

## Your Solution Goal

Implement the solution package yourself.

Try to create:

- Product abstractions for button, checkbox, and menu.
- Concrete products for each platform.
- One abstract UI factory with creation methods for the whole family.
- One concrete factory per platform.
- A demo where the client receives one factory and cannot mix families accidentally.
