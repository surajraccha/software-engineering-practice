# Spring Practice

[Back to main project](../README.md)

This module is for practicing Spring and Spring Boot application development.

## Topics To Practice

| Topic | What To Add |
| --- | --- |
| Spring Core | Beans, dependency injection, configuration, profiles, and lifecycle. |
| Spring Boot | Starters, auto-configuration, application properties, and executable apps. |
| REST APIs | Controllers, request validation, response models, and exception handling. |
| Persistence | Spring Data JPA, repositories, transactions, migrations, and query methods. |
| Testing | Unit tests, slice tests, integration tests, and test containers where useful. |
| Security | Authentication, authorization, password handling, and endpoint protection. |

## Suggested Structure

Create feature-based packages under `src/main/java`, for example:

```text
com.software.practice.spring.todos
com.software.practice.spring.users
com.software.practice.spring.orders
```

Each package should include a `PACKAGE.md` file with the package purpose, important classes, endpoints, and learning notes.

## Notes

- Keep controller, service, repository, and model responsibilities separate.
- Add tests when adding API behavior.
- Document configuration and environment assumptions near the module that uses them.
