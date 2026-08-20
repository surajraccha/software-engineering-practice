# Singleton Practice Notes

Reference: https://refactoring.guru/design-patterns/singleton

## Problem

The problem package has a `ConfigManagerProblem` class with a public constructor. Any caller can create a new config manager, so different parts of the app can accidentally read different configuration values.

Run `SingletonProblemDemo` and notice that:

- Startup code changes the environment to `production`.
- Billing code creates another config manager.
- Billing still sees `local`.
- The two objects have different identities.

## Identify This Problem

Think about Singleton when:

- The class represents one shared resource or shared state.
- Multiple instances would create incorrect or confusing behavior.
- Callers should not freely use `new`.
- There should be one controlled access point.

Do not jump to Singleton just because an object is used in many places. First ask whether multiple instances are truly wrong.

## Pattern That Solves It

Singleton solves this by controlling object creation inside the class itself.

The pattern should:

- Hide direct construction.
- Store the single instance.
- Return the same instance whenever callers ask for it.
- Keep shared state consistent across the application.

## Your Solution Goal

Implement the solution package yourself.

Try to make it so:

- Direct construction is not allowed.
- Calling code can request the config manager.
- All callers receive the same instance.
- The demo can prove both variables point to the same object.
