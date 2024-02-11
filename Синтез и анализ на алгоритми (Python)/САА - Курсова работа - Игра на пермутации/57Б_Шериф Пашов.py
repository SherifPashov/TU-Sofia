def bubbleSort(inputArr):

    n = len(inputArr)

    # Проходи през всички елементи
    for i in range(n):
        # Последните i елемента вече са сортирани, затова можем да ги пропуснем
        for j in range(0, n - i - 1):
            # Сравняваме съседни двойки и разменяме ги, ако са в грешен ред
            if inputArr[j] > inputArr[j + 1]:
                inputArr[j], inputArr[j + 1] = inputArr[j + 1], inputArr[j]

    return inputArr

def countMovesSorted(inputArr):
    # Функция, която сортира входния масив и връща броя на инверсиите (размени)

    #Сортираме масива, за да знаем кога е във възходящ ред
    copyArrSort = bubbleSort((inputArr.copy()))

    #Променлива за ходовете на играчите
    countMoves = 0

    #Безкраен цикъл, докато не се подреди масива във възходящ ред
    while(copyArrSort != inputArr):
        #Взимане на индекса на най-големия елемент
        max_index1 = inputArr.index(max(inputArr))

        #Премахване на най-големия елемент от оригиналната игра
        inputArr.pop(max_index1)

        #премахване на най-големия елемент от сортираният елемент
        copyArrSort.pop()

        #Увеличаваме броя хода с единица
        countMoves += 1

    #Връщаме броя ходове
    return countMoves


def permutationGame(N, permutation):

    for i in range(N):

        countMove = countMovesSorted(permutation)

        # Проверка: Кой е победил, като Гошо винаги е първи
        if countMove % 2 == 1:
            winner = "Гошо"
        else:
            winner = "Пешо"

        return winner

# Четене на броя на тестовите случаи
gameCount = int(input("Въведете броя на игри: "))

for n in range(gameCount):
    # Четене на броя на елементите и пермутацията
    elementsNumber = int(input(f"Брой елементи за игра №{n+1}: "))

    # Четене на елементите на играта (пермутацията)
    permutation = list(map(int, input().split()))

    # Определяне на победителя и извеждане на резултата
    winner = permutationGame(elementsNumber, permutation)

    # Принтиране на победителя в дадената игра
    print(f"Игра №{n+1}.  Победител e: {winner}")
