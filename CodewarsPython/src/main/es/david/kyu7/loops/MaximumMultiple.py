def max_multiple(divisor, bound):
    #your code here
    for i in range(bound, 0, -1):
        if i% divisor == 0:
            return i

    return 0
    # return bound - (bound % divisor)

    # return bound // divisor * divisor

    # return [num for num in range(0, bound+1, divisor)][-1]