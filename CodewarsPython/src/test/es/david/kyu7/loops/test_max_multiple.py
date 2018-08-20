import unittest

from src.main.es.david.kyu7.loops.MaximumMultiple import max_multiple


class TestMax_multiple(unittest.TestCase):

    def test_max_tri_sum(self):
        """
        Test
        """
        self.assertEqual(max_multiple(2, 7), 6)
        self.assertEqual(max_multiple(3, 10), 9)
        self.assertEqual(max_multiple(7, 17), 14)
        self.assertEqual(max_multiple(10, 50), 50)
        self.assertEqual(max_multiple(37, 200), 185)
        self.assertEqual(max_multiple(7, 100), 98)
        self.assertEqual(max_multiple(37, 100), 74)
        self.assertEqual(max_multiple(1, 13), 13)
        self.assertEqual(max_multiple(1, 1), 1)
        self.assertEqual(max_multiple(4, 1), 0)


if __name__ == '__main__':
    unittest.main()
