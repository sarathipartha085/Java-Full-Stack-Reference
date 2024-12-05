# Java Application with Gradle

This project demonstrates creating a Java application using Gradle's Build Init plugin with a custom package (`matops`) and a main class (`Gradlew_demo`). 

---

## Prerequisites
Ensure the following are installed:
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Gradle**: The Gradle Wrapper (`gradlew`) is included in the project.

For detailed instructions on how to set up the required tools, see the [Prerequisites Guide](Prerequirements.md).

---

## Steps to Create the Project

### Step 1: Create a New Directory
Create and navigate to a directory for the project:
```bash
mkdir matops_application
cd matops_application
```

### Step 2: Initialize the Project
Run the Gradle `init` command:
```bash
gradle init
```

### Step 3: Choose Project Configuration
During initialization, make the following selections:
1. **Project Type**: `application`
2. **Implementation Language**: `Java`
3. **Build Script DSL**: `Groovy`
4. **Testing Framework**: `JUnit 4`
5. **Project Name**: Press Enter for default (`matops_application`).
6. **Source Package**: Type `matops` and press Enter.

### Step 4: Verify Generated Structure
The `init` task generates the following structure:
```
matops_application/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
└── src/
    ├── main/
    │   └── java/
    │       └── matops/
    │           └── Gradlew_demo.java
    └── test/
        └── java/
            └── matops/
                └── Gradlew_demoTest.java
```

---

## Key Generated Files

### `build.gradle`
This file specifies the project plugins, repositories, dependencies, and the application's entry point:
```groovy
plugins {
    id 'java'
    id 'application'
}

repositories {
    jcenter()
}

dependencies {
    implementation 'com.google.guava:guava:27.1-jre'
    testImplementation 'junit:junit:4.12'
}

application {
    mainClassName = 'matops.Gradlew_demo'
}
```

---

### Main Class: `Gradlew_demo.java`
This is the main class of the application:
```java
package matops;

// Main class in the matops package
public class Gradlew_demo {

    // Method that returns a greeting message
    public String getGreeting() {
        return "Hello Gradle world.";
    }

    // Entry point of the application
    public static void main(String[] args) {
        // Creating an instance of the Gradlew_demo class
        Gradlew_demo gradlew_demo_obj = new Gradlew_demo();
        
        // Calling the getGreeting method and printing its return value
        System.out.println(gradlew_demo_obj.getGreeting());
    }
}

```

---

### Test Class: `Gradlew_demoTest.java`
This class contains a simple test for the application:
```java
package matops; // Declares the package name to group related classes

// Import necessary classes for unit testing
import org.junit.Test; // JUnit's annotation to denote test methods
import static org.junit.Assert.*; // Static import for assertion methods like assertNotNull

// Test class for Gradlew_demo
public class Gradlew_demoTest {

    // Test method to verify the getGreeting method
    @Test // Annotation to indicate this is a test case
    public void testAppHasAGreeting() {
        // Create an instance of the class under test
        Gradlew_demo classUnderTest = new Gradlew_demo();
        
        // Check that the getGreeting() method does not return null
        // If the result is null, the test will fail with the specified message
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}

```

---

## Build and Run the Application

### 1. Build the Project
To compile, test, and build the project, run:
```bash
./gradlew build
```

### 2. Run the Application
Use the `run` task to execute the `main` method:
```bash
./gradlew run
```
**Output**:
```
Hello Gradle world.
```

---

## Additional Commands

### List Available Tasks
To view all available tasks, run:
```bash
./gradlew tasks
```

### Clean Build Artifacts
To remove all generated build outputs:
```bash
./gradlew clean
```

---

## Notes
- On the first build, Gradle will download dependencies and tools, caching them locally.
- The source package name is `matops`, and the main class is `Gradlew_demo`.
- Modify the `build.gradle` file to customize dependencies and configurations as needed.

---

For detailed commands, see the [Commands Guide](Command_Guide.md).
