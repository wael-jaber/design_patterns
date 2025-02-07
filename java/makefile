# Java Makefile

.PHONY: build test coverage clean

# Build the project
build:
	mvn clean compile

# Run all tests
test:
	mvn test

# Generate code coverage report
coverage:
	mvn clean test jacoco:report
	open target/site/jacoco/index.html  # Automatically open the report

# Clean compiled files
clean:
	mvn clean
