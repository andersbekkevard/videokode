# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview


This repo contains Java code examples for the TDT4100 course videos. The code serves as either:
- live-coded walkthroughs in the videos, or
- prepared examples for explanation, debugging, or stepwise refactoring.

## Coding guidelines
- Prefer clarity over cleverness. Pedagogy > performance.
- Make sure you never introduce concepts that havent already been introduced when writing code. that is, if you are in p3_mer_om_java, the viewers havent been introduced to p6_funksjonell_programmering, and cant for example use Streams

## Build and Development Commands

**Build the project:**
```bash
mvn clean install
```

**Run tests:**
```bash
mvn test
```

**Run a specific class:**
```bash
mvn exec:java -Dexec.mainClass="packagename.ClassName"
```

**Generate test coverage report:**
```bash
mvn jacoco:report
```

## Architecture and Structure

The codebase is organized into progressive learning modules under `src/main/java/`:

- **p0_oppsett/**: Setup and environment basics
- **p1_intro_java/**: Java fundamentals (datatypes, loops, methods)
- **p2_intro_oop/**: Object-oriented programming basics (classes, encapsulation)
- **p3_mer_om_java/**: Advanced Java concepts (collections, testing)
- **p4_relasjoner/**: Relationships (associations, inheritance, diagrams)
- **p5_abstraksjon/**: Abstraction (abstract classes, interfaces)
- **p6_funksjonell_programmering/**: Functional programming (lambdas, streams)
- **p7_oop_teknikker/**: OOP techniques (delegation, observer pattern)
- **p8_io/**: Input/Output operations
- **p9_misc/**: Miscellaneous topics (optionals, records, varargs)

## Key Technical Details

- **Java Version**: 21
- **Build Tool**: Maven
- **Testing**: JUnit 5 + Mockito + AssertJ
- **Test Coverage**: JaCoCo plugin configured
- **Project Structure**: Educational modules with theory and practical examples

## Development Notes

- Each module contains `Teori.java` files with theoretical explanations
- Many classes contain main methods for standalone testing/demonstration
- The project uses Java 21 features and modern testing frameworks
- Code examples are designed for learning progression from basic to advanced concepts
- Test files are located in `src/test/java/` with corresponding package structure