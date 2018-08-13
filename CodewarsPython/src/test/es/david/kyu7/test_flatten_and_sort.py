import unittest

from src.main.es.david.kyu7.MyFlatten import flatten_and_sort


class TestFlatten_and_sort(unittest.TestCase):

    def test_flatten_and_sort(self):
        """
        Test
        """
        self.assertEqual(flatten_and_sort([]), [])
        self.assertEqual(flatten_and_sort([[], [1]]), [1])
        self.assertEqual(flatten_and_sort([[3, 2, 1], [7, 9, 8], [6, 4, 5]]), [1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(flatten_and_sort([[1, 3, 5], [100], [2, 4, 6]]), [1, 2, 3, 4, 5, 6, 100])


if __name__ == '__main__':
    unittest.main()