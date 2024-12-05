# Java Application with Maven

This project demonstrates creating a Java application using Maven with a custom package (`matops`) and a main class (`Maven_demo`).

---

## Prerequisites

Ensure the following are installed:
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Maven**: The Maven command-line tool is included in the project.

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
Run the Maven `archetype:generate` command to initialize the project:
```bash
mvn archetype:generate -DgroupId=com.matops -DartifactId=matops-application -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### Step 3: Verify Generated Structure
The `archetype:generate` task generates the following structure:
```
matops_application/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── matops/
    │               └── Maven_demo.java
    └── test/
        └── java/
            └── com/
                └── matops/
                    └── Maven_demoTest.java
```

---

## Key Generated Files

### `pom.xml`
This file specifies the project configuration, dependencies, and the application's entry point:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.matops</groupId>
  <artifactId>matops-application</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>

  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
</project>
```

---

### Main Class: `Maven_demo.java`
This is the main class of the application:
```java
package com.matops;

public class Maven_demo {

    // Method that returns a greeting message
    public String getGreeting() {
        return "Hello Maven world.";
    }

    // Entry point of the application
    public static void main(String[] args) {
        Maven_demo maven_demo_obj = new Maven_demo();
        System.out.println(maven_demo_obj.getGreeting());
    }
}
```

---

### Test Class: `Maven_demoTest.java`
This class contains a simple test for the application:
```java
package com.matops;

import org.junit.Test;
import static org.junit.Assert.*;

public class Maven_demoTest {

    @Test
    public void testAppHasAGreeting() {
        Maven_demo classUnderTest = new Maven_demo();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
```

---

## Build and Run the Application

### 1. Build the Project
To compile, test, and build the project, run:
```bash
mvn package
```

### 2. Run the Application
Use the `exec:java` plugin to execute the `main` method:
```bash
mvn exec:java -Dexec.mainClass="com.matops.Maven_demo"
```
**Output**:
```
Hello Maven world.
```

---

## Additional Commands

### List Available Goals
To view all available goals, run:
```bash
mvn help:describe
```

### Clean Build Artifacts
To remove all generated build outputs:
```bash
mvn clean
```

---

## Notes
- On the first build, Maven will download dependencies and tools, caching them locally.
- The source package name is `com.matops`, and the main class is `Maven_demo`.
- Modify the `pom.xml` file to customize dependencies and configurations as needed.

---

## Reference
- [Maven Java Application](https://maven.apache.org/guides/getting-started/)
- For detailed commands, see the [Commands Guide](Commands_Guide.md).

---

This `README.md` provides an overview of creating and managing a Maven project for a Java application with the custom package `com.matops`.