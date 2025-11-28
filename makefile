# Define subdirectories for each language
SUBDIRS = typescript java python rust go
SUBDIRS_INIT = typescript_init java_init python_init rust_init go_init

# Default target
all: setup

# Setup all subdirectories (install dependencies)
setup: $(SUBDIRS)

# Initialize all directories (only if they do not exist)
init: $(SUBDIRS_INIT)

# Global test script to run all available tests
test:
	@echo "Running all available tests..."
	@$(MAKE) typescript_test
	@$(MAKE) java_test
	@$(MAKE) python_test
	# @$(MAKE) rust_test
	@$(MAKE) go_test
	@echo "All tests completed."

# TypeScript init (inside typescript folder)
typescript_init:
	@if [ ! -d "typescript" ]; then \
		echo "Initializing TypeScript environment in the 'typescript' folder..."; \
		mkdir -p typescript; \
		cd typescript && pnpm init -y; \
		cd typescript && pnpm add -D typescript @types/node @vitest/coverage-istanbul@2.1.8 @vitest/coverage-v8@2.1.8 vitest@^2.1.8; \
		cd typescript && pnpm exec tsc --init; \
		echo "TypeScript Initialization complete in the 'typescript' folder."; \
	else \
		echo "It seems TypeScript is already initialized."; \
	fi

# TypeScript setup (install dependencies)
typescript:
	@echo "Installing TypeScript dependencies..."
	@cd typescript && pnpm install
	@echo "TypeScript dependencies installation completed."

# TypeScript test
typescript_test:
	@echo "Running TypeScript tests..."
	@cd typescript && pnpm test
	@echo "TypeScript tests completed."

# Java init
java_init:
	@if [ ! -d "java" ]; then \
		echo "Initializing Java environment..."; \
		mvn archetype:generate -DgroupId=com.example -DartifactId=java -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false; \
		echo "Java Initialization complete. Please configure pom.xml for Maven."; \
	else \
		echo "It seems Java is already initialized."; \
	fi

# Java setup (install dependencies)
java:
	@echo "Installing Java dependencies..."
	@cd java && mvn install
	@echo "Java dependencies installation completed."

# Java test
java_test:
	@echo "Running Java tests..."
	@cd java && make test
	@echo "Java tests completed."


# Python init
python_init:
	@if [ ! -d "python" ]; then \
		echo "Initializing Python environment..."; \
		mkdir -p python; \
		cd python && python3 -m venv venv && touch requirements.txt; \
		echo "Python Initialization complete. Activate the virtual environment using 'source python/venv/bin/activate'."; \
	else \
		echo "It seems Python is already initialized."; \
	fi

# Python setup (install dependencies)
python:
	@echo "Installing Python dependencies..."
	@cd python && pip install -r requirements.txt
	@echo "Python dependencies installation completed."

# Python test
python_test:
	@echo "Running Python tests..."
	@cd python && pytest
	@echo "Python tests completed."

# Rust init
rust_init:
	@if [ ! -d "rust" ]; then \
		echo "Initializing Rust environment..."; \
		mkdir -p rust; \
		cd rust && cargo init --bin .; \
		echo "Rust Initialization complete."; \
	else \
		echo "It seems Rust is already initialized."; \
	fi

# Rust setup (install dependencies)
rust:
	@echo "Installing Rust dependencies..."
	@echo "Rust dependencies installation completed."

# Rust test
rust_test:
	@echo "Running Rust tests..."
	@cd rust && cargo test
	@echo "Rust tests completed."

# Go init
go_init:
	@if [ ! -d "go" ]; then \
		echo "Initializing Go environment..."; \
		mkdir -p go; \
		cd go && go mod init design-patterns; \
		echo "Go Initialization complete."; \
	else \
		echo "It seems Go is already initialized."; \
	fi

# Go setup (install dependencies)
go:
	@echo "Installing Go dependencies..."
	@echo "Go dependencies installation completed."

# Go test
go_test:
	@echo "Running Go tests..."
	@cd go && go test ./...
	@echo "Go tests completed."

# Help menu
help:
	@echo "Makefile for setting up design patterns sub-repositories:"
	@echo "  make            - Set up all environments (dependencies installation)"
	@echo "  make setup      - Alias for 'make'"
	@echo "  make test       - Run tests for all available languages"
	@echo "  make typescript - Install TypeScript dependencies"
	@echo "  make java       - Install Java dependencies"
	@echo "  make python     - Install Python dependencies"
	@echo "  make rust       - Install Rust dependencies"
	@echo "  make go         - Install Go dependencies"
	@echo "  make init       - Initialize environments only if not already initialized"
	@echo "  Uncomment other test commands in 'test' target to enable them."
