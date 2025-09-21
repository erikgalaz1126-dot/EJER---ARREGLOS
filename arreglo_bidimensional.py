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

def mostrar_tabla():
    print("\n{:12}".format("Mes"), end="")
    for depto in departamentos:
        print("{:12}".format(depto), end="")
    print()
    print("-" * (12 + 12*len(departamentos)))
    for i in range(12):
        print("{:12}".format(meses[i]), end="")
        for j in range(3):
            print("{:<12}".format(ventas[i][j]), end="")
        print()

def menu():
    while True:
        print("\n--- Menú de Ventas ---")
        print("1. Insertar venta")
        print("2. Buscar venta")
        print("3. Eliminar venta")
        print("4. Mostrar tabla de ventas")
        print("5. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            mes = input("Ingrese el mes: ").capitalize()
            depto = input("Ingrese el departamento: ").capitalize()
            valor = float(input("Ingrese el valor de la venta: "))
            if mes in meses and depto in departamentos:
                insertar_venta(mes, depto, valor)
                print("Venta registrada correctamente.")
            else:
                print("Mes o departamento inválido.")
        elif opcion == "2":
            mes = input("Ingrese el mes: ").capitalize()
            depto = input("Ingrese el departamento: ").capitalize()
            if mes in meses and depto in departamentos:
                print(f"Venta en {mes}-{depto}: {buscar_venta(mes, depto)}")
            else:
                print("Mes o departamento inválido.")
        elif opcion == "3":
            mes = input("Ingrese el mes: ").capitalize()
            depto = input("Ingrese el departamento: ").capitalize()
            if mes in meses and depto in departamentos:
                eliminar_venta(mes, depto)
                print("Venta eliminada correctamente.")
            else:
                print("Mes o departamento inválido.")
        elif opcion == "4":
            mostrar_tabla()
        elif opcion == "5":
            print("Saliendo del programa...")
            break
        else:
            print("Opción inválida. Intente de nuevo.")

menu()
