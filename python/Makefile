install:
	pip install -r requirements.txt

format:
	black src tests

lint:
	mypy src tests

test:
	pytest --cov=src tests

clean:
	rm -rf __pycache__ .mypy_cache .pytest_cache

