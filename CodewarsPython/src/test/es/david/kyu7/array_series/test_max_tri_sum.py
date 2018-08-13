import unittest

from src.main.es.david.kyu7.array_series.MaximumTripletSum import max_tri_sum

class TestMax_tri_sum(unittest.TestCase):

    def test_max_tri_sum(self):
        """
        Test
        """
        self.assertEqual(max_tri_sum([3, 2, 6, 8, 2, 3]), 17)
        self.assertEqual(max_tri_sum([2, 9, 13, 10, 5, 2, 9, 5]), 32)
        self.assertEqual(max_tri_sum([2, 1, 8, 0, 6, 4, 8, 6, 2, 4]), 18)
        self.assertEqual(max_tri_sum([-3, -27, -4, -2, -27, -2]), -9)
        self.assertEqual(max_tri_sum([-14, -12, -7, -42, -809, -14, -12]), -33)
        self.assertEqual(max_tri_sum([-13, -50, 57, 13, 67, -13, 57, 108, 67]), 232)
        self.assertEqual(max_tri_sum([-7, 12, -7, 29, -5, 0, -7, 0, 0, 29]), 41)
        self.assertEqual(max_tri_sum([-2, 0, 2]), 0)
        self.assertEqual(max_tri_sum([-2, -4, 0, -9, 2]), 0)
        self.assertEqual(max_tri_sum([-5, -1, -9, 0, 2]), 1)

if __name__ == '__main__':
    unittest.main()