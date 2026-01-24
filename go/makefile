# -------------------------
# Go Design Patterns
# -------------------------

COVERAGE_FILE=coverage.out
HTML_FILE=coverage.html

install:
	go mod tidy

test:
	go test ./... -coverprofile=$(COVERAGE_FILE)

cover:
	go tool cover -func=$(COVERAGE_FILE)

cover-html:
	go tool cover -html=$(COVERAGE_FILE) -o $(HTML_FILE)

coverage: test cover cover-html
	@echo "Open $(HTML_FILE) in your browser to view coverage report."

fmt:
	go fmt ./...

clean:
	rm -f $(COVERAGE_FILE) $(HTML_FILE)

all: fmt install test
