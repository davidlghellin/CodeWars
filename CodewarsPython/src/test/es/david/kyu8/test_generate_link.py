import unittest

from src.main.es.david.kyu8.GenerateUserLinks import generate_link


class TestGenerate_link(unittest.TestCase):

    def test_generate_link(self):
        self.assertEqual(generate_link('matt c'), 'http://www.codewars.com/users/matt%20c')
        self.assertEqual(generate_link('g964'), 'http://www.codewars.com/users/g964')
        self.assertEqual(generate_link('GiacomoSorbi'), 'http://www.codewars.com/users/GiacomoSorbi')
        self.assertEqual(generate_link('ZozoFouchtra'), 'http://www.codewars.com/users/ZozoFouchtra')
        self.assertEqual(generate_link('colbydauph'), 'http://www.codewars.com/users/colbydauph')


if __name__ == '__main__':
    unittest.main()
