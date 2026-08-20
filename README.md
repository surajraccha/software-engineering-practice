# Software Engineering Practice

This repository is the main practice project for learning software engineering topics, implementing examples, writing notes, and preparing work to push to GitHub.

The project is organized as a Maven multi-module workspace so each subject can grow independently while still belonging to one parent project.

## Project Map

| Area | Purpose | Notes |
| --- | --- | --- |
| [Java](Java/README.md) | Core Java practice | Language fundamentals, collections, concurrency, JVM basics, and problem solving. |
| [Spring](Spring/README.md) | Spring ecosystem practice | Spring Boot, REST APIs, dependency injection, persistence, testing, and application structure. |
| [LLD](LLD/README.md) | Low-level design practice | Object-oriented design, SOLID, design patterns, and design exercises. |
| [Design Patterns](LLD/design-patterns/README.md) | Pattern-focused LLD examples | Creational, structural, and behavioral design pattern implementations. |

## How To Use This Repository

1. Pick one topic area from the project map.
2. Read the README for that module.
3. Add code examples under the matching Maven module.
4. Add short notes in that module README or package-level Markdown file.
5. Run the relevant Maven command before committing.
6. Push the completed practice work to GitHub.

## Documentation Rules

Each major level should have its own Markdown file:

- Parent README explains the purpose of that level.
- Child README explains the modules below it.
- Package-level Markdown explains the classes inside that Java package.
- Parent docs should link to child docs.
- Child docs should link back to the parent docs.

## Build

From the repository root:

```bash
mvn clean test
```

To build one module:

```bash
mvn -pl LLD/design-patterns/creational-patterns test
```

## Practice Checklist

- Add a clear example for each concept.
- Add notes explaining why the concept matters.
- Add tests when behavior is important.
- Keep package names consistent.
- Update the nearest README when a new topic or package is added.
