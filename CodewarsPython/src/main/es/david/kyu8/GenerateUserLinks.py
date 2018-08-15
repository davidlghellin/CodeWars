# https://www.codewars.com/kata/generate-user-links/train/python

def generate_link(user):
    ruta = 'http://www.codewars.com/users/'

    array = user.split(" ")

    for i in array:
        if array[0] == i:
            ruta = ruta + i
        else:
            ruta = ruta + "%20" + i
    return ruta
