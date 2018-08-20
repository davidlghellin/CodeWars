import unittest

from src.main.es.david.kyu6.PrimorialOfNumber import num_primorial


class TestNum_primorial(unittest.TestCase):

    def test_num_primorial(self):
        """
        Test binary
        """

        self.assertEqual(num_primorial(3), 30)
        self.assertEqual(num_primorial(4), 210)
        self.assertEqual(num_primorial(5), 2310)
        self.assertEqual(num_primorial(8), 9699690)
        self.assertEqual(num_primorial(9), 223092870)


if __name__ == '__main__':
    unittest.main()
