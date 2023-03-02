# Calculadora CORBA

Implementación de Middleware con Funciones Remotas

He añadido a la calculadora el de cambio de MPH a KMH, el calculo del iva de un producto y el calculo de la raiz cuadrada

# Para ejecutar la calculadora:

Comandos en orden :
 idlj -fall  Calculadora.idl
javac *.java MCalculadora/*.java

(abrir 3 terminales)
terminal 1:
tnameserv -ORBInitialPort 2000

terminal 2:
java CalcServer -ORBInitialHost localhost -ORBInitialPort 2000

terminal 3:
java CalcClient -ORBInitialHost localhost -ORBInitialPort 2000