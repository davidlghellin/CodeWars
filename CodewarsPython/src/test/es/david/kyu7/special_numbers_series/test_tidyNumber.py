import unittest

from src.main.es.david.kyu7.special_numbers_series.TidyNumber import tidyNumber


class TestTidyNumber(unittest.TestCase):
    def test_product_array(self):
        """
        Test
        """

        self.assertEqual(tidyNumber(12), True)
        self.assertEqual(tidyNumber(102), False)
        self.assertEqual(tidyNumber(9672), False)
        self.assertEqual(tidyNumber(2789), True)


if __name__ == '__main__':
    unittest.main()
