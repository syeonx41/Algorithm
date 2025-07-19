import string
word = input()
aList = list(string.ascii_lowercase)

for i in range(len(aList)):
    if word.find(aList[i]) != -1:
        print(word.find(aList[i]), end=' ')
    else:
        print('-1', end=' ')