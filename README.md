# ParaBank Selenium Automation Tests

A clean, well-structured Selenium WebDriver automation framework for testing the ParaBank application.

## 🚀 Quick Start

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- Chrome browser

### Run Tests
```bash
mvn clean test
```

## 📁 Project Structure

```
src/test/java/
├── parabank.base/          # Core base classes
│   ├── BasePage.java       # Page Object Model base with common WebDriver operations
│   └── BaseTest.java       # Test base with setup/teardown hooks
├── parabank.driver/        # WebDriver management
│   └── DriverFactory.java  # ChromeDriver setup with WebDriverManager
├── parabank.pages/         # Page Object Models
│   ├── LoginPage.java      # Login page interactions
│   └── RegisterPage.java   # Registration page interactions
├── parabank.tests/         # Test classes
│   ├── LoginTest.java      # Login functionality tests
│   └── RegisterTest.java   # Registration tests
├── parabank.utils/         # Test utilities
│   ├── Retry.java          # Test retry logic implementation
│   └── RetryListener.java  # TestNG retry listener
└── resources/
    └── testng.xml          # TestNG configuration
```

## 🛠️ IDE Configuration

### Cursor/VS Code Setup
If you see red error indicators on Java files, refresh your IDE:

**Command Palette** (`Ctrl+Shift+P`):
1. `Java: Reload Projects`
2. `Maven: Update Project`
3. `Java: Clean Java Language Server Workspace`

### Alternative Fix
1. **File** → **Close Folder**
2. **File** → **Open Folder** → Select project folder

## 🔧 Maven Dependencies

- **Selenium WebDriver 4.15.0** - Browser automation
- **TestNG 7.8.0** - Testing framework
- **WebDriverManager 5.5.3** - Automatic driver management

## 🧪 Test Execution

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=LoginTest
```

### Run with Custom TestNG XML
```bash
mvn test -DsuiteXmlFile=src/test/java/resources/testng.xml
```

## 📊 Test Results

Tests run automatically and generate reports in:
- `target/surefire-reports/` - TestNG HTML reports
- `target/test-classes/` - Compiled test classes

## 🏗️ Build & Compile

### Clean Build
```bash
mvn clean compile test-compile
```

### Package Project
```bash
mvn package
```

## 🎯 Key Features

- ✅ **Thread-safe WebDriver** management
- ✅ **Page Object Model** pattern implementation
- ✅ **Automatic retries** for flaky tests
- ✅ **Cross-browser** support (Chrome configured)
- ✅ **Clean package structure** (`parabank.*`)
- ✅ **Maven-based** dependency management

## 🔍 Troubleshooting

### Red Errors in IDE
The Maven build works but IDE shows errors? Refresh your IDE project configuration (see IDE Configuration section above).

### Tests Not Running
- Ensure Chrome browser is installed
- Check Java version: `java -version`
- Verify Maven installation: `mvn -version`

### Import Errors
All imports use the `parabank.*` package structure. If IDE doesn't recognize, refresh the project.

---

**Status**: ✅ Fully functional Selenium automation framework
