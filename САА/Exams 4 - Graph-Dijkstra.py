import sys

class Graph:
    def __init__(self, vertices):
        self.vertices = vertices
        self.graph = []
        for _ in range(vertices):
            self.graph.append([0] * vertices)

    def add_edge(self, start, end, weight):
        self.graph[start][end] = weight

    def print_graph(self):
        for row in self.graph:
            print(row)

    def dijkstra(self, start, end):
        visited = [False] * self.vertices
        distance = [sys.maxsize] * self.vertices
        previous = [None] * self.vertices
        distance[start] = 0

        for _ in range(self.vertices):
            # Намери връх с най-малка текуща дистанция, който не е посетен
            min_distance = sys.maxsize
            min_index = -1
            for v in range(self.vertices):
                if not visited[v] and distance[v] < min_distance:
                    min_distance = distance[v]
                    min_index = v

            # Посети избрания връх
            visited[min_index] = True

            # Обнови дистанциите до всички съседни върхове
            for v in range(self.vertices):
                if not visited[v] and self.graph[min_index][v] > 0 and distance[min_index] + self.graph[min_index][v] < distance[v]:
                    distance[v] = distance[min_index] + self.graph[min_index][v]
                    previous[v] = min_index

        # Създаване на списък с пътя от start до end
        path = []
        current = end
        while current is not None:
            path.insert(0, current)
            current = previous[current]

        return path, distance[end]

# Пример за използване:
graph = Graph(6)

graph.add_edge(0, 1, 2)
graph.add_edge(0, 2, 4)
graph.add_edge(1, 2, 1)
graph.add_edge(1, 3, 7)
graph.add_edge(2, 4, 3)
graph.add_edge(3, 5, 2)
graph.add_edge(4, 5, 1)

print("Матрица на съседство:")
graph.print_graph()

start_vertex = 0
end_vertex = 5

path, min_distance = graph.dijkstra(start_vertex, end_vertex)

print(f"\nНай-къс път от връх {start_vertex} до връх {end_vertex}:")
print("Път:", path)
print("Дължина на пътя:", min_distance)
