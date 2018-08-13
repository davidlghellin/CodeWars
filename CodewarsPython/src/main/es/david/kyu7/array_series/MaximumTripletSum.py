# https://www.codewars.com/kata/maximum-triplet-sum-array-series-number-7/train/python

def max_tri_sum(numbers):
    # eliminamos duplicados
    conjunto = set(numbers)
    lista_ordenada = sorted(list(conjunto), reverse=True)
    return lista_ordenada[0] + lista_ordenada[1] + lista_ordenada[2]

    # return sum(sorted(set(numbers))[-3:])
    # return sum(nlargest(3, set(numbers)))
    # return sum(sorted(set(arr), reverse = True)[:3])
