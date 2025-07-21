N,M = map(int,input().split())
A,B = [], []
for i in range(N):
    row = list(map(int, input().split()))
    A.append(row)

for j in range(N):
    row = list(map(int, input().split()))
    B.append(row)

for row in range(N):
    for cols in range(M):
        print(A[row][cols]+B[row][cols], end=' ')
    print()
    
