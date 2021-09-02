package ejDistancias;

import java.util.Scanner;

public class SistemaCiudades {
	//
	// En un trayecto entre dos ciudades se deben realizar paradas intermedias.
	// Se desea conocer cuantas paradas
	// se van a realizar en el viaje y la longitud de los trayectos en kilometros.
	// Se desea conocer la longitud
	// promedio entre ciudades y
	// cuales son las paradas mas cercanas
	// inicio
	// *------- * ---------------- * ----- * ----------- *
	// ...40........ 100.............. 15....... 60

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de distancia de ciudades");
		System.out.println();
		System.out.println("Ingrese cantidad de ciudades intermedias: ");
		int cantidadCiudades = sc.nextInt();
		int distancias[] = new int[cantidadCiudades];
		int totalKm = 0;
		for (int i = 0; i < distancias.length; i++) {
			// String mensajeCiudad = String.format("Ingrese la distancia de la ciudad %s en
			// km", "" + (i + 1));
			String mensajeCiudad = String.format("Ingrese la distancia de la ciudad %s en km:  ", (i + 1));
			System.out.println(mensajeCiudad);
			distancias[i] = sc.nextInt();
			totalKm += distancias[i];
		}

		System.out.println("La distancia promedio entre ciudades es de: " + (totalKm / cantidadCiudades));

		// busqueda de minimo en array
		int posicionMinimo = 0;
		int minimo = distancias[posicionMinimo];
		for (int i = 0; i < distancias.length; i++) {
			if (distancias[i] < minimo) {
				minimo = distancias[i];
				posicionMinimo = i;
			}
		}

		System.out.println("La menor distancia es de kms: " + minimo);
		System.out.println("En la posicion: " + posicionMinimo);

	}
}
