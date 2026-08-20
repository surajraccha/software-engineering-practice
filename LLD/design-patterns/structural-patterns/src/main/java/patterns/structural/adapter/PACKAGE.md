# Adapter Practice Notes

Reference: https://refactoring.guru/design-patterns/adapter

## Problem

The problem package has two payment gateways with different method names and parameter shapes.

Run `AdapterProblemDemo` and notice that client code must know whether it is calling `chargeCard` or `sendMoney`.

## Identify This Problem

Think about Adapter when:

- Existing classes have incompatible interfaces.
- You cannot or should not change the old class.
- Client code wants one expected interface.
- Conversion logic is leaking into the client.

## Pattern That Solves It

Adapter solves this by wrapping the incompatible object and translating calls into the interface the client expects.

## Your Solution Goal

Create a common payment abstraction and adapter classes that hide gateway-specific method names.
