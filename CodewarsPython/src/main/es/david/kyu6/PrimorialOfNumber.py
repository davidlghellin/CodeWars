from functools import reduce


def num_primorial(n):
    list = get_list_primos(n)

    return reduce(lambda a, b: a * b, list, 1)


def es_primo(numero):
    """
    Funcion que determina si un numero es primo
    Tiene que recibir el numero entero
    """
    for i in range(2, numero):
        if (numero % i) == 0:
            # es divisible
            return False
    return True


def get_list_primos(n):
    lista = []
    i = 2
    while len(lista) < n:
        if es_primo(i):
            lista.append(i)
        i = i + 1
    return lista
