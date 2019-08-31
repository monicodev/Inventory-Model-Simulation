Inventory-Model-Simulation :computer:
=============
La simulación de inventario es una técnica que permite construir un modelo que recree el funcionamiento de un inventario en la realidad permitiendo así observar en días u horas su comportamiento. Es una herramienta de gran importancia para las empresas debido a que permite analizar en base al comportamiento de la simulación las estrategias de abastecimiento de inventario optimas en cuanto a reducir los costos que estos implican como por ejemplo: costos de compra, costos de almacenamiento, costos de escases.

- **Demanda**: Cantidad de artículos pedidos por año, determinística o probabilística.
- **Tiempo de entrega**: Tiempo que transcurrirá entre el momento en que se hace el pedido y el momento en que llega, puede ser determinístico o probabilístico.
- **Tiempo de espera**: Tiempo que un cliente espera en caso de no haber suficiente inventario para satisfacer su demanda en dicho momento.
- **Costo de orden**: Costo por pedido de mercancía.
- **Costo de inventario**: Costo que genera un artículo en inventario por año.
- **Costo faltante**: Costo por no tener disponible la cantidad de artículos demandados.
- **Costo total**: Es la suma de todos los costos (orden, inventario y faltante).
- **Q**: Cantidad optima de artículos a ordenar.
- **R**: Punto de reorden.

Objetivo :dart:
---
Optimizar la política de inventarios de una empresa mediante el análisis de una simulación de inventarios para determinar los valores óptimos y por consiguiente reducir al máximo los costos totales de dicha empresa.

Solución propuesta :closed_book:
---

Para llegar a la solución del problema se pasó previamente por una fase de análisis en la cual se determinó que para darle la resolución al problema de la forma más eficiente posible es necesario pasar por un conjunto de fases sucesivas y delimitadas con un objetivo específico las cuales se detallan a continuación:

### Fase 1 - Carga de datos :floppy_disk:
En esta fase se lleva a cabo la **lectura de todos los datos** necesarios para realizar la simulación. Primero se solicita al usuario que cargue los datos de las probabilidades de demanda, tiempo de espera y tiempo de entrega, al ser leídos estos se almacenan en 3 listas llamadas: **ListaDemanda**, **ListaTiempoDeEspera** y **ListaTiempoDeEntrega**.

Luego se cargan al programa el resto de los datos correspondientes y se almacenan en sus respectivas variables llamadas:

- **costoInv**: Costo de inventario.
- **costoOrd**: Costo de orden
- **costoEscConEspera**: Costo de escases con espera.
- **costoEscSinEspera**: Costo de escases sin espera
- **diasASimular**: Cantidad de días a simular
- **invInicial**: Inventario inicial.

### Fase 2 – Cálculo :triangular_ruler:
Una vez culminada la fase de carga de datos se iniciara la fase de cálculo en la cual se calcularan a través de las tablas de probabilidades (demanda, tiempo de espera y tiempo de entrega) suministradas los rangos de **Q** y **R**, y se almacenan en sus respectivas variables.

- **qmin**: Valor de **Q** minimo
- **qmax**: Valor de **Q** máximo
- **rmin**: Valor de **R** máximo
- **rmax**: Valor de **R** máximo

Posteriormente para cada combinación de **Q**, **R** se calculara una cantidad de eventos la cual está determinada por la variable **diasASimular**.

Para cada evento se lleva a cabo los siguientes cálculos: 

- Si llega una orden se abastece, si no: se actualiza la **listaArticulosEnEspera** si algún cliente alcanza el tiempo de espera máximo.

- Número aleatorio de la demanda junto con su lista de probabilidades para determinar la cantidad de artículos demandados.

- Inventario final y promedio del evento correspondiente.

- De no poder satisfacer la demanda completa se calculara la cantidad faltante, número aleatorio del tiempo de espera y haciendo uso de su tabla de probabilidades se determina cuántos días esperara el cliente por el producto y se agrega en la lista **listaArticulosEnEspera** si el tiempo de espera es distinto de 0.

