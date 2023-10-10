//Camos a usar clases abstractas para evitar la instancia de objetos que no necesito (generalmente son objetos muy abstractos, como Persona, Figura, Transporte, Animal, Comida, Arte, Operaciones Matemáticas, Lecturas, Ropa, Plantas, Paises, etc).


package Figura;

//Utilizando clases abstractas, evitamos las instancias no necesarias

//Para que una clase se vuelva abstracta, usamos la palabra reservada abstract antes de class
public abstract class Figura {
	
	//Declaramos un método abstracto (no tiene cuerpo)
	//Método abstracto que nos dice QUE TENEMOS QUE HACER, pero NO NOS DICE EL CÓMO
	public abstract double calcularArea();
	

}//class

/*
 * NOTA: Las clases abstractas pierden la capacidad de instanciar.
 * Una clase abstracta, necesita sí o sí métodos abstractos. 
 * 
 * Cuando usamos clases abstractas, estamos comprometidos u obligados a utilizar todos los métodos abstractos
 */

