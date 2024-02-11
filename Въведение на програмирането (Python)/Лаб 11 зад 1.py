#Зад 1 
class Parent: # Родителски клас
    '''Родителски клас'''
    def __init__(self,a): # Конструктор на класа
        self.a=a
        
    def show(self): # Метод за извеждане на данните за обекта
        print(f"а = {self.a}")
        
class Child(Parent): # Клас наследник
    '''Клас наследник'''
    
    def __init__(self,a,b): # Конструктор на класа
        super().__init__(a)
        self.b=b
        
    def show(self): # Метод за извеждане на данните за обекта
        print(f"а = {self.a} b = {self.b}")
        
def control_int(): # Функция за контрол на входните данни
    '''Контрол на входните данни'''
    
    while True: # Обработка на изключение

        try:
            num=int(input("Въведете цяло число >> "))
        except ValueError:
            print(control_int.__doc__)
            print("Необходимо е да се въведе цяло число!")
        else:
            print("Не възникна изклчючение!")
            return num
        finally:
            print("Входните данни бяха обработени!")
            
print("Създавне на обект от клас Parent: ")
x=control_int()
P=Parent(x) # Създаване на обект от родителския клас

print("Отпечатване на обект от клас Parent: ")
P.show() # Викане на метод show()

print("Създавне на обект от клас Chaild: ")
x=control_int()
y=control_int()
Ch=Child(x,y) # Създаване на обект от клас наследник

print("Отпечатване на обект от клас Chaild: ")
Ch.show() # Викане на метод show()


