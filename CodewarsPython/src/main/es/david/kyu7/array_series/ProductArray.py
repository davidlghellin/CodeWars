# https://www.codewars.com/kata/product-array-array-series-number-5/train/python

def product_array(numbers):

    lista = []
    for iidx, val in enumerate(numbers):
        salida = mult(numbers,iidx)
        lista.append(salida)

    return lista


def mult(v, pos):
    salida = 1
    for i, valor in enumerate(v):
        if i != pos:
            salida = salida * valor
    return salida
########################################

from operator import mul
from functools import reduce

def product_array2(numbers):
    tot = reduce(mul,numbers)
    return [tot//n for n in numbers]

########################################
#from numpy import prod

#def product_array3(numbers):
#    p = prod(numbers)
#    return [p // i for i in numbers]