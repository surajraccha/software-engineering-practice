# Command Practice Notes

Reference: https://refactoring.guru/design-patterns/command

## Problem

The problem package handles editor actions through button names and conditionals.

## Identify This Problem

Think about Command when requests should become objects that can be passed, queued, logged, delayed, or undone.

## Pattern That Solves It

Command wraps a request and its data into a stand-alone object with an execution method.

## Your Solution Goal

Create command objects for typing, clearing, and printing editor content.
