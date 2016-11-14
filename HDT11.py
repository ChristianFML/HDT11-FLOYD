'''
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Seccion 31
Juan Andres Garcia - 15046
Rodirgo Barrios - 15009
Christian Morales - 15015
Jose Luis Mendez - 15024
Hoja de Trabajo 11 - Algoritmo de Floyd-Warshall
'''
import networkx as netx

Grafo = netx.Graph() #Grafo a generar
file = open("guategrafo.txt","r")
data = file.readlines()
file.close()
branch =0
#Lectura del archivo
for lines in data:
	string = lines.split(", ")
	Grafo.add_node(string[0])
	Grafo.add_node(string[1])
	Grafo.add_edge(string[0],string[1],weight=int(string[2]))

#Declaracion de variables
Path = netx.floyd_warshall_predecessor_and_distance(Grafo, weight="peso") #Ruta mas corta calculada por el algoritmo
Nodos = Grafo.nodes() #Nodos del grafo

# Solicitud de datos (inicio y fin)
Source = raw_input("Indique el nodo de origen: "+"/".join(Nodos))
while Source not in Grafo.Nodos():
	print "Error, ingrese de nuevo"
	Source = raw_input("Indique el nodo de origen: "+"/".join(Nodos))

Destination = raw_input("Indique el nodo destino: "+"/".join(Nodos))
while Destination not in Grafo.Nodos():
	print "Error, ingrese de nuevo"
	Destination = raw_input("Indique el nodo destino: "+"/".join(Nodos))

# Despliegue de la ruta tomada
print "El recorrido a tomar es: "
predecesor = path[0][Source][Destination]
while branch:
	print predecesor
	predecesor_1 = predecesor
	if Source = predecesor:
		branch = 1
	else:
		predecesor = path[0][Source][Destination]

print "Ruta en Kilometros: "
print path[1][Source][Destination]

Centro = netx.center(Grafo, e=None)
print "Centro(s) del grafo: "+", ".join(Centro) 

#Calcular otra ruta en caso hayan bloqueos
correcciones = raw_input("Hay bloqueos en las carreteras? Si o No")

if correcciones == "Si":
	print "Escriba cual es la carretera bloqueada (indique origen y destino)"
	print ""
	Edges = Grafo.edges()
	Edge = raw_input(Edges)
	Vertices = Edge.split(", ")
	print ""
	if Vertices[0] not int Grafo.Nodos():
		alerta = 1
	while alerta:
		print "La carretera no existe, indique origen y destino"
		Edge = raw_input(Edges)
		Vertices = Edge.split(", ")

	Grafo.remove_edge(Vertices[0],Vertices[1])
	newpath = netx.floyd_warshall_predecessor_and_distance(G, weight="peso")
	print "El recorrido a tomar es:"
	branch =0
	while branch:
		predecesor = newpath[0][Source][Destination]
		predecesor_1 = predecesor
		if Source = predecesor
			branch =1
		else:
			predecesor = newpath[0][Source][Destination]

	print "Ruta en kilometros: "
	print newpath[1][Source][Destination]