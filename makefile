# -------------------------
# Design Patterns - Root
# -------------------------

.DEFAULT_GOAL := help

# -------------------------
# Required tools
# -------------------------
REQUIRED_TOOLS = pnpm node java mvn python pip go

# -------------------------
# Tool check
# -------------------------
check:
	@echo "Checking required runtimes and package managers..."
	@for tool in $(REQUIRED_TOOLS); do \
	 		if ! command -v $$tool >/dev/null 2>&1; then \
				echo ""; \
				echo "❌ Missing required tool: $$tool"; \
				echo "Please install it before continuing."; \
				echo ""; \
				exit 1; \
			fi; \
		done
	@echo "✅ All required tools are installed."

# -------------------------
# Install dependencies
# -------------------------
install: check
	@$(MAKE) -C typescript install
	@$(MAKE) -C java install
	@$(MAKE) -C python install
	@$(MAKE) -C go install

# -------------------------
# Run tests
# -------------------------
test: check
	@$(MAKE) -C typescript test
	@$(MAKE) -C java test
	@$(MAKE) -C python test
	@$(MAKE) -C go test

# -------------------------
# Clean
# -------------------------
clean:
	@$(MAKE) -C typescript clean
	@$(MAKE) -C java clean
	@$(MAKE) -C python clean
	@$(MAKE) -C go clean

# -------------------------
# Help
# -------------------------
help:
	@echo ""
	@echo "Design Patterns – Monorepo Commands"
	@echo ""
	@echo "  make install   Install dependencies for all languages"
	@echo "  make test      Run all tests"
	@echo "  make clean     Clean all build artifacts"
	@echo ""
	@echo "Note: Python commands require an active virtual environment."
	@echo ""
