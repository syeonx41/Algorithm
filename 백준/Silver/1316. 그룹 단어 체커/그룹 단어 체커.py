n=int(input())
for i in range(0,n):
    word = input()
    for j in range(0,len(word)-1):
        if word[j] == word[j+1]:
            continue
        elif word[j] in word[j+1:]:
            n-=1
            break
print(n)
