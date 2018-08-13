import unittest

from src.main.es.david.kyu7.array_series.ProductArray import product_array


class TestProduct_array(unittest.TestCase):

    def test_product_array(self):
        """
        Test
        """
        self.assertEqual(product_array([12, 20]), [20, 12])
        self.assertEqual(product_array([12, 20]), [20, 12])
        self.assertEqual(product_array([3, 27, 4, 2]), [216, 24, 162, 324])
        self.assertEqual(product_array([13, 10, 5, 2, 9]), [900, 1170, 2340, 5850, 1300])
        self.assertEqual(product_array([16, 17, 4, 3, 5, 2]), [2040, 1920, 8160, 10880, 6528, 16320])


if __name__ == '__main__':
    unittest.main()
