def solution(x):
    num = 0
    temp = x
    
    while temp > 0:
        num = num + temp % 10
        temp = temp // 10
    
    if x % num == 0:
        return True
    else:
        return False