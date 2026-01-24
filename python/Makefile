# -------------------------
# Python Design Patterns
# -------------------------

.PHONY: check-venv install format lint test clean

check-venv:
	@if [ -z "$$VIRTUAL_ENV" ]; then \
		echo ""; \
		echo "❌ No active Python virtual environment detected."; \
		echo ""; \
		echo "Please create and activate one before running make:"; \
		echo ""; \
		echo "  python3 -m venv venv"; \
		echo "  source venv/bin/activate        # Linux / macOS"; \
		echo "  venv\\Scripts\\activate         # Windows"; \
		echo ""; \
		exit 1; \
	fi

install: check-venv
	pip install -r requirements.txt

format: check-venv
	black src tests

lint: check-venv
	mypy src tests

test: check-venv
	pytest --cov=src --cov-report=xml tests

clean:
	rm -rf __pycache__ .mypy_cache .pytest_cache
