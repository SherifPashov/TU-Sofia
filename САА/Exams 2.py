a=input().split()
b=input().split()
c=input().split()
d=[]
for element in a:
    if element in b and element in c:
        d.append(element)

print(d)
