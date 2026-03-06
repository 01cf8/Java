# Java Educational Workspace

## Project Overview
This repository is an educational workspace dedicated to learning and practicing Java programming concepts. It contains a large collection of standalone Java programs categorized by topics, school grade levels, and exam preparation. 

The project structure is organized into various directories focusing on specific programming paradigms:
- **Core Concepts:** Categorized by topic in folders like `Java Arrays for School`, `Java Contitional Statements for School`, `Java Functions for School`, `Java Loops for School`, and `Java Strings for School`.
- **Advanced & General Concepts:** Broader Java principles covered in `Java Concepts` and general practice in `Java Miscellaneous`.
- **Number Theory & Algorithms:** Programs determining specific number properties (e.g., Adam, Amicable, Armstrong, Spy, Fibonacci) found in the `Number` directory and various school prep folders.
- **Projects & GUI:** Standalone applications like the `Flappy Bird` game.
- **School & Exam Prep:** Folders specifically tailored for academic study, such as `Class 11 Self`, `School Programs`, `Specimen 2024`, and `UT1 2024`.
- **Reference Materials:** The `Java Notes` directory contains PDFs, cheat sheets, and other study materials.

There are no complex frameworks or dependencies; this is a pure vanilla Java educational repository.

## Building and Running
As a collection of standalone educational scripts, this workspace does not use a centralized build system (like Maven or Gradle). 

To build and run an individual Java program, use the standard Java Development Kit (JDK) command-line tools.

1. **Compile a Java file:**
   Navigate to the repository root and use the `javac` command, providing the path to the specific `.java` file.
   ```bash
   javac "Class 11 Self/adamNumber.java"
   ```

2. **Run the compiled class:**
   Use the `java` command, specifying the directory containing the compiled `.class` file as the classpath (`-cp`) and the class name.
   ```bash
   java -cp "Class 11 Self" adamNumber
   ```

## Development Conventions
- **Standalone Files:** Each `.java` file typically contains a single class with its own `main` method to demonstrate a specific concept.
- **Input/Output:** Programs predominantly use `java.util.Scanner` for command-line input and `System.out.println` for output.
- **Naming Conventions:** Class and file names generally use a mix of PascalCase and camelCase (e.g., `FileHandling.java`, `adamNumber.java`). Ensure the class name inside the file matches the filename.
- **Testing:** There is no automated testing framework (like JUnit) established. Programs are tested manually by running them and providing input via standard input (stdin).
