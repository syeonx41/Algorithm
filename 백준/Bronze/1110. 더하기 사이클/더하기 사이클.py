num = int(input())
n = num
count = 0

while True:
    a = num % 10
    b = num // 10
    new_num = (10 * a) + ((a+b) % 10)
    num = new_num
    count += 1

    if new_num == n:
        break
    
print(count)
