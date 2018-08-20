import unittest
from unittest import test

from src.main.es.david.kyu6.ElementEqualsIndex import index_equals_value


class TestIndex_equals_value(unittest.TestCase):

    def test_num_primorial(self):
        """
        Test
        """

        self.assertEqual(index_equals_value((-3, 0, 1, 3, 10)), 3)
        self.assertEqual(index_equals_value((-5, 1, 2, 3, 4, 5, 7, 10, 15)), 1)
        self.assertEqual(index_equals_value((9, 10, 11, 12, 13, 14)), -1)
        self.assertEqual(index_equals_value((0,)), 0)


if __name__ == '__main__':
    unittest.main()
