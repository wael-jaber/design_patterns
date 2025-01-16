# Define subdirectories for each language
SUBDIRS = typescript java python rust go
SUBDIRS_INIT = typescript_init java_init python_init rust_init go_init

# Default target
all: setup

# Setup all subdirectories (get dependencies)
setup: $(SUBDIRS)

# Initialize all directories
init: $(SUBDIRS_init)

# TypeScript init (inside typescript folder)
typescript_init:
	@echo "Initializing TypeScript environment in the 'typescript' folder..."
	@mkdir -p typescript
	@cd typescript && pnpm init -y
	@cd typescript && pnpm add -D typescript @types/node
	@cd typescript && pnpm exec tsc --init
	@echo "TypeScript Initialization complete in the 'typescript' folder."

# Typescript setup ( installing dependencies )
typescript:
	@echo "Installing typescript dependencies"
	@cd typescript && pnpm install
	@echo "Installing typescript dependencies completed."

# Java init
java_init:
	@echo "Initializing Java environment..."
	@mkdir -p java
	@cd java && mkdir -p src/main/java src/test/java && touch pom.xml
	@echo "Java Initialization complete. Please configure pom.xml for Maven."

java:
	@echo "Installing Java dependencies"
	@echo "Installing Java dependencies completed."


# Python init
python_init:
	@echo "Initializing Python environment..."
	@mkdir -p python
	@cd python && python3 -m venv venv && touch requirements.txt
	@echo "Python Initialization complete. Activate the virtual environment using 'source python/venv/bin/activate'."

python:
	@echo "Installing dependencies"
	@cd python && pip install -r requirements.txt
	@echo "Installing Python dependencies completed."

# Rust init
rust_init:
	@echo "Initializing Rust environment..."
	@mkdir -p rust
	@cd rust && cargo init --bin .
	@echo "Rust Initialization complete."

rust:
	@echo "Installing Rust dependencies"
	@echo "Installing Rust dependencies completed."


# Go init
go_init:
	@echo "Initializing Go environment..."
	@mkdir -p go
	@cd go && go mod init design-patterns
	@echo "Go Initialization complete."

rust:
	@echo "Installing Go dependencies."
	@echo "Installing Go dependencies."


# Help menu
help:
	@echo "Makefile for setting up design patterns sub-repositories:"
	@echo "  make            - Set up all environments (dependencies installation)"
	@echo "  make setup      - Alias for 'make'"
	@echo "  make typescript - init TypeScript environment in 'typescript' folder"
	@echo "  make java       - init Java environment"
	@echo "  make python     - init Python environment"
	@echo "  make rust       - init Rust environment"
	@echo "  make go         - init Go environment"
	@echo "  make clean      - Remove all subdirectories"
