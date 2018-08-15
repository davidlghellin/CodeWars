# https://www.codewars.com/kata/ones-and-zeros/train/python

def binary_array_to_number(arr):
    aux = 0

    for idx, val in enumerate(arr):
        aux += val * pow(2, len(arr) - idx - 1)

    return aux

    # return int("".join(map(str, arr)), 2)
    # return int(''.join(str(a) for a in arr), 2)

    # append_bit = lambda n, b: n << 1 | b
    # return reduce(append_bit, arr)

