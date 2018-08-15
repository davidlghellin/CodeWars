import unittest

from src.main.es.david.kyu8.Between import between


class TestGenerate_link(unittest.TestCase):
    def test_between(self):
        self.assertEqual(between(1, 4), [1, 2, 3, 4])


if __name__ == '__main__':
    unittest.main()
