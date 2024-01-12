package Servicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class operativaImplementacion implements operativaInterfaz {
	
	Scanner comunicacionTeclado = new Scanner(System.in);

	
	List<Integer>  listaNumeros = new ArrayList<Integer>();

	int numeroCliente;
	public void solicitarNumeros( List<Integer>  listaNumeros) {
		
		System.out.println("Inserte los numeros que quiera guardar ");
		numeroCliente=comunicacionTeclado.nextInt();
		
		listaNumeros.add(numeroCliente);
		
		
	}
	public void mostrarListaClientes(List<Integer>  listaNumeros) {
		
		for(Object numero : listaNumeros){
			System.out.println(numero);
		}
		
	}
	
	public void intercambioDeNumeros(List<Integer>  listaNumeros) {
		int aux =listaNumeros.get(2);
		
		listaNumeros.set(2,listaNumeros.get(4));
		listaNumeros.set(4,listaNumeros.get(aux));
	}
	
	public void mostrarListaClientesConBucleFor(List<Integer>  listaNumeros) {
		
		for (int i = 0; i < listaNumeros.size(); i++) {
			
			  System.out.println(listaNumeros.get(i));
			  
			
	}
	
	
	}
}
