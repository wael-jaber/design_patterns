class Product:
    """
    Product: The complex object being built.
    """

    def __init__(self):
        self.parts = []

    def add_part(self, part: str):
        """
        Adds a new part to the product.
        """
        self.parts.append(part)

    def list_parts(self) -> str:
        """
        Lists all parts of the product.
        """
        return ", ".join(self.parts)
