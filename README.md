Readme Python
Este fue sencillo primero declaré cuanto era el rango de meses y departamentos y después los definí, en el primer metodo defini el mes, departamento y el valor de los productos
y declare a los meses como i de acuerdo a lo que se ingrese como indica el index y j lo defini como el det¿partamento del producto que se busca. Estas 2 variables se toman como coordenadas 
en la tabla impresa para asi poder facilitar su busqueda y no tener que definir variables fijas y sea el propio usuario que ponga las coordenadas, en buscar_venta es mas de lo mismo solo 
que el cambio es que en lugar de agregarlo solo devuelve el producto y lo imprime. en el metodo de eliminar hay un cambio en cuanto al final ya que sigue teniendo las mismas variables pero 
hace que el valor del producto en las coordenadas ingresadas sea 0 asi borrando cualquier compra. Ya a lo ultimo imprimi los resultados de todas las peticiones e imprimí la tabla, igual pude
haber usado una herencia en los metodos pero practicamente no optimizaria nada ya que solo ahorraria unas pocas lineas de codigo.

Readme Java
Este si ya se me complicó mas jaja porque no tuve java en primer semestre asi que me tuve que apoyar en videos la definicion del rango de los meses y departamentos es practicamente lo mismo
al igual que definir los meses y departamentos En el método de insertar venta lo que hago es recibir el mes, el departamento y el valor de la venta, luego busco qué número de fila le corresponde 
al mes y qué número de columna al departamento, y con esas dos posiciones guardo el valor dentro de la matriz. Es como si fueran coordenadas dentro de una tabla.
El método de buscar venta funciona casi igual, la diferencia es que en vez de meter un valor en la tabla simplemente regresa lo que ya está guardado en esas coordenadas y lo imprime. En 
el de eliminar venta se usan los mismos pasos, pero al final lo que hace es poner en cero el valor de esa posición, lo cual simula borrar la venta que estaba registrada. También hice un método 
extra para convertir los arreglos en texto y otro para encontrar el índice de un valor, porque en este caso no quise usar la librería java.util.
Ya en el metodo principal (main) hago las pruebas: primero inserto un par de ventas, luego muestro una de ellas, después elimino una venta y vuelvo a mostrar el resultado para comprobar que quedó 
en cero. Al final se imprime la matriz completa de ventas mes por mes para ver cómo quedaron todos los datos organizados. En general el programa sirve como una forma rápida de controlar ventas 
sin necesidad de estar definiendo variables fijas, ya que todo se maneja con coordenadas de mes y departamento.
Por la extension creo q se entiende que me costó mas en java pero fue bueno ya que pude aprender a usarlo mejor aunque sea un poco basico mi codigo.
