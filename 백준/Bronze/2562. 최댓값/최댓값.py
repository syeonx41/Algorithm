max_list=[]
for i in range(9):
    n=int(input())
    max_list.append(n)
result=max(max_list)
print(result)
print(max_list.index(result)+1)