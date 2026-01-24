# -------------------------
# Java Design Patterns
# -------------------------

.PHONY: install build test coverage clean

install:
	mvn dependency:resolve

build:
	mvn clean compile

test:
	mvn test

coverage:
	mvn clean test jacoco:report
	@echo "Coverage report generated at target/site/jacoco/index.html"

clean:
	mvn clean
