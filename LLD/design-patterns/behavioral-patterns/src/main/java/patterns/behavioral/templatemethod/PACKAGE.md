# Template Method Practice Notes

Reference: https://refactoring.guru/design-patterns/template-method

## Problem

The problem package repeats the same report export skeleton while changing format-specific steps.

## Identify This Problem

Think about Template Method when several workflows share the same step order but customize some steps.

## Pattern That Solves It

Template Method defines the algorithm skeleton in a base class and lets subclasses override selected steps.

## Your Solution Goal

Create a base exporter with fixed export flow and subclasses for PDF and CSV details.
