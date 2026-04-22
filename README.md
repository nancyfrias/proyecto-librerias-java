# Reto 3 - Librerías de interfaz gráfica en Java

## Descripción
Este proyecto fue desarrollado en Java dentro del entorno **NetBeans** con el objetivo de investigar e implementar distintas librerías de interfaz gráfica. En el proyecto se trabajó con tres librerías:

- **AWT**
- **Swing**
- **SWT**

Cada una de ellas se utilizó para crear una ventana independiente con al menos cinco elementos gráficos, cumpliendo con los requisitos del reto.

## Objetivo
Analizar las características, requerimientos y forma de implementación de diferentes librerías de interfaz gráfica para Java, así como desarrollar un proyecto funcional en NetBeans que muestre su uso práctico.

## Librerías utilizadas

### 1. AWT
AWT (Abstract Window Toolkit) es una librería gráfica básica incluida en Java. Utiliza componentes nativos del sistema operativo.

**Elementos implementados:**
- Label
- Button
- TextField
- Checkbox
- Choice

### 2. Swing
Swing es una librería más avanzada que AWT. Ofrece una mayor variedad de componentes y permite una interfaz más personalizable.

**Elementos implementados:**
- JLabel
- JButton
- JTextField
- JCheckBox
- JComboBox

### 3. SWT
SWT (Standard Widget Toolkit) es una librería desarrollada por Eclipse que utiliza componentes nativos del sistema operativo para construir interfaces gráficas.

**Elementos implementados:**
- Label
- Text
- Button
- CheckBox
- Combo

## Estructura del proyecto
El proyecto contiene las siguientes clases principales:

- `VentanaAWT.java`
- `VentanaSwing.java`
- `VentanaSWT.java`

Cada clase genera una interfaz gráfica independiente para demostrar el uso de la librería correspondiente.

## Requisitos
Para ejecutar este proyecto se requiere:

- **Java JDK 17** o superior
- **Apache NetBeans 17**
- Librería **SWT** agregada manualmente al proyecto (`org.eclipse.swt.win32.win32.x86_64.jar` para Windows 64 bits)

## Ejecución
1. Abrir el proyecto en **Apache NetBeans**.
2. Verificar que la librería **SWT** esté agregada en la sección **Libraries**.
3. Ejecutar cada clase por separado:
   - `VentanaAWT.java`
   - `VentanaSwing.java`
   - `VentanaSWT.java`


## Aprendizajes obtenidos
Durante el desarrollo de este proyecto se logró:
- Comprender la diferencia entre AWT, Swing y SWT.
- Identificar las ventajas y limitaciones de cada librería.
- Implementar interfaces gráficas básicas en Java.
- Desarrollar un proyecto funcional en NetBeans utilizando tres librerías distintas.

## Autor
**Nancy Johana Frías Romero**

