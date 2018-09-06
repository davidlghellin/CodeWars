import unittest

from src.main.es.david.kyu8.TwiceAsOld import twice_as_old


class TestTwice_as_old(unittest.TestCase):

    def test_twice_as_old(self):
        self.assertEqual(twice_as_old(55, 30), 5)
        self.assertEqual(twice_as_old(42, 21), 0)
        self.assertEqual(twice_as_old(36, 7), 22)
        self.assertEqual(twice_as_old(22, 1), 20)
        self.assertEqual(twice_as_old(29, 0), 29)


if __name__ == '__main__':
    unittest.main()
