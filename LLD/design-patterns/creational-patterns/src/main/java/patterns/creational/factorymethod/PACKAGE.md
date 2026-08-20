# Factory Method Practice Notes

Reference: https://refactoring.guru/design-patterns/factory-method

## Problem

The problem package has one `LogisticsProblem` class that directly decides which concrete transport class to create.

Run `FactoryMethodProblemDemo` and notice that:

- `scheduleDelivery` contains the creation decision.
- Every transport has different setup methods.
- Adding train, bike, or cargo plane delivery would grow the same conditional chain.
- Business flow and object creation are mixed together.

## Identify This Problem

Think about Factory Method when:

- A workflow needs an object, but should not know the exact concrete class.
- New product types keep adding conditionals in the same creator/client code.
- All created products can share one common abstraction.
- You want subclasses or specialized creators to decide the concrete product.

Factory Method is usually about one product family role, such as `Transport`, `Button`, or `Notification`.

## Pattern That Solves It

Factory Method solves this by moving the concrete creation decision into a factory method.

The pattern should:

- The creator still runs the workflow.
- A factory method supplies the product used inside that workflow.
- New products should not force edits to the central workflow.

## Your Solution Goal

Implement the solution package yourself.

Try to create:

- A common transport abstraction.
- Concrete transport classes.
- A creator abstraction with delivery workflow.
- Concrete creators that choose the transport.
