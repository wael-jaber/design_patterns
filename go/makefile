# -----------------------------------------
# Go Design Patterns - Makefile
# -----------------------------------------

# Location of the coverage output
COVERAGE_FILE=coverage.out
HTML_FILE=coverage.html

# Run all tests with coverage
test:
	go test ./... -coverprofile=$(COVERAGE_FILE)

# View coverage percentage in terminal
cover:
	go tool cover -func=$(COVERAGE_FILE)

# Generate HTML coverage report
cover-html:
	go tool cover -html=$(COVERAGE_FILE) -o $(HTML_FILE)

# Run tests + show summary + view HTML coverage
coverage: test cover cover-html
	@echo "Open $(HTML_FILE) in your browser to view coverage report."

# Clean coverage files
clean:
	rm -f $(COVERAGE_FILE) $(HTML_FILE)

# Format code
fmt:
	go fmt ./...

# Tidy Go modules
tidy:
	go mod tidy

# Run all tools (format, tidy, test)
all: fmt tidy test

