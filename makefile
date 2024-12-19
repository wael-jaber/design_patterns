# Define subdirectories for each language
SUBDIRS = javascript java python rust go

# Default target
all: setup

# Setup all subdirectories
setup: $(SUBDIRS)

# TypeScript setup (inside javascript folder)
javascript:
	@echo "Setting up TypeScript environment in the 'javascript' folder..."
	@mkdir -p javascript
	@cd javascript && pnpm init -y
	@cd javascript && pnpm add -D typescript @types/node
	@cd javascript && pnpm exec tsc --init
	@echo "TypeScript setup complete in the 'javascript' folder."

# Java setup
java:
	@echo "Setting up Java environment..."
	@mkdir -p java
	@cd java && mkdir -p src/main/java src/test/java && touch pom.xml
	@echo "Java setup complete. Please configure pom.xml for Maven."

# Python setup
python:
	@echo "Setting up Python environment..."
	@mkdir -p python
	@cd python && python3 -m venv venv && touch requirements.txt
	@echo "Python setup complete. Activate the virtual environment using 'source python/venv/bin/activate'."

# Rust setup
rust:
	@echo "Setting up Rust environment..."
	@mkdir -p rust
	@cd rust && cargo init --bin .
	@echo "Rust setup complete."

# Go setup
go:
	@echo "Setting up Go environment..."
	@mkdir -p go
	@cd go && go mod init design-patterns
	@echo "Go setup complete."

# Clean up all setups
clean:
	@echo "Cleaning up all subdirectories..."
	@rm -rf javascript java python rust go
	@echo "Cleanup complete."

# Help menu
help:
	@echo "Makefile for setting up design patterns sub-repositories:"
	@echo "  make            - Set up all environments"
	@echo "  make setup      - Alias for 'make'"
	@echo "  make javascript - Set up TypeScript environment in 'javascript' folder"
	@echo "  make java       - Set up Java environment"
	@echo "  make python     - Set up Python environment"
	@echo "  make rust       - Set up Rust environment"
	@echo "  make go         - Set up Go environment"
	@echo "  make clean      - Remove all subdirectories"
