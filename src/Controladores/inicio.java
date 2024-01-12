package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Servicios.operativaImplementacion;
import Servicios.operativaInterfaz;

public class inicio {
	
	operativaInterfaz op = new operativaImplementacion();
	Scanner comunicacionTeclado = new Scanner(System.in);
	List<> listaNumeros = new ArrayList<>;
	
	do {
		op.solicitarNumeros(listaNumeros);
		System.out.println("Quiere insertar otro numero? (s/n) ")
		
		
		
	}while(comunicacionTeclado.next().equals("s"));
	
	op.mostrarListaClientes(listaNumeros);
		
		op.intercambioDeNumeros(  listaNumeros);
		
		op.mostrarListaClientesConBucleFor( listaNumeros);


	

	
	
	
	

}
