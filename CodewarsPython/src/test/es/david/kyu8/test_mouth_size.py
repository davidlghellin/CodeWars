import unittest

from src.main.es.david.kyu8.Mouth_size import mouth_size


class TestMouth_size(unittest.TestCase):
    def test_mouth_size(self):
        """
           Test binary
        """
        self.assertEqual(mouth_size("toucan"), "wide")
        self.assertEqual(mouth_size("ant bear"), "wide")
        self.assertEqual(mouth_size("alligator"), "small")


if __name__ == '__main__':
    unittest.main()
