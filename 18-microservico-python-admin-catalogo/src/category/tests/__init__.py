from datetime import datetime
import unittest
from category.domain.entities import Category


class TestCategory(unittest.TestCase):

    def test_constructor(self):
        Category('Movie', 'Description', True, datetime.now())
