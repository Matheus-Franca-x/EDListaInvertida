package view;

import model.ListaInt;

public class Main {

	public static void main(String[] args)
	{
		ListaInt l = new ListaInt();
		
		int[] vet = {3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16};
		
		int tam = vet.length;
		System.out.println(tam + "\n");
		
		l.addFirst(vet[0]);
		System.out.println(vet[0]);
		
		for(int i = 1; i < tam; i++) //add vet na fila
		{
			try {
				System.out.println(vet[i]);
				l.addLast(vet[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < tam; i++) //inverte fila
		{
			try {
				l.addFirst(l.get(i));
				l.remove(i+1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
		for(int i = 0; i < tam; i++) //print fila invertida
		{
			
			try {
				System.out.println(l.get(0));
				l.removeFirst();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