- Si no hay inventario suficiente y no se ha realizado una orden se genera un numero aleatorio para el tiempo de entrega y haciendo uso de su tabla de probabilidades se determina en cuantos días llegara el pedido.

Todos estos cálculos se guardan en una lista llamada **EventosPorQ_R**, al finalizar la cantidad de eventos a simular se calcula el costo total.

Finalmente la lista **EventosPorQ_R** y sus costos se guardan dentro de una lista llamada **tablaDeEventos** consiguiendo así una lista con todas las tablas y los costos de cada una para cada combinación de los valores **Q** y **R** pertenecientes a sus rangos.

### Fase 3 - Visualización de resultado :chart_with_upwards_trend:

La última fase es la de visualización de resultados, en ella se mostraran los resultados para la combinación de **Q** y **R** que se seleccione haciendo uso de la lista de resultados, adicionalmente el programa indicara cual es la combinación de estos dos parámetros que genero el costo total más bajo, es decir la solución óptima para la simulación de inventario. 

 ##Ejecutar proyecto :wrench:

**Paso 1**: Se presiona el botón de iniciar para comenzar a cargar los datos que se requieren para la simulación.

En esta ventana se ingresaran la distribución de probabilidades de demanda, hay disponibles tres maneras de ingresar los datos para comodidad del usuario y una opción para crear un archivo por defecto.

- Crear nuevo archivo: abre un bloc de notas que permite crear un archivo por defecto en donde podrá colocar las probabilidades con el siguiente formato “demanda;probabilidad” donde demanda es la cantidad de artículos demandados  y la probabilidad es la posibilidad de que ocurra ( 0 < probabilidad < 1 ).

- Cargar archivo: Esta opción selecciona el archivo por defecto y muestra los valores la distribución de probabilidades que la aplicación está seleccionando.

- Seleccionar archivo: Abre un selector de archivos para buscar el nombre del archivo que se desea seleccionar, una vez seleccionado abre un bloc de notas donde muestra la distribución de probabilidades seleccionada que contiene el archivo.

- Cargar datos manualmente: despliega una ventana que permite cargar los datos uno por uno colocando en demanda la cantidad de artículos a demandar y en probabilidad su respectiva posibilidad ocurrencia. Luego simplemente se oprime continuar.

Una vez que se lleve a cabo uno de las opciones que cargan los datos se oprime el botón de continuar, la aplicación verificara si se cargaron datos y si la suma de probabilidades de los datos cargados da como resultado 1, de no ser así mostrara los mensajes de error que correspondan.

**Paso 2**: De manera análoga se cargan las distribuciones de tiempo de entrega y tiempo de espera con los formatos `tiempo de entrega;probabilidad` y `tiempo de espera;probabilidad` respectivamente.

**Paso 3:** de manera similar se cargan los datos de los costos así como también los días a simular y el inventario inicial.

La forma de cargar los datos básicamente es la misma que en las ventanas anteriores, lo único que varía es el formato de los datos a ingresar, se remplaza `Costo` por el valor de los costos en el bloc de notas ejemplo:

Costo de inventario=`Costo` $/unidad/año
Costo de ordenar=`Costo` $/orden
Costo de faltante con espera de cliente= `Costo` $/unidad
Costo de faltante sin espera de cliente=`Costo` $/unidad
Inventario inicial=`Cantidad` unidad
Cantidad de días a simular==`Cantidad`Día

**Paso 4**: una vez ingresados todos los datos requeridos se desplegara una ventana con las opciones de simulación normal y modelo matemático.

Seleccionamos simulación normal o modelo matemático (Otra forma de hacer la simulación en donde los rangos de Q y R son más pequeños) y a continuación se desplegara una ventana que nos permitirá visualizar los resultados de la simulación así como también los parámetros utilizados.

Adicionalmente con los sliders se puedes observar las tablas de eventos para cada combinación de Q, R y el botón cambiar costos permite cambiar los parámetros para la simulación sin la necesidad de cerrar el programa.

## Author :black_nib:

@monicodev
