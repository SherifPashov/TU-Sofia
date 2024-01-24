class Node:
    def __init__(self, data: int) -> None:
        self.data = data
        self.next: Node | None = None
 
 
class LinkedList:
    def __init__(self) -> None:
        self.head = None
 
    def append(self, data: int) -> None:
        if not self.head:
            self.head = Node(data)
 
        else:
            current_node = self.head
            while current_node.next:
                current_node = current_node.next
 
            current_node.next = Node(data)
 
    def print_ll(self) -> None:
        current_node = self.head
        elements = str()
 
        while current_node:
            elements += (str(current_node.data) + " ")
            current_node = current_node.next
 
        print(elements)
 
    def add_elements(self):
        counter = 0
        index = 1
        current_node = self.head
        last_node = self.head
 
        while current_node:
            if not index % 2 and current_node.data < 0:
                counter += 1
 
                if not counter % 3:
                    node = Node(last_node.data // 2)
                    node.next = current_node.next
                    current_node.next = node
 
            last_node = current_node
            current_node = current_node.next
            index += 1
 
 
llist = LinkedList()
for value in range(-20, 0):
    llist.append(value)
 
llist.add_elements()
 
llist.print_ll()
