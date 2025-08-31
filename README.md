
# Proyecto: Sistema de Cálculo de Despacho - Distribuidora de Alimentos

## Descripción del Proyecto
Este proyecto corresponde al desarrollo de una aplicación en **Java** que permite calcular automáticamente el costo de despacho de productos de una distribuidora de alimentos, según las reglas de negocio establecidas por la empresa.  

El sistema permite registrar los datos básicos de un vehículo y calcular el costo de envío a domicilio de acuerdo con el monto de compra y la distancia recorrida.  

---

## Reglas de Negocio
1. Si la compra es **mayor o igual a $50,000**, el despacho es **gratis** dentro de un radio de 20 km.  
2. Si la compra está entre **$25,000 y $49,999**, el costo es de **$150 por kilómetro** recorrido.  
3. Si la compra es **menor a $25,000**, el costo es de **$300 por kilómetro** recorrido.  

---

## Requerimientos

### ✅ Requerimientos Funcionales
- Permitir la entrada de datos del vehículo:  
  - Marca  
  - Modelo  
  - Cilindrada  
  - Tipo de combustible  
  - Capacidad en pasajeros  
- Solicitar datos de compra y distancia al cliente.  
- Calcular el costo de despacho según las reglas de negocio.  
- Mostrar los resultados en consola.  

### ❌ Requerimientos No Funcionales
- Lenguaje: **Java (JDK 17 o superior recomendado)**.  
- Entrada y salida de datos mediante **consola** (`Scanner` y `System.out`).  
- El sistema debe ejecutarse en **línea de comandos (cmd o terminal)**.  
- Documentación y control de versiones gestionados mediante **GitHub**.  

---

## Historias de Usuario

### Historia 1: Registro de datos del vehículo
**Como** usuario,  
**quiero** ingresar los datos de mi vehículo,  
**para** que el sistema muestre en pantalla la información ingresada.

### Historia 2: Calcular costo de despacho
**Como** cliente,  
**quiero** ingresar el monto de mi compra y la distancia,  
**para** que el sistema calcule automáticamente el costo del despacho.

### Historia 3: Visualización de resultados
**Como** cliente,  
**quiero** ver el detalle del cálculo del despacho,  
**para** saber si tengo despacho gratis o cuánto debo pagar.  

---

## Cronograma Inicial

| Semana | Actividad |
|--------|-----------|
| 1 | Definición de requerimientos y reglas de negocio |
| 2 | Desarrollo del código base en Java |
| 3 | Pruebas de ejecución y depuración |
| 4 | Documentación del proyecto en GitHub |
| 5 | Entrega final del sistema con README, historias de usuario y requerimientos |

---

## Ejecución del Proyecto

1. Guardar el archivo como `Distribuidora.java`.
2. Compilar desde la terminal:  
   ```bash
   javac Distribuidora.java

