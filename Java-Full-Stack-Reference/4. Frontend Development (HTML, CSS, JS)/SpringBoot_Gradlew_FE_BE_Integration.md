# Spring Boot Frontend Integration (HTML, CSS, JS)

This project demonstrates how to integrate a Spring Boot backend with a frontend using HTML, CSS, and JavaScript.

## Project Setup

### 1. **Create a Spring Boot Application**

You can generate the project using [Spring Initializr](https://start.spring.io/) with the following dependencies:
- **Spring Web**: For building web applications.
- **Thymeleaf**: For rendering HTML templates.
- **Spring Boot DevTools**: For easier development with automatic reloads.
  
Alternatively, you can set up the project manually with Gradle as follows:

### 2. **Gradle Configuration**

#### `build.gradle`

Here's the Gradle configuration for your project (`build.gradle`):

```gradle
plugins {
    id 'org.springframework.boot' version '3.0.0' 
    id 'java'
}

group = 'com.matops'
version = '1.0.0'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {

    # add the dependencies
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-devtools'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

test {
    useJUnitPlatform()
}
```

- `spring-boot-starter-web`: Adds Spring MVC capabilities for building web applications.
- `spring-boot-starter-thymeleaf`: Adds support for Thymeleaf templates.
- `spring-boot-devtools`: Enables automatic reloads during development for faster feedback.
  
### 3. **Project Structure**

Your project structure should look like this:

```
src/
 └── main/
      └── java/
           └── com/
                └── matops/
                     └── demo/
                          └── controller/
                               └── HomeController.java
      └── resources/
           ├── static/
           │    ├── css/
           │    │    └── styles.css
           │    ├── js/
           │    │    └── app.js
           │    └── images/
           └── templates/
                └── index.html
```

### 4. **Controller - HomeController.java**

Create a `HomeController.java` class under `com.matops.demo.controller` to handle HTTP requests and pass data to the frontend:

```java
package com.matops.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello from Spring Boot!");
        return "index"; // Thymeleaf will render src/main/resources/templates/index.html
    }
}
```

- The `@Controller` annotation defines the Spring MVC controller.
- The `@GetMapping("/")` maps the root URL to the `home` method.
- `Model` is used to pass dynamic data (`message`) to the Thymeleaf template.

### 5. **Frontend - HTML, CSS, JS**

#### HTML (Thymeleaf Template)

Create an `index.html` file under `src/main/resources/templates`:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Spring Boot Example</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1 th:text="${message}">Welcome to Spring Boot!</h1>
    <script src="/js/app.js"></script>
</body>
</html>
```

- The `th:text` attribute dynamically inserts content passed from the backend (`message`).

#### CSS

Create a `styles.css` file under `src/main/resources/static/css`:

```css
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
}

h1 {
    color: #333;
}
```

#### JavaScript

Create an `app.js` file under `src/main/resources/static/js`:

```javascript
document.addEventListener("DOMContentLoaded", function() {
    document.querySelector("h1").addEventListener("click", function() {
        alert("You clicked the heading!");
    });
});
```

This script adds an event listener to the `<h1>` element to show an alert when clicked.

### 6. **Static Resources**

Static resources like images, CSS, and JS files are served from `src/main/resources/static`. When referenced in HTML, they are accessible directly via the URL path `/css/styles.css`, `/js/app.js`, etc.

### 7. **Run the Application**

To build and run the Spring Boot application using Gradle, execute the following command:

```bash
./gradlew bootRun
```

After the application starts, visit `http://localhost:8080/` in your browser. You should see the homepage with the message "Hello from Spring Boot!" styled by the CSS, and the JavaScript functionality (clicking the heading will trigger an alert).

---

### Notes:
- **AJAX with Spring Boot**: If you want to use AJAX to communicate with the backend, create REST controllers in Spring Boot and use JavaScript's `fetch` or `Axios` for making requests. Refer to the AJAX example in the original explanation.
- **Thymeleaf**: Thymeleaf helps in rendering dynamic content in HTML pages by embedding backend variables directly into the HTML structure.

This setup provides a foundation for building a full-stack application with Spring Boot for the backend and HTML/CSS/JS for the frontend.