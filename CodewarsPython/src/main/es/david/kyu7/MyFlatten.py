# https://www.codewars.com/kata/flatten-and-sort-an-array/train/python
import itertools

def flatten_and_sort(array):
    return sorted(list(itertools.chain.from_iterable(array)))


