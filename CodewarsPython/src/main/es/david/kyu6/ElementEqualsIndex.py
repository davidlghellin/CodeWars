# https://www.codewars.com/kata/element-equals-its-index/train/python

def index_equals_value(arr):
    for i, v in enumerate(arr):
        if i == v:
            return i
    return -1
