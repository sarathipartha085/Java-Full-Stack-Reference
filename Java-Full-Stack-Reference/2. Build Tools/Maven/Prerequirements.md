# Setting Up Gradle with Gradle Wrapper (`gradlew`) on Windows

This guide explains how to set up **Gradle** using the **Gradle Wrapper** (`gradlew`) on a Windows machine.

## Prerequisites

Ensure you have the following installed:

- **Java Development Kit (JDK)**: Gradle requires JDK 11 or higher.

## 1. Install Java Development Kit (JDK)

Gradle requires a compatible version of Java. Follow these steps:

### a. Download JDK
- Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [OpenJDK](https://adoptopenjdk.net/) and download JDK 11 or later.

### b. Install JDK
- Follow the installation instructions for your system.

### c. Verify Java Installation
Open a command prompt and run:
```sh
java -version
```
You should see the installed Java version.

## 2. Set Up Gradle Wrapper

If your project already includes the Gradle wrapper (`gradlew`), skip this section. Otherwise, follow these steps to set it up.

### a. Install Gradle
If you don’t have Gradle installed, download it from the [Gradle Releases](https://gradle.org/releases/) page. Unzip it and set `GRADLE_HOME` to the Gradle directory. Add `%GRADLE_HOME%\bin` to your `PATH`.

### b. Generate Gradle Wrapper
Open a command prompt in your project directory and run:
```sh
gradle wrapper
```
This will generate the necessary wrapper files (`gradlew`, `gradlew.bat`, etc.).

## 3. Running Gradle Wrapper

To verify the setup, open a command prompt in your project’s root directory and run:
```sh
gradlew.bat tasks
```
This should list available tasks for your project, confirming that the wrapper is set up correctly.

## 4. Running Build Tasks with Gradle Wrapper

Now you can use the Gradle wrapper to run build tasks. For example:
```sh
gradlew.bat build
```
The wrapper will automatically download the correct version of Gradle if it's not already downloaded.

## Troubleshooting

- **Gradle Wrapper Not Found**: Ensure you're in the correct project directory containing the wrapper files.
- **JAVA_HOME Issues**: Make sure the `JAVA_HOME` environment variable is set correctly.