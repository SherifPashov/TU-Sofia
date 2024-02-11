#Зад1 Лаб 6
lst=[] # Празен списък
for i in range(0,5):
    x=int(input("x = "))
    lst=lst+[x,]
    
print(lst)

lst1=lst*2 
print(f"Удвоен списък: {lst1}")

key=int(input("Търсен елемент: "))

if key in lst: 
    print(f"{key} е в списъка")
else:
    print(f"{key} не е в списъка")
    
for i in range(0,len(lst)): 
    print(lst[i])
    
lst.sort()
print(f"Сортиран списък: {lst}")
max_value=max(lst) 
print(f"max = {max_value}")

index=int(input("Индекс на елемент за промяна: "))
value=int(input("Търсенa нова стойност за елемента: "))

if index<len(lst):
   lst[index]=value 
   print(f"Променен списък: {lst}")
else:
   print(f"Няма индекс {index} в списъка")
   
index = int(input("Индекс на елемент за изтриване: "))
if index<len(lst):
   del lst[index] 
   print(f"Променен списък: {lst}")
else:
   print(f"Няма индекс {index} в списъка")

