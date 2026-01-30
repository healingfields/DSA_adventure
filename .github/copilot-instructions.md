# GitHub Copilot instructions — Java (17/21) / Spring

Purpose: Provide code-generation guidelines for solving algorithmic problems in pure Java and for creating Spring apps (Java 17–21).

## General
- Prefer Java 17 LTS; allow Java 21 when using preview/modern features.
- Use clear, idiomatic Java: small methods, descriptive names, minimal side effects.
- Favor immutability and null-safety (Optional over null where appropriate).

## Project type
- Pure Java problems:
  - Single-class solutions for short problems; 
  - Include complexity notes and brief explanation as comment.
  - Provide JUnit 5 unit tests.
- Spring applications:
  - Use Spring Boot (latest compatible with Java version).
  - Default packaging: Maven (pom.xml) unless user requests Gradle.
  - Standard layout under `src/main/java/ma/showmaker/...`.
  - Prefer constructor injection, explicit configuration properties, and simple REST controllers.

## Formatting & style
- Follow Google Java Style or project style; 4-space indent.
- Add minimal Javadoc for public APIs.
- Keep methods < 50 lines when possible.

## Dependencies & tooling
- Use only necessary dependencies; prefer Spring Boot starters.
- Tests: JUnit Jupiter + Mockito (when needed).
- Use Maven wrapper (`mvnw`) for reproducible builds.

## Tests
- Provide unit tests for core logic with clear fixtures.
- For Spring components, include slice tests (@WebMvcTest, @DataJpaTest) and at least one integration test with @SpringBootTest when applicable.

## Error handling & logging
- Validate inputs and fail fast with clear exceptions.
- Use SLF4J logging via LoggerFactory.

## Examples & output
- When asked for solutions, include:
  - Short explanation comment (1–3 lines).
  - Implementation code.
  - Corresponding unit tests.
- Keep responses concise and focused on runnable code.

## Interaction
- Ask clarifying questions when requirements are ambiguous.
- Offer incremental hints for learning-oriented requests; provide full solutions only on request.

## Security & best practices
- Follow security best practices (e.g., input validation, avoiding hardcoded secrets).
- Avoid deprecated APIs and insecure coding patterns. 