# alquilerbicicleta
primer comit
el modelado de este sistema, tiene 4 paquetes:
1- alquilerbicicleta.com.entity  declaro las entidade Clases.
2- alquilerbicicleta.com.servicesDao: declaro las interfaces de los DAO's.
3- alquilerbicicleta.com.servicesDaoImpl: usando clases que implementan las interfaces de lógica de negocio.
4- alquilerbicicleta.com.util: usande como clases de apoyo.
6- alquilerbicicleta.com.test: usando para Testeo Unitario Automático con el Framework adoptado para estas pruebas (JUnit).

Como Probar el Sistema? 
1- descargar el Proyecto e Importarlo en un Eclipse, asegurandose que tenga JDK.8 intalado.
2-compilarlo, que se compile sin error.
3- Abrir el proyecto ir a la sigueiente paquete alquilerbicicleta.com.test:
Selecciona:  BicicletasAlquiladoTest->Click Derecho->Run As->Junit Test se debe ejecutar 
todos los tess que llevan acabo a la solucion requerida.
4- como validar los casos de prueba: debe irse en paquete:alquilerbicicleta.com.servicesDaoImpl -->BicicletasAlquiladoServicesDaoImpl.java -> en esta clase, setea el tipo de alquiler que quiere probar H,D,S:por horas,dias y semanas. en la linea 22.
debe setear 
1-el tipo de Alquiler.
NB:para probar los tests debe setear un tipos de alquiler son tres:H,D,S --: por horas,dias y semanas;
		alq.setTipoDeAlquler("H"); //Setear un tipo  H,D,S de Alquiler
2- Tambien debe setear totalBicicletasAlquilado el test esta valido para un total de 1,2,3,4, hasta 5 bicicletas.
alq.setTotalBicicletasAlquilado(3);//se puede setear de 1,2,3,4, hasta 5 Bicicletas, la cantidad.
Muchas Gracias!


