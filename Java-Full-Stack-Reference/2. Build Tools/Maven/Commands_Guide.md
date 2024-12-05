# Maven Wrapper (`mvnw`) Commands Guide

The Maven Wrapper (`mvnw`) script allows you to execute Maven tasks without requiring Maven to be installed globally. This guide lists commonly used `mvnw` commands and their purposes.

---

## Table of Contents
- [Initialization and Basic Commands](#initialization-and-basic-commands)
- [Build and Execution](#build-and-execution)
- [Testing](#testing)
- [Dependency Management](#dependency-management)
- [Task Management](#task-management)
- [Performance Optimization](#performance-optimization)
- [File Generation](#file-generation)
- [Custom Tasks](#custom-tasks)
- [Miscellaneous](#miscellaneous)
- [Tips for Using Maven Wrapper](#tips-for-using-maven-wrapper)

---

## Initialization and Basic Commands

### `mvnw archetype:generate`
- Initializes a new Maven project using an archetype (template).
- Prompts for group ID, artifact ID, and version details.

### `mvnw wrapper:wrapper`
- Generates or updates the Maven wrapper files (`mvnw`, `mvnw.cmd`, and related files).
- Ensures all developers use the same Maven version as specified in `maven-wrapper.properties`.

---

## Build and Execution

### `mvnw clean`
- Deletes the `target/` directory and all its contents.

### `mvnw install`
- Compiles the code, runs tests, and installs the project artifact (e.g., JAR, WAR) to the local repository.
- Outputs the installed artifact to the `target/` directory.

### `mvnw package`
- Compiles the code and packages the project (e.g., creates a JAR or WAR file).
- Output is stored in `target/`.

### `mvnw compile`
- Compiles the source code but does not run tests or create the final package.

### `mvnw exec:java`
- Executes the Java main class specified in `pom.xml`.

---

## Testing

### `mvnw test`
- Runs all unit tests in the project.
- Outputs test reports to `target/test-classes/`.

### `mvnw test -Dtest=<TestClassName>`
- Runs a specific test class or method.
- Example:
  ```bash
  mvnw test -Dtest=MatopsDemoTest
  ```

---

## Dependency Management

### `mvnw dependency:tree`
- Lists all dependencies in the project in a tree structure.

### `mvnw dependency:analyze`
- Analyzes the project's dependencies to identify unused and declared but missing dependencies.

### `mvnw dependency:resolve`
- Resolves and downloads the project's dependencies.

---

## Task Management

### `mvnw help:help`
- Displays help information for Maven commands and tasks.

### `mvnw help:describe -Dcmd=<task>`
- Provides detailed information about a specific task.
- Example:
  ```bash
  mvnw help:describe -Dcmd=clean
  ```

### `mvnw <task> -X`
- Runs a Maven task with debug output for troubleshooting.

---

## Performance Optimization

### `mvnw -T <threads>`
- Runs tasks in parallel to speed up builds.
- Example:
  ```bash
  mvnw -T 4 clean install
  ```

### `mvnw --offline`
- Runs the build offline, preventing Maven from downloading dependencies from remote repositories.

---

## File Generation

### `mvnw archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
- Generates a new Maven project based on a quickstart archetype.
- Example command to create a new Java application.

---

## Custom Tasks

### Defining a Custom Plugin
In your `pom.xml`, you can define custom Maven plugins to execute specific tasks. For example, adding a `maven-antrun-plugin` to run custom Ant tasks.

### Running a Custom Plugin Task
Use the `mvnw` command to invoke a custom task, such as:
```bash
mvnw antrun:run
```

---

## Miscellaneous

### `mvnw validate`
- Validates the project's structure and configuration without building or compiling it.

### `mvnw help:effective-pom`
- Displays the effective `pom.xml` after merging the project’s `pom.xml` with parent POMs and profiles.

### `mvnw clean deploy`
- Cleans the project and deploys the final artifact to a remote repository.

---

## Tips for Using Maven Wrapper

1. **Default Task**: If no task is specified, Maven runs the default task (often `install`).
2. **Caching**: Maven caches downloaded dependencies in the `.m2/` directory.
3. **Task Chaining**: Combine tasks in a single command:
   ```bash
   mvnw clean install
   ```
4. **First-Time Setup**: The first time you run `mvnw`, it may download the specified Maven version, which could take some time.
5. **Offline Builds**: Use the `--offline` flag if you want to avoid downloading dependencies from remote repositories after the first successful build.
