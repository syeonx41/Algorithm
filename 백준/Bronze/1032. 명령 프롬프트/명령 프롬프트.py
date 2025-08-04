n = int(input())
file = list(input())

for i in range(n-1):
    file2 = list(input())
    for i in range(len(file)):
        if file[i] == file2[i]:
            continue
        else:
            file[i]= '?'
print(''.join(file), end="")