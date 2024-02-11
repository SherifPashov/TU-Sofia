#Зад 2
class Student: # Клас студент
    '''Клас за студенти в ТУ'''
    university="Технически университет - София"
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def show_st(self):
        print(f"{self.name} {self.age}")
 
class Faculty(Student): # Клас факултет
    '''Клас за студенти от факултет'''
 
    def __init__(self,name,age,fk_name,number):
        super().__init__(name,age)
        self.fk_name=fk_name
        self.number=number
 
    def show_fk(self):
        print(f"{self.name} {self.fk_name} {self.number}")
 
    def get_fk_name(self):
        return self.fk_name
    
def control_int(): # Функция за контрол на входните данни
    '''Контрол на входните данни'''
    
    while True:
        try: # Обработка на изключение
            num=int(input("Въведетв цяло число >> "))
            return num
        except ValueError:
            print(control_int.__doc__)
            print("Необходимо е да се въведе цяло число!")
            
def add_student(): # Функция за въвеждане на данни за студент
    '''Добавяне на данни за студент'''
    x=input("Име: ")
    print("Възраст: ")
    y=control_int()
    z=input("Факултет: ")
    n=input("Факултетен номер: ")
    F=Faculty(x,y,z,n) # Създаване на обект от клас факултет
    return F
def input_student(st_list): # Функция за въвеждане на данни за група студенти
    '''Въвеждане за група студенти'''
    print("Колко студента ще въведете?")
    br=control_int()
    for i in range(0,br):
        F=add_student()
        st_list.append(F)
    return st_list
def show_student(st_list): # Функция за извеждане на основни данни всички студенти
    '''Извеждане на списък със студенти на ТУ'''
    if st_list!=[]:
        print(Student.university)
        for i in range(0,len(st_list)):
            st_list[i].show_st()
    else:
        print("Списъкът е празен!")
        
def show_fakulty(st_list,fk): # Функция за извеждане на студенти от избран факултет
    '''Извеждане на списък със студенти във факултет'''
    for i in range(0,len(st_list)):
        if st_list!=[]:
            fname=st_list[i].get_fk_name()
        if fname==fk:
            st_list[i].show_fk()
        else:
            print("Списъкът е празен!")
            
lst=[] # Създаване на празен списък
print(input_student.__doc__)

lst=input_student(lst)
print(show_student.__doc__)

show_student(lst)
key=input("Въведете име на факултет: ")
print(show_fakulty.__doc__)
show_fakulty(lst,key)

