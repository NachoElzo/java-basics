## Java Installation in VS Code with Brew

### Install Homebrew

Visit: [https://brew.sh/](https://brew.sh/)

### Install Java (Mac)

Run in terminal: `brew install java`

### Check Java Version

Run in terminal: `java -version`

## Java Installation in VS Code

### Install Java (Mac)

Visit: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)

### Set JAVA_HOME as a System Environment Variable

- Check Java path:
  - `ls /Library/Java/JavaVirtualMachines/`
- Export JAVA_HOME as a system variable:
  - `export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home`
- Check the path in `.zshrc` and add the following if it was not added properly:
  - `export JAVA_HOME=$(/usr/libexec/java_home)`

## Common Steps to Create a Java Project

### Create a New Java Package

- Create a `.java` file in Visual Studio Code inside your project to be recognized by the Java extension.
- Install the Java Extension Pack for Java (recommended by Visual Studio Code).
- Create packages as holders for Java files:
  - Right-click on the Java projects (bottom left options) / in the project folder, select "New Package."
  - Name it in the VS Code palette.
  - The name should be in lower case by convention.
- Create Java files inside your packages (names should start with a capital letter).

### Concepts

- **Package**: Holds Java files.
- **Main method**: The default method in a class and will be the first to be executed.
