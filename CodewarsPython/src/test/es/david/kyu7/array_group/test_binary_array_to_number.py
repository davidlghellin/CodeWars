import unittest

from src.main.es.david.kyu7.array_group.OnesAndZeros import binary_array_to_number


class TestBinary_array_to_number(unittest.TestCase):

    def test_binary_array_to_number(self):
        """
        Test binary
        """
        self.assertEqual(binary_array_to_number([0, 0, 0, 1]), 1)
        self.assertEqual(binary_array_to_number([0, 0, 1, 0]), 2)
        self.assertEqual(binary_array_to_number([1, 1, 1, 1]), 15)
        self.assertEqual(binary_array_to_number([0, 1, 1, 0]), 6)


if __name__ == '__main__':
    unittest.main()
