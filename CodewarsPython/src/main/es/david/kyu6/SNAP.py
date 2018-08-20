# https://www.codewars.com/kata/snap/train/python
def snap(flash_pile, turtle_pile):
    num = 0

    i = 1
    cartaF = flash_pile[0]
    cartaT = turtle_pile[0]

    for i in range(0,len(flash_pile)):
        print('flas '+ str(flash_pile[i]))
        print('tort '+ str(turtle_pile[i]))

    if cartaT == cartaF:
        num = num + 1

    while i < len(turtle_pile):
        cartaF = flash_pile[i]
        if cartaT == cartaF:
            num = num + 1
        cartaT = turtle_pile[i]

        if cartaT == cartaF:
            num = num + 1
        i = i + 1


    return num
