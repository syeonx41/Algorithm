num = list(map(int,input().split()))
result = 0

for i in range(len(num)):
    result += num[i]**2
print(result%10)
