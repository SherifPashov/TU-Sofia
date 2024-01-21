class Node:
    def __init__(self, data: int) -> None:
        self.data = data
        self.next: None | Node = None
 
 
class LinkedList:
    def __init__(self) -> None:
        self.head = None
 
    def append(self, data: int) -> None:
        if self.head:
            current_node = self.head
            while current_node.next:
                current_node = current_node.next
            current_node.next = Node(data)
 
        else:
            self.head = Node(data)
 
    def avail(self, avail):
        current_node = self.head
        counter = 1
        last_node = self.head
 
        while current_node:
            if not counter % 2 and current_node.data >= (counter * 3):
                avail.append(current_node.data)
                last_node.next = current_node.next
 
            else:
                last_node = current_node
 
            current_node = current_node.next
            counter += 1
 
    def print_ll(self) -> None:
        current_node = self.head
 
        while current_node:
            print(current_node.data, end=" ")
            current_node = current_node.next
 
 
main_list = LinkedList()
for index in range(10):
    main_list.append(1 + index)
 
avail_list = []
 
main_list.avail(avail_list)
print(main_list.print_ll())
print("Avail list", avail_list)
 
