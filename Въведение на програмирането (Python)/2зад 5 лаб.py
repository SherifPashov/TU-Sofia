tpl=()
number=int(input("Брой числа-> "))
for i in range(0,number):
    x=int(input("x = "))
    tpl=tpl+(x,) 
print(tpl)
tpl1=tpl*2 
print(f"Удвоен кортеж: {tpl1}")
key=int(input("Търсен елемент: "))
if key in tpl: 
    print(f"{key} е в кортежа")
else:
    print(f"{key} не е в кортежа")
for i in range(0,len(tpl)): 
    print(tpl[i])
min_el=min(tpl) 
print(f"min = {min_el}")
