# Builder Practice Notes

Reference: https://refactoring.guru/design-patterns/builder

## Problem

The problem package has a `Booking` class with a long constructor. The caller must remember the order and meaning of many values.

Run `BuilderProblemDemo` and notice that:

- The family vacation is readable only after you inspect the constructor signature.
- The budget trip has invalid combinations.
- The object is still created even when the options do not make sense together.
- Adding another option would make the constructor even longer.

## Identify This Problem

Think about Builder when:

- Constructors have too many parameters.
- Many constructor parameters are optional.
- Boolean and string parameters make calls hard to read.
- Some combinations of fields are invalid.
- Construction should happen step by step.

Builder is especially useful when the final object should be immutable, but construction needs a readable setup phase.

## Pattern That Solves It

Builder solves this by separating construction steps from the final object.

The pattern should:

- The object should be assembled step by step.
- The final build step can validate combinations.
- The caller should read like a clear configuration, not a list of mystery values.

## Your Solution Goal

Implement the solution package yourself.

Try to create:

- A booking object.
- A builder object with named steps.
- Validation before the final object is returned.
- A demo that is easier to read than the long constructor.
