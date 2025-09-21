ventas = [[0 for _ in range(3)] for _ in range(12)]

meses = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
         "Agosto","Septiembre","Octubre","Noviembre","Diciembre"]
departamentos = ["Ropa", "Deportes", "Juguetería"]

def insertar_venta(mes, depto, valor):
    i = meses.index(mes)
    j = departamentos.index(depto)
    ventas[i][j] = valor

def buscar_venta(mes, depto):
    i = meses.index(mes)
    j = departamentos.index(depto)
    return ventas[i][j]

def eliminar_venta(mes, depto):
    i = meses.index(mes)
    j = departamentos.index(depto)
    ventas[i][j] = 0

insertar_venta("Enero", "Ropa", 1500)
insertar_venta("Febrero", "Deportes", 2000)

print("Venta en Enero-Ropa:", buscar_venta("Enero", "Ropa"))

eliminar_venta("Enero", "Ropa")
print("Venta en Enero-Ropa después de eliminar:", buscar_venta("Enero", "Ropa"))

print("\nMatriz final de ventas:")
for i in range(12):
    print(meses[i], ventas[i])
