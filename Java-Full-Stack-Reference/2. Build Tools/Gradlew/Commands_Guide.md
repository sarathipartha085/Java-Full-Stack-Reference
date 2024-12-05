# Gradle Wrapper (`gradlew`) Commands Guide

The Gradle Wrapper (`gradlew`) script allows you to execute Gradle tasks without requiring Gradle to be installed globally. This guide lists commonly used `gradlew` commands and their purposes.

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
- [Tips for Using Gradlew](#tips-for-using-gradlew)

---

## Initialization and Basic Commands

### `gradlew init`
- Initializes a new Gradle project in the current directory.
- Prompts for project type (basic, application, library, etc.) and configuration options.

### `gradlew wrapper`
- Generates or updates the Gradle wrapper files (`gradlew`, `gradlew.bat`, and related files).
- Ensures all developers use the same Gradle version as specified in `gradle-wrapper.properties`.

---

## Build and Execution

### `gradlew build`
- Compiles the code, runs tests, and builds the project.
- Outputs results in the `build/` directory.

### `gradlew run`
- Executes the application if the `application` plugin is applied.
- Runs the `main` method specified in `mainClassName` in `build.gradle`.

### `gradlew clean`
- Deletes the `build/` directory and all its contents.

### `gradlew jar`
- Creates a JAR file of the project.
- Output is stored in `build/libs/`.

---

## Testing

### `gradlew test`
- Runs all unit tests in the project.
- Outputs test reports to `build/reports/tests/`.

### `gradlew test --tests "TestClassName"`
- Runs a specific test class or method.
- Example:
  ```bash
  gradlew test --tests "matops.Gradlew_demoTest"
  ```

---

## Dependency Management

### `gradlew dependencies`
- Lists all dependencies in the project in a tree structure.

### `gradlew dependencyInsight --dependency <dependency-name>`
- Provides detailed information about a specific dependency.
- Example:
  ```bash
  gradlew dependencyInsight --dependency guava
  ```

---

## Task Management

### `gradlew tasks`
- Lists all available tasks in the project, grouped by category.

### `gradlew help`
- Displays help information for Gradle commands and tasks.

### `gradlew <task> --info`
- Provides detailed logs while running a task.

### `gradlew <task> --debug`
- Outputs detailed debug logs for troubleshooting issues.

### `gradlew <task> --scan`
- Generates a build scan with detailed analytics and performance insights.

---

## Performance Optimization

### `gradlew --parallel`
- Runs tasks in parallel to speed up builds.

### `gradlew --max-workers=<number>`
- Specifies the maximum number of worker threads for task execution.
- Example:
  ```bash
  gradlew build --max-workers=4
  ```

### `gradlew --daemon`
- Starts the Gradle Daemon for faster builds.

---

## File Generation

### `gradlew init --type java-library`
- Creates a basic Java library project structure.

### `gradlew generateBuildDashboard`
- Generates a dashboard report of the build process.
- Outputs to `build/reports/buildDashboard/`.

---

## Custom Tasks

### Defining a Custom Task
Add the following to `build.gradle`:
```groovy
task hello {
    doLast {
        println 'Hello, Gradle!'
    }
}
```

### Running a Custom Task
Use the `gradlew` command:
```bash
gradlew hello
```

---

## Miscellaneous

### `gradlew properties`
- Displays all project properties, including plugins and dependencies.

### `gradlew buildEnvironment`
- Shows details about the build environment (e.g., Java version, Gradle version).

---

## Tips for Using Gradlew

1. **Default Task**: If no task is specified, Gradle runs the default task (often `build`).
2. **Caching**: Gradle caches dependencies and build outputs in the `.gradle/` directory.
3. **Task Chaining**: Combine tasks in a single command:
   ```bash
   gradlew clean build
   ```
4. **First-Time Setup**: The first time you run `gradlew`, it may download the specified Gradle version, which could take some time.
