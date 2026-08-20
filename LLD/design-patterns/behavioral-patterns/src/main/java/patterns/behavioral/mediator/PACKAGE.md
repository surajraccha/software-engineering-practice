# Mediator Practice Notes

Reference: https://refactoring.guru/design-patterns/mediator

## Problem

The problem package has checkout steps that directly know how other steps should react.

## Identify This Problem

Think about Mediator when many components communicate with each other in tangled ways.

## Pattern That Solves It

Mediator centralizes collaboration rules so components talk through one coordinator.

## Your Solution Goal

Create checkout components that notify a mediator instead of directly changing each other.
