#Зад 1 Лаб 7
dict={} 

for i in range(0,5):
    key=input("Ключ: ")
    val=int(input("Стойност: "))
    dict[key]=val 
    
print(dict)
x=input("Въведете търсен ключ: ")

if x in dict: 
    print(f"{x} е в речника")
else:
    print(f"{x} не е в речника")
    
y=input("Въведете ключ на елемент за промята: ")
z=int(input("Въведете нова стойност: "))

if y in dict:
    dict[y]=z 
    print(dict)
else:
    print(f"{y} не е в речника")
    
y=input("Въведете ключ на елемент за изтриване: ")

if y in dict:
    del dict[y] 
    print(dict)
else:
    print(f"Индекс {y} не е в речника")
print("Ключовете в речника са: ")

keys=dict.keys() 
print(keys)

print("Стойностите в речника са: ")
vals=dict.values() 
print(vals)

print("Сортиран речник: ")
lst=list(dict.keys())
lst.sort() 

for key in lst:
    print(key," " ,dict[key])
